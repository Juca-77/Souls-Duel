package com.aor.hero.controller.game;

import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.viewer.Music;

public class SoulController extends GameController {
    private static final double MOVEMENT_SPEED = 0.1; // Adjust the speed as needed
    private long lastUpdateTime = System.currentTimeMillis();

    private Music damage = new Music("damage_sound.wav");

    public SoulController(Arena arena) {
        super(arena);
    }

    public Music getDamage() {
        return damage;
    }

    public void moveSoul(Position position) {
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
        if (action == GUI.ACTION.UP) moveSoulUp();
        if (action == GUI.ACTION.RIGHT) moveSoulRight();
        if (action == GUI.ACTION.DOWN) moveSoulDown();
        if (action == GUI.ACTION.LEFT) moveSoulLeft();
    }

    public void moveSoulLeft() {
        moveSoul(getModel().getHero().getPosition().getLeft());
    }

    public void moveSoulRight() {
        moveSoul(getModel().getHero().getPosition().getRight());
    }

    public void moveSoulUp() {
        moveSoul(getModel().getHero().getPosition().getUp());
    }

    public void moveSoulDown() {
        moveSoul(getModel().getHero().getPosition().getDown());
    }




}
