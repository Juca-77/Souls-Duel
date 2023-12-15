package SoulsDuel.states;

import SoulsDuel.controller.Controller;
import SoulsDuel.controller.menu.MenuController;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.viewer.Viewer;
import SoulsDuel.viewer.menu.MenuViewer;

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
