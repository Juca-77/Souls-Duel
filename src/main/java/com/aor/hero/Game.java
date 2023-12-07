package com.aor.hero;

import com.aor.hero.gui.LanternaGUI;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.arena.LoaderArenaBuilder;
import com.aor.hero.model.menu.Menu;
import com.aor.hero.states.GameState;
import com.aor.hero.states.MenuState;
import com.aor.hero.states.State;
import com.aor.hero.viewer.Music;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
public class Game {
    private final LanternaGUI gui;
    private State state;

    public Game() throws FontFormatException, IOException, URISyntaxException {
        int width=70;  //bigger than 47 to have a normal execution
        int height=50; //always 60 pls ***se alterar as dimensoes alterar tmb no menucontroler para evitar erros qndo se dá replay(ou play)***
        this.gui = new LanternaGUI(width, height);
        //this.state = new GameState(new LoaderArenaBuilder(1, width, height ).createArena()); //change to menu controler
        this.state = new MenuState(new Menu());
        Music normalMode = new Music("gameplaysong.wav");
        normalMode.start();

    }

    public static void main(String[] args) throws IOException, FontFormatException, URISyntaxException {
        new Game().start();
    }

    public void setState(State state) {
        this.state = state;
    }

    private void start() throws IOException {
        int FPS = 30;
        int frameTime = 1000 / FPS;

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
