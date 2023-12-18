package SoulsDuel.states;

import SoulsDuel.controller.menu.MenuController;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.viewer.menu.MenuViewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainMenuStateTest {
    @Test
    public void testConstructorInitialization() {
        MainMenu model = new MainMenu();
        MainMenuState state = new MainMenuState(model);

        assertEquals(model, state.getModel());
        assertInstanceOf(MenuViewer.class, state.getViewer());
        assertInstanceOf(MenuController.class, state.getController());
    }
    @Test
    public void testgetModel() {
        MainMenu model = new MainMenu();
        MainMenuState state = new MainMenuState(model);

        assertEquals(model, state.getModel());
    }





}