package com.aor.hero.controller.menu;

import com.aor.hero.Game;
import com.aor.hero.controller.Controller;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.arena.ArenaBuilder;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.model.menu.WinMenu;
import com.aor.hero.states.GameState;
import com.aor.hero.states.MainMenuState;

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
