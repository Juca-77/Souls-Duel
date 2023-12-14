package SoulsDuel.states;

import SoulsDuel.controller.Controller;
import SoulsDuel.controller.menu.WinController;
import SoulsDuel.model.menu.WinMenu;
import SoulsDuel.viewer.Viewer;
import SoulsDuel.viewer.menu.WinViewer;

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
