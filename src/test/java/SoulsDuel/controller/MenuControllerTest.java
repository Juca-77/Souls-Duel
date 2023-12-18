package SoulsDuel.controller;

import SoulsDuel.Game;
import SoulsDuel.controller.menu.MenuController;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.states.GameState;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

public class MenuControllerTest {
    @Test
    void testStepLeft() throws IOException {
        MainMenu mockMainMenu = mock(MainMenu.class);
        Game mockGame = mock(Game.class);

        MenuController menuController = new MenuController(mockMainMenu);

        assertDoesNotThrow(() -> {
            menuController.step(mockGame, GUI.ACTION.LEFT, 1000);
            verify(mockMainMenu, times(1)).previousEntry();
            verifyNoInteractions(mockGame); // No interaction with Game should occur
        });
    }

    @Test
    void testStepRight() throws IOException {
        MainMenu mockMainMenu = mock(MainMenu.class);
        Game mockGame = mock(Game.class);

        MenuController menuController = new MenuController(mockMainMenu);

        assertDoesNotThrow(() -> {
            menuController.step(mockGame, GUI.ACTION.RIGHT, 1000);
            verify(mockMainMenu, times(1)).nextEntry();
            verifyNoInteractions(mockGame); // No interaction with Game should occur
        });
    }

    @Test
    void testStepSelectExit() throws IOException {
        MainMenu mockMainMenu = mock(MainMenu.class);
        Game mockGame = mock(Game.class);
        when(mockMainMenu.isSelectedExit()).thenReturn(true);

        MenuController menuController = new MenuController(mockMainMenu);

        assertDoesNotThrow(() -> {
            menuController.step(mockGame, GUI.ACTION.SELECT, 1000);
            verify(mockMainMenu, times(1)).isSelectedExit();
            verify(mockGame, times(1)).setState(null);
        });
    }

    @Test
    void testStepSelectStart() throws IOException {
        MainMenu mockMainMenu = mock(MainMenu.class);
        Game mockGame = mock(Game.class);
        when(mockMainMenu.isSelectedStart()).thenReturn(true);

        MenuController menuController = new MenuController(mockMainMenu);

        assertDoesNotThrow(() -> {
            menuController.step(mockGame, GUI.ACTION.SELECT, 1000);
            verify(mockMainMenu, times(1)).isSelectedStart();
            verify(mockGame, times(1)).setState(any(GameState.class));
        });
    }
}