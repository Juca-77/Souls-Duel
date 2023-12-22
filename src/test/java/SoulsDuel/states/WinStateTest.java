package SoulsDuel.states;

import SoulsDuel.controller.menu.DeadController;
import SoulsDuel.controller.menu.WinController;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.model.menu.WinMenu;
import SoulsDuel.viewer.Viewer;
import SoulsDuel.viewer.menu.DeadViewer;
import SoulsDuel.viewer.menu.WinViewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class WinStateTest {

    @Test
    public void testConstructorInitialization() {
        WinMenu model = new WinMenu();
        WinState state = new WinState(model);

        assertEquals(model, state.getModel());
        assertInstanceOf(WinViewer.class, state.getViewer());
        assertInstanceOf(WinController.class, state.getController());
    }
    @Test
    public void testgetModel() {
        WinMenu model = new WinMenu();
        WinState state = new WinState(model);

        assertEquals(model, state.getModel());
    }
}
