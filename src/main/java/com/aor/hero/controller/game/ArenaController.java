package com.aor.hero.controller.game;

import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.menu.DeadMenu;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.model.menu.WinMenu;
import com.aor.hero.states.DeadState;
import com.aor.hero.states.MainMenuState;
import com.aor.hero.states.WinState;


import java.io.IOException;
import java.util.TimerTask;

public class ArenaController extends GameController {
    private final HeroController heroController;
    //private final MonsterController monsterController;
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
        }, 315000);

        this.heroController = new HeroController(arena);
        //this.monsterController = new MonsterController(arena);
        this.bladesController = new BladeController(arena);
        this.grenadeController = new GrenadeController(arena);
    }

    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (action == GUI.ACTION.QUIT ) {
            getModel().getTimer().cancel();
            game.setState(new MainMenuState(new MainMenu()));

        }
        if(getModel().getHero().getHp() == 0) {
            getModel().getTimer().cancel();
            game.setState(new DeadState(new DeadMenu()));
        }

        if(finish) {
            getModel().getTimer().cancel();
            game.setState(new WinState(new WinMenu()));
        }

        else {
            heroController.step(game, action, time);
            //monsterController.step(game, action, time);
            bladesController.step(game, action, time);
            grenadeController.step(game,action,time);
        }
    }
}