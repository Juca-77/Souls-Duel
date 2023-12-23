package SoulsDuel.model;

import SoulsDuel.model.menu.MainMenu;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainMenuTest {
    @Test
    void testNextEntry() {
        MainMenu mainMenu = new MainMenu();

        // Initially, currentEntry should be 0
        assertEquals(0, mainMenu.getCurrentEntry());

        // Calling nextEntry once, currentEntry should be 1
        mainMenu.nextEntry();
        assertEquals(1, mainMenu.getCurrentEntry());

        for (int i = 2; i < mainMenu.getNumberEntries(); i++) {
            mainMenu.nextEntry();
            assertEquals(i, mainMenu.getCurrentEntry());
        }

        mainMenu.nextEntry();
        assertEquals(0, mainMenu.getCurrentEntry());
    }

    @Test
    void testPreviousEntry() {
        MainMenu mainMenu = new MainMenu();

        assertDoesNotThrow(() -> {
            int initialEntry = mainMenu.getCurrentEntry();
            mainMenu.previousEntry();
            assertEquals((initialEntry - 1 + mainMenu.getNumberEntries()) % mainMenu.getNumberEntries(), mainMenu.getCurrentEntry());
        });
    }

    @Test
    void testIsSelected() {
        MainMenu mainMenu = new MainMenu();

        assertDoesNotThrow(() -> {
            assertTrue(mainMenu.isSelectedStart());
            assertFalse(mainMenu.isSelectedExit());

            mainMenu.nextEntry();

            assertFalse(mainMenu.isSelectedStart());
            assertTrue(mainMenu.isSelectedExit());
        });
    }

    @Test
    void testGetEntry() {
        MainMenu mainMenu = new MainMenu();

        assertDoesNotThrow(() -> {
            assertEquals("Start", mainMenu.getEntry(0));
            assertEquals("Exit", mainMenu.getEntry(1));
        });
    }

    @Test
    void testGetNumberEntries() {
        MainMenu mainMenu = new MainMenu();

        assertDoesNotThrow(() -> {
            assertEquals(2, mainMenu.getNumberEntries());
        });
    }
    @Test
    void testInitialCurrentEntry() {
        MainMenu mainMenu = new MainMenu();

        // Verify that currentEntry is initially set to 0
        assertEquals(0, mainMenu.getCurrentEntry());
    }

}