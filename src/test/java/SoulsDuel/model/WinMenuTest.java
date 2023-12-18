package SoulsDuel.model;

import SoulsDuel.model.menu.WinMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class WinMenuTest {
    @Test
    void testNextEntry() {
        WinMenu winMenu = new WinMenu();

        assertDoesNotThrow(() -> {
            int initialEntry = winMenu.getCurrentEntry();
            winMenu.nextEntry();
            assertEquals((initialEntry + 1) % winMenu.getNumberEntries(), winMenu.getCurrentEntry());
        });
    }

    @Test
    void testPreviousEntry() {
        WinMenu winMenu = new WinMenu();

        assertDoesNotThrow(() -> {
            int initialEntry = winMenu.getCurrentEntry();
            winMenu.previousEntry();
            assertEquals((initialEntry - 1 + winMenu.getNumberEntries()) % winMenu.getNumberEntries(), winMenu.getCurrentEntry());
        });
    }



    @Test
    void testGetEntry() {
        WinMenu winMenu = new WinMenu();

        assertDoesNotThrow(() -> {
            assertEquals("Back", winMenu.getEntry(0));
        });
    }

    @Test
    void testGetNumberEntries() {
        WinMenu winMenu = new WinMenu();

        assertDoesNotThrow(() -> {
            assertEquals(1, winMenu.getNumberEntries());
        });
    }
    @Test
    void testIsSelected() {
        WinMenu winMenu = new WinMenu();

        assertDoesNotThrow(() -> {
            assertTrue(winMenu.isSelectedBack());

            winMenu.nextEntry();

            assertTrue(winMenu.isSelectedBack());
        });
    }

}