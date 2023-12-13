package com.aor.hero.controller.menu;

import com.aor.hero.Game;
import com.aor.hero.controller.Controller;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.arena.ArenaBuilder;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.states.GameState;

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
