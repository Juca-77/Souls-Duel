package SoulsDuel.controller.menu;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.arena.ArenaBuilder;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.states.GameState;
import SoulsDuel.controller.Controller;

import java.io.IOException;

public class MenuController extends Controller<MainMenu> {


    public MenuController(MainMenu model) {
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
                if (getModel().isSelectedExit()) game.setState(null);
                if (getModel().isSelectedStart()) game.setState(new GameState(new ArenaBuilder(1, 100,70).createArena())); //change in menu controller from Game
        }
    }
}
