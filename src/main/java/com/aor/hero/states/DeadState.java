package com.aor.hero.states;

import com.aor.hero.controller.Controller;
import com.aor.hero.controller.menu.DeadController;
import com.aor.hero.model.menu.DeadMenu;
import com.aor.hero.viewer.Viewer;
import com.aor.hero.viewer.menu.DeadViewer;

public class DeadState extends State<DeadMenu>{
    public DeadState(DeadMenu model) {
        super(model);
    }

    @Override
    protected Viewer<DeadMenu> getViewer() {
        return new DeadViewer(getModel());
    }

    @Override
    protected Controller<DeadMenu> getController() {
        return new DeadController(getModel());
    }
}
