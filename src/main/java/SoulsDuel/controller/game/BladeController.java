package SoulsDuel.controller.game;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.viewer.Music;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BladeController extends GameController{
    private long lastMovement;

    private Music damage = new Music("sounds/damage_sound.wav");

    public BladeController(Arena arena) {
        super(arena);

        this.lastMovement= 0;
    }

    public void setDamage(Music damage) {
        this.damage = damage;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 100) {

            List<Blade> bladesCopy = new ArrayList<>(getModel().getBlades());
            for (Blade blade : bladesCopy) {
                if (blade.isAlive()) {
                    moveBlade(blade);
                }
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
                            if (getModel().getSoul().getPosition().equals(blade.getPosition())) {
                                getModel().getSoul().decreaseHP();
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
                            if (getModel().getSoul().getPosition().equals(blade.getPosition())) {
                                getModel().getSoul().decreaseHP();
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
                            if (getModel().getSoul().getPosition().equals(blade.getPosition())) {
                                getModel().getSoul().decreaseHP();
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
                            if (getModel().getSoul().getPosition().equals(blade.getPosition())) {
                                getModel().getSoul().decreaseHP();
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

                        if (getModel().getSoul().getPosition().equals(blade.getPosition())) {
                            getModel().getSoul().decreaseHP();
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

                        if (getModel().getSoul().getPosition().equals(blade.getPosition())) {
                            getModel().getSoul().decreaseHP();
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
