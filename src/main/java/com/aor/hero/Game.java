package com.aor.hero;

import com.aor.hero.gui.LanternaGUI;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.states.MainMenuState;
import com.aor.hero.states.State;
import com.aor.hero.viewer.Music;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ConcurrentModificationException;

public class Game {
    private final LanternaGUI gui;
    private State state;

    public Game() throws FontFormatException, IOException, URISyntaxException {
        //bigger than 47 to have a normal execution
         //always 60 pls ***se alterar as dimensoes alterar tmb no menucontroler para evitar erros qndo se dá replay(ou play)***
        this.gui = new LanternaGUI(100, 70);
        this.state = new MainMenuState(new MainMenu());

    }

    public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException, ConcurrentModificationException {
        new Game().start();
    }

    public void setState(State state) {
        this.state = state;
    }

    private void start() throws IOException {
        int FPS = 30;
        int frameTime = 1000 / FPS;
        Music normalMode = new Music("gameplaysong.wav");
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
}
