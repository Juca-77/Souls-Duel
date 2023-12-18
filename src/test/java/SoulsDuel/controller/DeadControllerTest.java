package SoulsDuel.controller;

import SoulsDuel.Game;
import SoulsDuel.controller.menu.DeadController;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.states.GameState;
import SoulsDuel.states.MainMenuState;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

public class DeadControllerTest {

    @Test
    void testStepLeft() throws IOException {
        DeadMenu mockDeadMenu = mock(DeadMenu.class);
        Game mockGame = mock(Game.class);

        DeadController deadController = new DeadController(mockDeadMenu);

        assertDoesNotThrow(() -> {
            deadController.step(mockGame, GUI.ACTION.LEFT, 1000);
            verify(mockDeadMenu, times(1)).previousEntry();
            verifyNoInteractions(mockGame); // No interaction with Game should occur
        });
    }

    @Test
    void testStepRight() throws IOException {
        DeadMenu mockDeadMenu = mock(DeadMenu.class);
        Game mockGame = mock(Game.class);

        DeadController deadController = new DeadController(mockDeadMenu);

        assertDoesNotThrow(() -> {
            deadController.step(mockGame, GUI.ACTION.RIGHT, 1000);
            verify(mockDeadMenu, times(1)).nextEntry();
            verifyNoInteractions(mockGame); // No interaction with Game should occur
        });
    }

    @Test
    void testStepSelectBack() throws IOException {
        DeadMenu mockDeadMenu = mock(DeadMenu.class);
        Game mockGame = mock(Game.class);
        when(mockDeadMenu.isSelectedBack()).thenReturn(true);

        DeadController deadController = new DeadController(mockDeadMenu);

        assertDoesNotThrow(() -> {
            deadController.step(mockGame, GUI.ACTION.SELECT, 1000);
            verify(mockDeadMenu, times(1)).isSelectedBack();
            verify(mockGame, times(1)).setState(any(MainMenuState.class));
        });
    }

    @Test
    void testStepSelectRestart() throws IOException {
        DeadMenu mockDeadMenu = mock(DeadMenu.class);
        Game mockGame = mock(Game.class);
        when(mockDeadMenu.isSelectedRestart()).thenReturn(true);

        DeadController deadController = new DeadController(mockDeadMenu);

        assertDoesNotThrow(() -> {
            deadController.step(mockGame, GUI.ACTION.SELECT, 1000);
            verify(mockDeadMenu, times(1)).isSelectedRestart();
            verify(mockGame, times(1)).setState(any(GameState.class));
        });
    }
}