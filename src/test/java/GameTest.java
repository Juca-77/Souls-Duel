
import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.gui.LanternaGUI;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.states.State;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {

    @Test
    void testGameConstructor() {
        assertDoesNotThrow(() -> {
            Game game = new Game();
            assertNotNull(game.getGui());
            assertNotNull(game.getState());
            assertTrue(game.getGui() instanceof LanternaGUI);
            assertTrue(game.getState() instanceof MainMenuState);
        });
    }

    @Test
    void testGuiDimensions() {
        assertDoesNotThrow(() -> {
            Game game = new Game();
            GUI gui = game.getGui();
            assertEquals(100, gui.getWidth());
            assertEquals(70, gui.getHeigth());
        });
    }

    @Test
    void testInitialState() {
        assertDoesNotThrow(() -> {
            Game game = new Game();
            State initialState = game.getState();
            assertTrue(initialState instanceof MainMenuState);

            MainMenuState mainMenuState = (MainMenuState) initialState;
            assertNotNull(mainMenuState.getModel());
            // You might add more specific assertions related to MainMenuState or MainMenu
        });
    }


}