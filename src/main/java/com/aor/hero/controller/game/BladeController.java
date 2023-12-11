package com.aor.hero.controller.game;

import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.elements.Blade;
import com.aor.hero.model.game.elements.Monster;
import com.aor.hero.viewer.Music;

import java.io.IOException;

public class BladeController extends GameController{
    private long lastMovement;

    private Music damage = new Music("damage_sound.wav");

    public BladeController(Arena arena) {
        super(arena);

        this.lastMovement= 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 200) {
            for (Blade blade : getModel().getBlades())
                if(blade.isAlive()) {
                    moveBlade(blade);
                }
            this.lastMovement = time;
        }
    }

    private void moveBlade(Blade blade) {
            switch (blade.getMove()) {
                case (int) 1: {
                    if (getModel().isEmpty(blade.getPosition().getUp()) && blade.isAlive()) {
                        if (getModel().isEmpty(blade.getPosition().getUp()) && blade.isAlive()) {
                            blade.setPosition(blade.getPosition().getUp());
                            if (getModel().getHero().getPosition().equals(blade.getPosition())) {
                                getModel().getHero().decreaseHP();
                                damage.stop();
                                damage.startonce();

                            }
                        }
                    }
                    else {
                        blade.setPosition(new Position(0,0));
                        blade.kill();
                    }

                    break;
                }
                case (int) 2: {
                    if (getModel().isEmpty(blade.getPosition().getDown()) && blade.isAlive()) {
                        if (getModel().isEmpty(blade.getPosition().getDown()) && blade.isAlive()) {
                            blade.setPosition(blade.getPosition().getDown());
                            if (getModel().getHero().getPosition().equals(blade.getPosition())) {
                                getModel().getHero().decreaseHP();
                                damage.stop();
                                damage.startonce();
                            }
                        }
                    }
                    else {
                        blade.setPosition(new Position(0,0));
                        blade.kill();
                    }
                    break;
                }
                case (int) 3: {
                    if (getModel().isEmpty(blade.getPosition().getLeft()) && blade.isAlive()) {
                        if (getModel().isEmpty(blade.getPosition().getLeft()) && blade.isAlive()) {
                            blade.setPosition(blade.getPosition().getLeft());
                            if (getModel().getHero().getPosition().equals(blade.getPosition())) {
                                getModel().getHero().decreaseHP();
                                damage.stop();
                                damage.startonce();
                            }
                        }
                    }
                    else {
                        blade.setPosition(new Position(0,0));
                        blade.kill();
                    }
                    break;
                }
                case (int) 4: {
                    if (getModel().isEmpty(blade.getPosition().getRight()) && blade.isAlive()) {
                        if (getModel().isEmpty(blade.getPosition().getRight()) && blade.isAlive()) {
                            blade.setPosition(blade.getPosition().getRight());
                            if (getModel().getHero().getPosition().equals(blade.getPosition())) {
                                getModel().getHero().decreaseHP();
                                damage.stop();
                                damage.startonce();
                            }
                        }
                    }
                    else {
                        blade.setPosition(new Position(0,0));
                        blade.kill();
                    }
                    break;
                }
            }
    }
}
