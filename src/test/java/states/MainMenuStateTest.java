package states;

import com.aor.hero.Game;
import com.aor.hero.controller.menu.MenuController;
import com.aor.hero.gui.GUI;
import com.aor.hero.gui.LanternaGUI;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.states.MainMenuState;
import com.aor.hero.viewer.Music;
import com.aor.hero.viewer.menu.MenuViewer;
import com.googlecode.lanterna.screen.Screen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MainMenuStateTest {
    @Test
    public void testConstructorInitialization() {
        MainMenu model = new MainMenu();
        MainMenuState state = new MainMenuState(model);

        assertEquals(model, state.getModel());
        assertInstanceOf(MenuViewer.class, state.getViewer());
        assertInstanceOf(MenuController.class, state.getController());
    }
    @Test
    public void testgetModel() {
        MainMenu model = new MainMenu();
        MainMenuState state = new MainMenuState(model);

        assertEquals(model, state.getModel());
    }





}
