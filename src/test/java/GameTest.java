
import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.gui.LanternaGUI;
import com.aor.hero.states.GameState;
import com.aor.hero.states.MainMenuState;
import com.aor.hero.states.State;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

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