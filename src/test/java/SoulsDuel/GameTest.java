package SoulsDuel;


import SoulsDuel.gui.GUI;
import SoulsDuel.gui.LanternaGUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.states.State;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class GameTest {/*



    private Game game;
    private GUI stubGui;
    @BeforeEach
    void setUp() throws IOException, FontFormatException, URISyntaxException {
        // Use the stub GUI implementation for testing
        game = new Game();
        LanternaGUI stubGui = mock(LanternaGUI.class);
        game.setGui(stubGui);
    }

    @Test
    void testSetState() {
        // Arrange
        State newState = new MainMenuState(new MainMenu());

        // Act
        game.setState(newState);

        // Assert
        assertEquals(newState, game.getState());
    }

    @Test
    void testGetState() {
        // Arrange
        State mockState = new MainMenuState(new MainMenu());
        // Set a mock State in the game
        game.setState(mockState);

        // Act
        State resultState = game.getState();

        // Assert
        assertEquals(mockState, resultState);
    }*/
}
