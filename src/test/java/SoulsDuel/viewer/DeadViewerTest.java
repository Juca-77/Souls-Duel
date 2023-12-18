package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.viewer.menu.DeadViewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

public class DeadViewerTest {
    @Test
    void testDrawElements() {
        DeadMenu mockDeadMenu = mock(DeadMenu.class);
        GUI mockGui = mock(GUI.class);

        // Mocking the behavior of DeadMenu
        when(mockDeadMenu.getNumberEntries()).thenReturn(2);
        when(mockDeadMenu.getEntry(anyInt())).thenReturn("Entry");
        when(mockDeadMenu.isSelected(anyInt())).thenReturn(true, false);

        DeadViewer deadViewer = new DeadViewer(mockDeadMenu);

        assertDoesNotThrow(() -> {
            deadViewer.drawElements(mockGui);

            // Verify that drawText was called on the GUI mock for each entry with the expected arguments
            verify(mockGui, times(1)).drawText(new Position(51-8, 42), "Entry", "#FF0000");
            verify(mockGui, times(1)).drawText(new Position(51, 42), "Entry", "#FFFFFF");

            // Verify that drawDead was called on the GUI mock
            verify(mockGui, times(1)).drawDead(new Position(16, 20));
        });
    }
}