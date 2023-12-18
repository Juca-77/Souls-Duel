package SoulsDuel.controller.game;

import SoulsDuel.viewer.Music;
import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;

public class SoulController extends GameController {

    private Music damage = new Music("sounds/damage_sound.wav");

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
