package SoulsDuel.controller.menu;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.model.menu.WinMenu;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.controller.Controller;

import java.io.IOException;

public class WinController extends Controller<WinMenu> {
    public WinController(WinMenu model) {
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
        }
    }
}
