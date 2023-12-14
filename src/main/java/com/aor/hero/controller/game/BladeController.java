package com.aor.hero.controller.game;

import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.elements.Blade;
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
        if (time - lastMovement > 100) {
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
                case 5: {
                    double y = blade.getPosition().getY();
                    double x = blade.getPosition().getX();

                    // Adjust the amplitude and frequency based on your needs
                    double amplitude = 3;  // Adjust as needed
                    double frequency = Math.PI / 5;   // Adjust as needed

                    y = y+1;
                    x = x +1+amplitude * Math.cos(frequency * y);

                    Position p = new Position((int) x, (int) y);

                    if (getModel().isEmpty(p) && blade.isAlive()) {
                        blade.setPosition(p);

                        if (getModel().getHero().getPosition().equals(blade.getPosition())) {
                            getModel().getHero().decreaseHP();
                            damage.stop();
                            damage.startonce();
                        }
                    } else {
                        blade.setPosition(new Position(0, 0));
                        blade.kill();
                    }

                    break;
                }
                case 6: {
                    double y = blade.getPosition().getY();
                    double x = blade.getPosition().getX();

                    // Adjust the amplitude and frequency based on your needs
                    double amplitude = 3;  // Adjust as needed
                    double frequency = Math.PI / 5;   // Adjust as needed

                    y = y+1;
                    x = x -amplitude * Math.cos(frequency * y);

                    Position p = new Position((int) x, (int) y);

                    if (getModel().isEmpty(p) && blade.isAlive()) {
                        blade.setPosition(p);

                        if (getModel().getHero().getPosition().equals(blade.getPosition())) {
                            getModel().getHero().decreaseHP();
                            damage.stop();
                            damage.startonce();
                        }
                    } else {
                        blade.setPosition(new Position(0, 0));
                        blade.kill();
                    }

                    break;
                }


            }
    }
}
