package SoulsDuel.states;

import SoulsDuel.controller.game.GameController;
import SoulsDuel.controller.menu.MenuController;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.viewer.game.GameViewer;
import SoulsDuel.viewer.menu.MenuViewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class GameStateTest {
    @Test
    public void testConstructorInitialization() {
        Arena model = new Arena(100,70,1);
        GameState state = new GameState(model);

        assertEquals(model, state.getModel());
        assertInstanceOf(GameViewer.class, state.getViewer());
        assertInstanceOf(GameController.class, state.getController());
    }
    @Test
    public void testgetModel() {
        Arena model = new Arena(100,70,1);
        GameState state = new GameState(model);

        assertEquals(model, state.getModel());
    }
}
