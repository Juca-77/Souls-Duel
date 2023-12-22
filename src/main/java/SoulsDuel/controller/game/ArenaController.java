package SoulsDuel.controller.game;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.model.menu.WinMenu;
import SoulsDuel.states.DeadState;
import SoulsDuel.states.MainMenuState;
import SoulsDuel.states.WinState;


import java.io.IOException;
import java.util.TimerTask;

public class ArenaController extends GameController {
    private final SoulController soulController;

    private final BladeController bladesController;
    private final GrenadeController grenadeController;
    private Arena arena;
    private boolean finish;


    public ArenaController(Arena arena) {
        super(arena);
        finish=false;
        getModel().getTimer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish=true;
            }
        }, 319000);

        this.soulController = new SoulController(arena);

        this.bladesController = new BladeController(arena);
        this.grenadeController = new GrenadeController(arena);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT ) {
            getModel().getTimer().cancel();
            game.setState(new MainMenuState(new MainMenu()));

        }
        if(getModel().getSoul().getHp() == 0) {
            getModel().getTimer().cancel();
            game.setState(new DeadState(new DeadMenu()));
        }

        if(finish) {
            getModel().getTimer().cancel();
            game.setState(new WinState(new WinMenu()));
        }

        else {
            soulController.step(game, action, time);

            bladesController.step(game, action, time);
            grenadeController.step(game,action,time);
        }
    }
}