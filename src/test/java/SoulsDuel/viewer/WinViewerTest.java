package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.model.menu.WinMenu;
import SoulsDuel.viewer.menu.MenuViewer;
import SoulsDuel.viewer.menu.WinViewer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.Mockito.*;

public class WinViewerTest {
    @Test
    void testDrawElements() {
        WinMenu mockWinMenu = mock(WinMenu.class);
        GUI mockGui = mock(GUI.class);

        // Mocking the behavior of WinMenu
        when(mockWinMenu.getNumberEntries()).thenReturn(1);
        when(mockWinMenu.getEntry(0)).thenReturn("Back");
        when(mockWinMenu.isSelected(0)).thenReturn(true);

        WinViewer winViewer = new WinViewer(mockWinMenu);

        assertDoesNotThrow(() -> {
            winViewer.drawElements(mockGui);

            // Verify that drawWin was called on the GUI mock with the expected arguments
            verify(mockGui, times(1)).drawWin(new Position(49-23, 25));

            // Verify that drawText was called on the GUI mock for the entry with the expected arguments
            verify(mockGui, times(1)).drawText(any(Position.class), eq("Back"), eq("#FF0000"));
        });
    }

    @Test
    void testDrawElementsWithEntries() {
        // Arrange
        WinMenu mockWinMenu = mock(WinMenu.class);
        List<String> entries = Arrays.asList("Entry1", "Entry2", "Entry3");
        when(mockWinMenu.getNumberEntries()).thenReturn(entries.size());
        when(mockWinMenu.getEntry(anyInt())).thenAnswer(invocation -> entries.get(invocation.getArgument(0)));
        when(mockWinMenu.isSelected(anyInt())).thenReturn(false);

        GUI mockGui = mock(GUI.class);

        // Act
        WinViewer WinViewer = new WinViewer(mockWinMenu);
        WinViewer.drawElements(mockGui);

        // Assert
        // Verify that drawText was called on the GUI mock for each entry with the expected arguments

        verify(mockGui, times(entries.size())).drawText(any(Position.class), anyString(), anyString());

    }
}