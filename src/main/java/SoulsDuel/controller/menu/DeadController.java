package SoulsDuel.controller.menu;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.arena.ArenaBuilder;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.states.GameState;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.controller.Controller;

import java.io.IOException;

public class DeadController extends Controller<DeadMenu> {
    public DeadController(DeadMenu model) {
        super(model);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        switch (action) {
            case LEFT:
                getModel().previousEntry();
                break;
            case RIGHT:
                getModel().nextEntry();
                break;
            case SELECT:
                if (getModel().isSelectedBack()) game.setState(new MainMenuState(new MainMenu()));
                if (getModel().isSelectedRestart()) game.setState(new GameState(new ArenaBuilder(1, 100,70).createArena())); //change in menu controller from Game
        }
    }
}
