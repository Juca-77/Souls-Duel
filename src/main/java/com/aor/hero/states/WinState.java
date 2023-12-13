package com.aor.hero.states;

import com.aor.hero.controller.Controller;
import com.aor.hero.controller.menu.WinController;
import com.aor.hero.model.menu.WinMenu;
import com.aor.hero.viewer.Viewer;
import com.aor.hero.viewer.menu.WinViewer;

public class WinState extends State<WinMenu>{

    public WinState(WinMenu model) {
        super(model);
    }

    @Override
    protected Viewer<WinMenu> getViewer() {
        return new WinViewer(getModel());
    }

    @Override
    protected Controller<WinMenu> getController() {
        return new WinController(getModel());
    }
}
