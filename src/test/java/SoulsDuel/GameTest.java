package SoulsDuel;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.gui.LanternaGUI;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.states.State;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    private Screen screen;
    private LanternaGUI gui;
    private TextGraphics tg;
    @BeforeEach
    void setUp() {
        screen = Mockito.mock(Screen.class);
        tg = Mockito.mock(TextGraphics.class);

        Mockito.when(screen.newTextGraphics()).thenReturn(tg);

        gui = new LanternaGUI(screen);
    }


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
            gui = (LanternaGUI) game.getGui();
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