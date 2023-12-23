package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.viewer.menu.MenuViewer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class MenuViewerTest {
    @Test
    void testDrawElements() {
        MainMenu mockMainMenu = mock(MainMenu.class);
        GUI mockGui = mock(GUI.class);

        // Mocking the behavior of MainMenu
        when(mockMainMenu.getNumberEntries()).thenReturn(2);
        when(mockMainMenu.getEntry(anyInt())).thenReturn("Entry");
        when(mockMainMenu.isSelected(anyInt())).thenReturn(true, false);

        MenuViewer menuViewer = new MenuViewer(mockMainMenu);

        assertDoesNotThrow(() -> {
            menuViewer.drawElements(mockGui);

            // Verify that drawText was called on the GUI mock for the menu title with the expected arguments
            verify(mockGui, times(1)).drawText(new Position(50-3, 33), "Menu", "#FFFFFF");

            // Verify that drawText was called on the GUI mock for each entry with the expected arguments
            verify(mockGui, times(1)).drawText(new Position(50-7, 35), "Entry", "#FF0000");
            verify(mockGui, times(1)).drawText(new Position(50, 35), "Entry", "#FFFFFF");

            // Verify that drawImage was called on the GUI mock
            verify(mockGui, times(1)).drawImage(any(Position.class));
        });
    }

    @Test
    void testDrawElements2() {
        // Arrange
        MainMenu mockMainMenu = mock(MainMenu.class);
        when(mockMainMenu.getNumberEntries()).thenReturn(2);
        when(mockMainMenu.getEntry(anyInt())).thenReturn("Entry");
        when(mockMainMenu.isSelected(anyInt())).thenReturn(true, false);

        GUI mockGui = mock(GUI.class);

        // Act
        MenuViewer menuViewer = new MenuViewer(mockMainMenu);
        menuViewer.drawElements(mockGui);

        // Assert
        // Verify that drawText was called on the GUI mock for each entry with the expected arguments
        verify(mockGui, times(1)).drawText(new Position(50 - 3, 33), "Menu", "#FFFFFF");
        verify(mockGui, times(3)).drawText(any(Position.class), anyString(), anyString());

    }

    @Test
    void testDrawElementsWithEntries() {
        // Arrange
        MainMenu mockMainMenu = mock(MainMenu.class);
        List<String> entries = Arrays.asList("Entry1", "Entry2", "Entry3");
        when(mockMainMenu.getNumberEntries()).thenReturn(entries.size());
        when(mockMainMenu.getEntry(anyInt())).thenAnswer(invocation -> entries.get(invocation.getArgument(0)));
        when(mockMainMenu.isSelected(anyInt())).thenReturn(false);

        GUI mockGui = mock(GUI.class);

        // Act
        MenuViewer menuViewer = new MenuViewer(mockMainMenu);
        menuViewer.drawElements(mockGui);

        // Assert
        // Verify that drawText was called on the GUI mock for each entry with the expected arguments
        verify(mockGui, times(1)).drawText(new Position(50 - 3, 33), "Menu", "#FFFFFF");
        verify(mockGui, times(entries.size()+1)).drawText(any(Position.class), anyString(), anyString());

    }
}