package SoulsDuel.states;

import SoulsDuel.controller.game.GameController;
import SoulsDuel.controller.menu.DeadController;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.viewer.game.GameViewer;
import SoulsDuel.viewer.menu.DeadViewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class DeadStateTest {
    @Test
    public void testConstructorInitialization() {
        DeadMenu model = new DeadMenu();
        DeadState state = new DeadState(model);

        assertEquals(model, state.getModel());
        assertInstanceOf(DeadViewer.class, state.getViewer());
        assertInstanceOf(DeadController.class, state.getController());
    }
    @Test
    public void testgetModel() {
        DeadMenu model = new DeadMenu();
        DeadState state = new DeadState(model);

        assertEquals(model, state.getModel());
    }
}
