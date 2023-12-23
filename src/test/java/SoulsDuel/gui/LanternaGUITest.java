package SoulsDuel.gui;

import SoulsDuel.gui.LanternaGUI;
import SoulsDuel.model.Position;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class LanternaGUITest {
    private Screen screen;
    private LanternaGUI gui;
    private TextGraphics tg;

    @BeforeEach
    void setUp() {
        screen = Mockito.mock(Screen.class);
        tg = Mockito.mock(TextGraphics.class);

        when(screen.newTextGraphics()).thenReturn(tg);

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
    @Test
    void drawHeroWithNegativeCoordinates() {
        gui.drawHero(new Position(-1, -1));

        // Verify that the coordinates are adjusted, considering the +1 offset in the drawCharacter method
        verify(tg, Mockito.times(1)).setForegroundColor(new TextColor.RGB(255, 0, 0));
        verify(tg, Mockito.times(1)).putString(-1,0, "+");
    }

    @Test
    public void drawEnemy_Level1_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        int level = 1;
        gui.drawEnemy(position,level);


        verify(tg, Mockito.times(411)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(26,21, "▓");
    }

    @Test
    public void drawEnemy_Level2_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        int level = 2;
        gui.drawEnemy(position,level);


        verify(tg, Mockito.times(537)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(24,22, "░");
    }
    @Test
    public void drawEnemy_Level3_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        int level = 3;
        gui.drawEnemy(position,level);


        verify(tg, Mockito.times(165)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(17,25, "▓");
    }

    @Test
    public void drawEnemy_Level4_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        int level = 4;
        gui.drawEnemy(position,level);


        verify(tg, Mockito.times(570)).setForegroundColor(new TextColor.RGB(255, 255, 255));
        verify(tg, Mockito.times(1)).putString(22,21, "░");
    }

    @Test
    public void drawImage_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        gui.drawImage(position);


        verify(tg, Mockito.times(552)).setForegroundColor(new TextColor.RGB(255, 0, 0));
        verify(tg, Mockito.times(1)).putString(24,21, "▓");
    }

    @Test
    public void drawWin_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        gui.drawWin(position);


        verify(tg, Mockito.times(123)).setForegroundColor(new TextColor.RGB(255, 0, 240));
        verify(tg, Mockito.times(1)).putString(10,21, "▓");
    }

    @Test
    public void drawDead_CallsDrawCharacterCorrectly() {
        Position position = new Position(10, 20);
        gui.drawDead(position);


        verify(tg, Mockito.times(377)).setForegroundColor(new TextColor.RGB(255, 0, 0));
        verify(tg, Mockito.times(1)).putString(22,21, "▓");
    }

    @Test
    void testGetNextAction_Quit() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.EOF));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.QUIT, result);
    }

    @Test
    void testGetNextAction_ArrowUp() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.ArrowUp));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.UP, result);
    }

    @Test
    void testGetNextAction_ArrowDown() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.ArrowDown));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.DOWN, result);
    }

    @Test
    void testGetNextAction_Enter() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.Enter));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.SELECT, result);
    }

    @Test
    void testGetNextAction_NONE() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.Backspace));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.NONE, result);
    }

    @Test
    void testGetNextAction_ArrowLeft() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.ArrowLeft));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.LEFT, result);
    }

    @Test
    void testGetNextAction_ArrowRight() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(new KeyStroke(KeyType.ArrowRight));

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.RIGHT, result);
    }


    @Test
    void testGetNextAction_None() throws IOException {
        // Arrange
        Screen screen = Mockito.mock(Screen.class);
        when(screen.pollInput()).thenReturn(null);

        GUI yourObject = new LanternaGUI(screen);

        // Act
        GUI.ACTION result = yourObject.getNextAction();

        // Assert
        assertEquals(GUI.ACTION.NONE, result);
    }


}