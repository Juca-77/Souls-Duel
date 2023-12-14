package com.aor.hero.states;

import com.aor.hero.controller.Controller;
import com.aor.hero.controller.menu.MenuController;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.viewer.Viewer;
import com.aor.hero.viewer.menu.MenuViewer;

public class MainMenuState extends State<MainMenu> {
    public MainMenuState(MainMenu model) {
        super(model);
    }

    @Override
    public Viewer<MainMenu> getViewer() {
        return new MenuViewer(getModel());
    }

    @Override
    public Controller<MainMenu> getController() {
        return new MenuController(getModel());
    }
}
