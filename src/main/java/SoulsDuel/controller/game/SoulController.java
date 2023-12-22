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
            getModel().getSoul().setPosition(position);
            if (getModel().isBlade(position)) {
                getModel().getSoul().decreaseHP();
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
        moveSoul(getModel().getSoul().getPosition().getLeft());
    }

    public void moveSoulRight() {
        moveSoul(getModel().getSoul().getPosition().getRight());
    }

    public void moveSoulUp() {
        moveSoul(getModel().getSoul().getPosition().getUp());
    }

    public void moveSoulDown() {
        moveSoul(getModel().getSoul().getPosition().getDown());
    }


    public void setDamage(Music damage) {
        this.damage = damage;
    }

}
