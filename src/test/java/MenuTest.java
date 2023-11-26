import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.*;

public class MenuTest {

    private Menu menu;
    private MenuModel menuModel;
    private MenuController menuController;

    @BeforeEach
    public void setUp() {
        menuModel = mock(MenuModel.class);
        menuController = new MenuController(menuModel);
        menu = new Menu(menuController);
        menu.addOption("Start Game");
        menu.addOption("Options");
        menu.addOption("Quit");
    }

    @Test
    public void menuInitializationTest() {
        Assertions.assertEquals(0, menu.getSelectedIndex());
        Assertions.assertEquals(3, menu.getOptions().size());
    }

    @Test
    public void selectNextOptionTest() {
        menu.selectNextOption();
        Assertions.assertEquals(1, menu.getSelectedIndex());
    }

    @Test
    public void selectPreviousOptionTest() {
        menu.setSelectedIndex(2);
        menu.selectPreviousOption();
        Assertions.assertEquals(1, menu.getSelectedIndex());
    }


    @Test
    public void executeSelectedOptionTest() throws IOException, InterruptedException {
        // Mock the menu controller's processKey method to simulate Enter key press
        KeyStroke keyStroke = mock(KeyStroke.class);
        when(keyStroke.getKeyType()).thenReturn(KeyType.Enter);
        // Set the selected index to a known value
        menu.setSelectedIndex(1);
        // Execute the selected option
        menu.processKey(keyStroke);
        // Verify that the corresponding method in the menu model is called
        verify(menuModel, times(1)).executeOption(1);
    }
}