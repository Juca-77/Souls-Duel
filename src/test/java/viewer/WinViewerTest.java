package viewer;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.menu.WinMenu;
import com.aor.hero.viewer.menu.WinViewer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.mockito.ArgumentMatchers.anyInt;
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
}
