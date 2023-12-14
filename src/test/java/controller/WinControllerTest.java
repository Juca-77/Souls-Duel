package controller;

import com.aor.hero.Game;
import com.aor.hero.controller.menu.WinController;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.menu.WinMenu;
import com.aor.hero.states.MainMenuState;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

public class WinControllerTest {
    @Test
    void testStepLeft() throws IOException {
        WinMenu mockWinMenu = mock(WinMenu.class);
        Game mockGame = mock(Game.class);

        WinController winController = new WinController(mockWinMenu);

        assertDoesNotThrow(() -> {
            winController.step(mockGame, GUI.ACTION.LEFT, 1000);
            verify(mockWinMenu, times(1)).previousEntry();
            verifyNoInteractions(mockGame); // No interaction with Game should occur
        });
    }

    @Test
    void testStepRight() throws IOException {
        WinMenu mockWinMenu = mock(WinMenu.class);
        Game mockGame = mock(Game.class);

        WinController winController = new WinController(mockWinMenu);

        assertDoesNotThrow(() -> {
            winController.step(mockGame, GUI.ACTION.RIGHT, 1000);
            verify(mockWinMenu, times(1)).nextEntry();
            verifyNoInteractions(mockGame); // No interaction with Game should occur
        });
    }

    @Test
    void testStepSelectBack() throws IOException {
        WinMenu mockWinMenu = mock(WinMenu.class);
        Game mockGame = mock(Game.class);
        when(mockWinMenu.isSelectedBack()).thenReturn(true);

        WinController winController = new WinController(mockWinMenu);

        assertDoesNotThrow(() -> {
            winController.step(mockGame, GUI.ACTION.SELECT, 1000);
            verify(mockWinMenu, times(1)).isSelectedBack();
            verify(mockGame, times(1)).setState(any(MainMenuState.class));
        });
    }
}
