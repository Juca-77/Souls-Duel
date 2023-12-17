package SoulsDuel.gui;

import SoulsDuel.gui.LanternaGUI;
import SoulsDuel.model.Position;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.Mockito.verify;

class LanternaGUITest {
    private Screen screen;
    private LanternaGUI gui;
    private TextGraphics tg;

    @BeforeEach
    void setUp() {
        screen = Mockito.mock(Screen.class);
        tg = Mockito.mock(TextGraphics.class);

        Mockito.when(screen.newTextGraphics()).thenReturn(tg);

        gui = new LanternaGUI(screen);
    }


    @Test
    void drawHero() {
        gui.drawHero(new Position(1, 1));

        verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 0, 0));
        verify(tg, Mockito.times(1)).putString(1, 2, "+");
    }

    @Test
    void drawText() {
        gui.drawText(new Position(1, 1), "Hello World", "#336699");

        verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(51, 102, 153));
        verify(tg, Mockito.times(1)).putString(1, 1, "Hello World");
    }




    @Test
    void testClear() {
        gui.clear();

        verify(screen).clear();
    }

    @Test
    void testRefresh() throws IOException {
        gui.refresh();

        verify(screen).refresh();
    }

    @Test
    void testClose() throws IOException {
        gui.close();

        verify(screen).close();
    }
    @Test
    void drawWall() {
        gui.drawWall(new Position(1, 1));

        verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(1, 2, "#");
    }

    @Test
    void testDrawBlade() throws IOException {
        gui.drawBlade(new Position(1, 1));

        verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(1, 2, "@");
    }
    @Test
    void testDrawGrenade() throws IOException {
        gui.drawGrenade(new Position(1, 1));

        verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(1, 2, "*");
    }
}

