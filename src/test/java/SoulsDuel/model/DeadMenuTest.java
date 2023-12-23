package SoulsDuel.model;

import SoulsDuel.model.menu.DeadMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DeadMenuTest {

    @Test
    void testNextEntry() {
        DeadMenu deadMenu = new DeadMenu();

        // Initially, currentEntry should be 0
        assertEquals(0, deadMenu.getCurrentEntry());

        // Calling nextEntry once, currentEntry should be 1
        deadMenu.nextEntry();
        assertEquals(1, deadMenu.getCurrentEntry());

        // Calling nextEntry repeatedly until the end of the list
        for (int i = 2; i < deadMenu.getNumberEntries(); i++) {
            deadMenu.nextEntry();
            assertEquals(i, deadMenu.getCurrentEntry());
        }

        deadMenu.nextEntry();
        assertEquals(0, deadMenu.getCurrentEntry());
    }

    @Test
    void testPreviousEntry() {
        DeadMenu deadMenu = new DeadMenu();

        assertDoesNotThrow(() -> {
            int initialEntry = deadMenu.getCurrentEntry();
            deadMenu.previousEntry();
            assertEquals((initialEntry - 1 + deadMenu.getNumberEntries()) % deadMenu.getNumberEntries(), deadMenu.getCurrentEntry());
        });
    }

    @Test
    void testIsSelected() {
        DeadMenu deadMenu = new DeadMenu();

        assertDoesNotThrow(() -> {
            assertTrue(deadMenu.isSelectedRestart());
            assertFalse(deadMenu.isSelectedBack());

            deadMenu.nextEntry();

            assertFalse(deadMenu.isSelectedRestart());
            assertTrue(deadMenu.isSelectedBack());
        });
    }

    @Test
    void testGetEntry() {
        DeadMenu deadMenu = new DeadMenu();

        assertDoesNotThrow(() -> {
            assertEquals("Restart", deadMenu.getEntry(0));
            assertEquals("Back", deadMenu.getEntry(1));
        });
    }

    @Test
    void testGetNumberEntries() {
        DeadMenu deadMenu = new DeadMenu();

        assertDoesNotThrow(() -> {
            assertEquals(2, deadMenu.getNumberEntries());
        });
    }
}