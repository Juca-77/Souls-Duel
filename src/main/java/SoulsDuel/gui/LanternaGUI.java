package SoulsDuel.gui;

import SoulsDuel.model.Position;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.AWTTerminalFontConfiguration;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;



public class LanternaGUI implements GUI {
    private final Screen screen;
    private int width;
    private int heigth;

    public LanternaGUI(Screen screen) {
        this.screen = screen;
    }

    public LanternaGUI(int width, int height) throws IOException, FontFormatException, URISyntaxException {
        AWTTerminalFontConfiguration fontConfig = loadFont();
        this.width=width;
        this.heigth=height;
        Terminal terminal = createTerminal(width, height, fontConfig);
        this.screen = createScreen(terminal);
    }


    private Screen createScreen(Terminal terminal) throws IOException {
        final Screen screen;
        screen = new TerminalScreen(terminal);

        screen.setCursorPosition(null);
        screen.startScreen();
        screen.doResizeIfNecessary();
        return screen;
    }

    Terminal createTerminal(int width, int height, AWTTerminalFontConfiguration fontConfig) throws IOException {
        TerminalSize terminalSize = new TerminalSize(width, height + 1);
        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory()
                .setInitialTerminalSize(terminalSize);
        terminalFactory.setForceAWTOverSwing(true);
        terminalFactory.setTerminalEmulatorFontConfiguration(fontConfig);
        Terminal terminal = terminalFactory.createTerminal();
        return terminal;
    }

    AWTTerminalFontConfiguration loadFont() throws URISyntaxException, FontFormatException, IOException {
        URL resource = getClass().getClassLoader().getResource("fonts/Soulsduel.ttf");
        File fontFile = new File(resource.toURI());
        Font font = Font.createFont(Font.TRUETYPE_FONT, fontFile);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        ge.registerFont(font);

        Font loadedFont = font.deriveFont(Font.PLAIN, 20);
        AWTTerminalFontConfiguration fontConfig = AWTTerminalFontConfiguration.newInstance(loadedFont);
        return fontConfig;
    }

    public ACTION getNextAction() throws IOException {
        KeyStroke keyStroke = screen.pollInput();
        if (keyStroke == null) return ACTION.NONE;

        if (keyStroke.getKeyType() == KeyType.EOF) return ACTION.QUIT;
        if (keyStroke.getKeyType() == KeyType.Character && keyStroke.getCharacter() == 'q') return ACTION.QUIT;

        if (keyStroke.getKeyType() == KeyType.ArrowUp) return ACTION.UP;
        if (keyStroke.getKeyType() == KeyType.ArrowRight) return ACTION.RIGHT;
        if (keyStroke.getKeyType() == KeyType.ArrowDown) return ACTION.DOWN;
        if (keyStroke.getKeyType() == KeyType.ArrowLeft) return ACTION.LEFT;

        if (keyStroke.getKeyType() == KeyType.Enter) return ACTION.SELECT;

        return ACTION.NONE;
    }

    @Override
    public void drawHero(Position position) {
        drawCharacter(position.getX(), position.getY(), '+', "#FF0000");
    }

    @Override
    public void drawEnemy(Position position, int level) {
        if (level == 1) {
            String s =
                    "░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░▓▓▓▓░░░░░░░░░░\n" +
                            "░░░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░\n" +
                            "░░░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░\n" +
                            "░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░\n" +
                            "░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓░░░░▓▓░░░░░░\n" +
                            "░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓░░░░▓▓░░░░░░\n" +
                            "░░░░░░░░▓▓░░░░▓▓▓▓▓▓░░░░▓▓░░░░▓▓▓▓▓▓░░░░▓▓░░░░░░\n" +
                            "░░░░░░░░░░▓▓░░░░░░░░░░▓▓▓▓▓▓░░░░░░░░░░▓▓░░░░░░░░\n" +
                            "░░░░░░░░▓▓▓▓░░▓▓░░░░░░░░░░░░░░░░░░▓▓░░▓▓▓▓░░░░░░\n" +
                            "░░░░░░░░▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓░░░░░░\n" +
                            "░░░░░░░░▓▓░░░░░░▓▓░░▓▓░░▓▓░░▓▓░░▓▓░░░░░░▓▓░░░░░░\n" +
                            "░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓░░░░░░░░\n" +
                            "░░░░░░░░▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓░░░░░░\n" +
                            "░░░░░░▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓░░░░\n" +
                            "░░░░▓▓▓▓░░▓▓░░░░▓▓░░░░░░▓▓░░░░░░▓▓░░░░▓▓░░▓▓▓▓░░\n" +
                            "░░░░▓▓░░░░░░▓▓░░░░▓▓▓▓▓▓░░▓▓▓▓▓▓░░░░▓▓░░░░░░▓▓░░\n" +
                            "░░▓▓░░░░▓▓▓▓░░▓▓▓▓▓▓░░░░▓▓░░░░▓▓▓▓▓▓░░▓▓▓▓░░░░▓▓\n" +
                            "░░▓▓░░░░░░░░▓▓░░░░▓▓░░░░░░░░░░▓▓░░░░▓▓░░░░░░░░▓▓\n" +
                            "░░▓▓░░░░░░░░░░▓▓░░▓▓░░░░░░░░░░▓▓░░▓▓░░░░░░░░░░▓▓\n" +
                            "░░░░▓▓░░░░░░▓▓░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░▓▓░░░░░░▓▓░░\n" +
                            "░░░░░░▓▓▓▓░░▓▓░░░░▓▓░░░░░░░░░░▓▓░░░░▓▓░░▓▓▓▓░░░░\n" +
                            "░░░░░░░░▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓░░░░░░\n" +
                            "░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓░░░░░░░░\n" +
                            "░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░\n";

            String[] wordsArray = s.split("\n");

            for (int i = 0; i < wordsArray.length; i++) {
                for (int j = 0; j < wordsArray[0].length(); j++) {

                    if ("▓".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                        drawCharacter(position.getX() + j, position.getY() + i, wordsArray[i].charAt(j), "#FFFFFF");
                    }

                }
            }
            drawText(new Position(48, 42), "Sans", "#FFFFFF");
        }
        if (level == 2) {
            String s = "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓░░░░░░░░░░▓▓░░░░░░▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓░░░░░░░░░░░░░░░░▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓░░░░░▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓░░░░░▓▓▓▓ " +
                    "▓▓▓░░░░░░░▓▓▓░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░▓▓▓░░░░░░░▓▓▓ " +
                    "▓▓░░░░░░░░▓▓░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░▓▓░░░░░░░░▓▓ " +
                    "▓░░░▓▓▓▓▓▓▓▓░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░▓▓▓▓▓▓▓▓▓░░▓ " +
                    "▓░░░░░░░░▓▓▓░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░▓▓▓░░░░░░░░▓ " +
                    "▓░░░░░░░░░▓▓░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░▓▓░░░░░░░░░▓ " +
                    "▓▓▓░░░░░░░▓▓░░░░░▓░░░░░░░░░░░░░░░░▓░░░░░▓▓░░░░░░░▓▓▓ " +
                    "▓▓▓▓░░░░░░▓▓▓░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░▓▓▓░░░░░░▓▓▓▓ " +
                    "▓▓▓▓▓▓░░░░░▓▓░░░░░░▓░░░░░░░░░░░░▓░░░░░▓▓▓░░░░░▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓▓░▓▓▓░░░░░░░░░░░░░░░░░░░░░▓▓▓▓░▓▓▓▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓░░░░░░░░░░░░░░▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓░░░░▓░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░▓░░░░▓▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓░░░░▓░░░░░░░░░░░░▓▓▓▓▓▓░░░░░░░░░░░░▓░░░░▓▓▓▓▓▓ " +
                    "▓▓▓▓▓░░░░░▓░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░▓░░░░░▓▓▓▓▓ " +
                    "▓▓▓▓▓▓░░░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░░░▓▓▓▓▓▓ " +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ";
            String[] wordsArray = s.split(" ");

            for (int i = 0; i < wordsArray.length; i++) {
                for (int j = 0; j < wordsArray[0].length(); j++) {

                    if ("░".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                        drawCharacter(position.getX() + j, position.getY() + i, wordsArray[i].charAt(j), "#FFFFFF");
                    }
                }
            }
            drawText(new Position(47, 42), "Flowey", "#FFFFFF");
        }

        if (level == 3) {
            String s =
                    "░░░░▓▓░░▓▓▓▓▓▓▓▓░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░ ░░▓▓░░▓▓░░░░░░░░▓▓░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░ ░░▓▓░░░░░░░░░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░ ░░▓▓░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░ ▓▓░░░░▓▓░░░░▓▓░░░░░░░░░░▓▓░░░░░░░░░░░░░░░░░░░░ ▓▓░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓░░░░░░░░░░░░░░░░ ▓▓░░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░ ▓▓░░▓▓░░▓▓░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓ ▓▓░░░░▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓░░ ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░ ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░ ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░ ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░ ▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░ ░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░ ░░▓▓░░░░▓▓▓▓░░░░▓▓▓▓▓▓▓▓░░░░▓▓▓▓░░░░▓▓░░░░░░░░ ░░▓▓░░░░▓▓▓▓░░▓▓░░░░░░▓▓░░▓▓░░▓▓░░░░▓▓░░░░░░░░ ░░▓▓░░▓▓░░░░▓▓░░░░░░░░░░▓▓░░░░▓▓░░▓▓░░░░░░░░░░ ░░░░▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░░░░░░░░░░░";
            String[] wordsArray = s.split(" ");

            for (int i = 0; i < wordsArray.length; i++) {
                for (int j = 0; j < wordsArray[0].length(); j++) {
                    if ("▓".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                        drawCharacter(position.getX()+3 + j, position.getY()+4 + i, wordsArray[i].charAt(j), "#FFFFFF");
                    }
                }
            }
            drawText(new Position(47, 42), "  Dog  ", "#FFFFFF");
        }

        if (level == 4) {
            String s = "▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓░░░░░▓▓▓▓▓▓▓░░░░░░░░░░░░░░▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓░░░▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓░░░░░▓▓▓▓▓▓░░░░░▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓░░░▓▓▓▓▓▓▓▓▓░░░░░▓▓▓░░░░░▓▓▓▓▓▓▓▓░░░░▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓░░░▓▓▓▓▓░░░░░░▓▓░░░░▓▓░░░░░░░▓▓▓▓░░░░▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓\n" +
                    "▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓\n" +
                    "▓▓▓░░░░░░░░░░░░░▓▓▓▓▓▓▓▓░░░▓▓▓▓▓▓▓▓░░░░░░░░░░░░▓▓▓\n" +
                    "▓▓░░░░░░░░░▓▓▓▓▓▓░░░░░░▓▓▓▓▓░░░░░░▓▓▓▓▓▓░░░░░░░░▓▓\n" +
                    "▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓\n" +
                    "▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓\n" +
                    "▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░▓▓▓░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓▓░░░░░░░▓▓▓░▓▓▓▓░░▓▓▓░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓░░░▓▓▓░░░▓░░▓▓░░░░░░░▓▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓░░░░░▓▓▓░▓▓░▓▓▓▓░░▓▓░▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓▓▓▓▓░░░░░▓▓▓░░░▓▓▓▓▓▓▓░░░▓▓▓▓░░░░░░░▓▓▓▓▓▓▓▓▓\n" +
                    "▓▓▓▓▓░░░░░░░░░▓▓▓▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░░░░▓▓▓▓▓▓\n";
            String[] wordsArray = s.split("\n");

            for (int i = 0; i < wordsArray.length; i++) {
                for (int j = 0; j < wordsArray[0].length(); j++) {
                    if ("░".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                        drawCharacter(position.getX() + j, position.getY() + i, wordsArray[i].charAt(j), "#FFFFFF");
                    }
                }
            }
            drawText(new Position(48, 42), "Frog", "#FFFFFF");
        }

    }


    @Override
    public void drawImage(Position position) {
            String s =
                            "░░░░░░░░░░░░░▄▓▓▓▓▓▓▓▓░░▄▓▓▓▓▓▓▄░░▓▓▓░░░░▓▄░░░▄▓░░░░░░░░░░▄▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░░░░░░▓▓▓░░░░▓▓▓░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░▓▓▓░░░░▓▀░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░░░░░░▓▓▓░░░░▓▀░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░▓▓▓░░░░░░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░░░░░░▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░▀▓▓▓▓▓▓▓▓▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░░░░▀▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░░░░░░░░░░░░░▓▓▓░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░▄▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▓▓▓▌░░░░▄░░░░▄▓░░░░▓▓▓░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░▄▓▓▓▓▓▓▓▓▀░░░▀▓▓▓▓▓▓▀░░▓▓▓▓▓▓▓▓▀░░▓▓▓▓▓▓▓▓▓░░▄▓▓▓▓▓▓▓▓▀░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▀░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▄░░▓▓▓░░░░▓▄░░░░░▄▓▓▓▓▓▓▓▓░░▄▓░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░▀▓▓▓░▓▓▓░░░░▓▓▓░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░░░▓▓▓░░░░▓▀░░▓▓▓░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░░▄▓▓▓▄▄▄░░░░░▓▓▓░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░▀▀▓▓▓▓▓▓░░░░░▓▓▓░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░░▓▓▓░▓▓▓░░░░▓▓▓░░░▓▓▓░░░░░▄░░▓▓▓░░░░░░░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░▄▓▓▓░▓▓▓░░░░▓▓▓░░░▓▓▓░░░░▓▓▓░▓▓▓▌░░░░▄░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▀░░▓▓▓▓▓▓▓▓▀░░░░▓▓▓▓▓▓▓▓▓▓░▓▓▓▓▓▓▓▓▓░░░░░░░░░\n" +
                                    "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓░░░░░▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓░░░▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" +
                            "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n" ;







            String[] wordsArray = s.split("\n");

            for (int i = 0; i < wordsArray.length; i++) {
                for (int j = 0; j < wordsArray[0].length(); j++) {

                    if ("▓".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                        drawCharacter(position.getX() + j, position.getY() + i, wordsArray[i].charAt(j), "#FF0000");
                    }

                }
            }

        }


    public void drawDead(Position position) {
        String s =      "░░░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░▓▓▓▓▓▓▓▓▓▓░░░░▓▓▓▓░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░▓▓▓▓░░░░░░▓▓▓▓░░▓▓▓▓░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░▓▓▓▓░░░░░░▓▓▓▓░░▓▓▓▓░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓░░░░▓▓▓▓░░░░░░▓▓▓▓░░▓▓▓▓░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░▓▓▓▓░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░▓▓▓▓░░░░░▓▓▓▓░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░░░░░▓▓▓▓░░░░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n"+
                        "░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░\n"+
                        "░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░░░░░░\n" +
                        "░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░\n" +
                        "░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░\n" +
                        "░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░\n" +
                        "░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░▓▓▓▓░░░░░░▓▓▓▓░░░░░░░░░░░▓▓▓▓░░░░▓▓▓▓░░░░░░░░░░░░░\n" +
                        "░░░░▓▓▓▓▓▓▓▓▓▓░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░\n";
                                String[] wordsArray = s.split("\n");
        //List<String> wordsList = Arrays.asList(wordsArray);
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray[0].length(); j++) {

                if ("▓".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                    drawCharacter(position.getX() + j, position.getY() + i, wordsArray[i].charAt(j), "#FF0000");
                }
                //drawCharacter(95+j,1+i, wordsArray[i].charAt(j),"#FFFFFF");
            }
        }
    }

    public void drawWin(Position position) {
        String s =      "██  ██  ██████  ██   ██   ██     ██ ██ ███   ██\n" +
                        "██  ██ ██    ██ ██   ██   ██     ██ ██ ████  ██\n" +
                        " ████  ██    ██ ██   ██   ██  █  ██ ██ ██ ██ ██\n" +
                        "  ██   ██    ██ ██   ██   ██ █ █ ██ ██ ██  ████ \n" +
                        "  ██    ██████   █████     ███ ███  ██ ██    ██ \n";
        String[] wordsArray = s.split("\n");
        //List<String> wordsList = Arrays.asList(wordsArray);
        for (int i = 0; i < wordsArray.length; i++) {
            for (int j = 0; j < wordsArray[0].length(); j++) {

                if ("█".equals(String.valueOf(wordsArray[i].charAt(j)))) {
                    drawCharacter(position.getX() + j, position.getY() + i, '▓', "#FF00F0");
                }

            }
        }
    }

    @Override
    public void drawWall(Position position) {
        drawCharacter(position.getX(), position.getY(), '#', "#FFFFFF");
    }

    @Override
    public void drawBlade(Position position) {
        drawCharacter(position.getX(), position.getY(), '@', "#FFFFFF");
    }

    @Override
    public void drawGrenade(Position position) {
        drawCharacter(position.getX(), position.getY(), '*', "#FFFFFF");
    }

    @Override
    public void drawText(Position position, String text, String color) {
        TextGraphics tg = screen.newTextGraphics();
        tg.setForegroundColor(TextColor.Factory.fromString(color));
        tg.putString((int) position.getX(), (int) position.getY(), text);
    }


    private void drawCharacter(double x, double y, char c, String color) {
        TextGraphics tg = screen.newTextGraphics();
        tg.setForegroundColor(TextColor.Factory.fromString(color));
        tg.putString((int) x, (int) (y + 1), "" + c);
    }

    @Override
    public void clear() {
        screen.clear();
    }

    @Override
    public void refresh() throws IOException {
        screen.refresh();
    }

    @Override
    public void close() throws IOException {
        screen.close();
    }
    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeigth() {
        return heigth;
    }
}
