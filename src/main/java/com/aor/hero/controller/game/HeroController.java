package com.aor.hero.controller.game;

import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.viewer.Music;

public class HeroController extends GameController {
    private static final double MOVEMENT_SPEED = 1000.1; // Adjust the speed as needed
    private long lastUpdateTime = System.currentTimeMillis();

    private Music damage = new Music("damage_sound.wav");

    public HeroController(Arena arena) {
        super(arena);
    }


    private void moveHero(Position position) {
        if (getModel().isEmpty(position)) {
            getModel().getHero().setPosition(position);
            if (getModel().isBlade(position)) {
                getModel().getHero().decreaseHP();
                damage.stop();
                damage.startonce();
            }
        }
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) {
        long elapsedTime = time - lastUpdateTime;
        switch (action) {
            case UP:
                moveHeroUp(elapsedTime);
                break;
            case RIGHT:
                moveHeroRight(elapsedTime);
                break;
            case DOWN:
                moveHeroDown(elapsedTime);
                break;
            case LEFT:
                moveHeroLeft(elapsedTime);
                break;
        }

        lastUpdateTime = time;
    }

    private void moveHeroLeft(long elapsedTime) {
        moveHeroSmooth(getModel().getHero().getPosition().getLeft(), elapsedTime);
    }

    private void moveHeroRight(long elapsedTime) {
        moveHeroSmooth(getModel().getHero().getPosition().getRight(), elapsedTime);
    }

    private void moveHeroUp(long elapsedTime) {
        moveHeroSmooth(getModel().getHero().getPosition().getUp(), elapsedTime);
    }

    private void moveHeroDown(long elapsedTime) {
        moveHeroSmooth(getModel().getHero().getPosition().getDown(), elapsedTime);
    }

    private void moveHeroSmooth(Position targetPosition, long elapsedTime) {
        double speed = MOVEMENT_SPEED * elapsedTime;
        double deltaX = targetPosition.getX() - getModel().getHero().getPosition().getX();
        double deltaY = targetPosition.getY() - getModel().getHero().getPosition().getY();
        double distance = Math.sqrt(deltaX * deltaX + deltaY * deltaY);
        if (distance > 0) {
            double factor = Math.min(1, speed / distance);
            double newX = getModel().getHero().getPosition().getX() + factor * deltaX;
            double newY = getModel().getHero().getPosition().getY() + factor * deltaY;

            Position newPosition = new Position((double) newX, (double) newY);
            moveHero(newPosition);
        }
    }
}
