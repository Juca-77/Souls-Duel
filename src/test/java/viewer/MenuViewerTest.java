package viewer;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.viewer.menu.MenuViewer;
import org.junit.jupiter.api.Test;

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
}
