package SoulsDuel;

import SoulsDuel.gui.GUI;
import SoulsDuel.gui.LanternaGUI;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.states.State;
import SoulsDuel.viewer.Music;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ConcurrentModificationException;

public class Game {
    public GUI gui;
    public State state;

    public Game() throws FontFormatException, IOException, URISyntaxException {
        //bigger than 47 to have a normal execution
        //always 60 pls ***se alterar as dimensoes alterar tmb no menucontroler para evitar erros qndo se dá replay(ou play)***
        this.gui = new LanternaGUI(100, 70);
        this.state = new MainMenuState(new MainMenu());

    }

    public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException {
        new Game().start();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void start() throws IOException {
        int FPS = 30;
        int frameTime = 1000 / FPS;
        Music normalMode = new Music("sounds/gameplaysong.wav");
        normalMode.start();
        while (this.state != null) {
            long startTime = System.currentTimeMillis();

            state.step(this, gui, startTime);

            long elapsedTime = System.currentTimeMillis() - startTime;
            long sleepTime = frameTime - elapsedTime;

            try {
                if (sleepTime > 0) Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
            }
        }

        gui.close();
    }

    public GUI getGui() {
        return gui;
    }

    public void setGui(GUI gui) {
        this.gui = gui;
    }

    public State getState() {
        return state;
    }
}
