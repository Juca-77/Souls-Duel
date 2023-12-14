package SoulsDuel.states;

import SoulsDuel.controller.Controller;
import SoulsDuel.controller.menu.DeadController;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.viewer.Viewer;
import SoulsDuel.viewer.menu.DeadViewer;

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
