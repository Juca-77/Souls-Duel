package SoulsDuel.controller.game;

import SoulsDuel.Game;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Grenade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class GrenadeController extends GameController{
    private long lastMovement;
    public GrenadeController(Arena arena) {
        super(arena);
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 200) {
            List<Grenade> grenadesCopy = new CopyOnWriteArrayList<>(getModel().getGrenades());
            for (Grenade grenade : grenadesCopy) {
                if (grenade.isAlive()) {
                    moveGrenade(grenade);

                } else if (!grenade.isAlive() && !Objects.equals(grenade.getPosition(), new Position(0, 0))) {
                    List<Blade> blades = new ArrayList<>();
                    blades.add(new Blade((int) grenade.getPosition().getX(), (int) grenade.getPosition().getY(), 1));
                    blades.add(new Blade((int) grenade.getPosition().getX(), (int) grenade.getPosition().getY(), 2));
                    blades.add(new Blade((int) grenade.getPosition().getX(), (int) grenade.getPosition().getY(), 3));
                    blades.add(new Blade((int) grenade.getPosition().getX(), (int) grenade.getPosition().getY(), 4));
                    getModel().addBlades(blades);
                    grenade.setPosition(new Position(0,0));
                }
            }
            this.lastMovement = time;
        }
    }


    private void moveGrenade(Grenade grenade) {
        switch (grenade.getMove()) {
            case (int) 1: {
                if (getModel().isEmpty(grenade.getPosition().getUp()) && grenade.isAlive()) {
                    if (getModel().isEmpty(grenade.getPosition().getUp()) && grenade.isAlive()) {
                        grenade.decreaseMoves();
                        grenade.setPosition(grenade.getPosition().getUp());
                    }
                } else {
                    grenade.kill();
                }

                break;
            }
            case (int) 2: {
                if (getModel().isEmpty(grenade.getPosition().getDown()) && grenade.isAlive()) {
                    if (getModel().isEmpty(grenade.getPosition().getDown()) && grenade.isAlive()) {
                        grenade.decreaseMoves();
                        grenade.setPosition(grenade.getPosition().getDown());
                    }
                } else {
                    grenade.kill();
                }
                break;
            }
            case (int) 3: {
                if (getModel().isEmpty(grenade.getPosition().getLeft()) && grenade.isAlive()) {
                    if (getModel().isEmpty(grenade.getPosition().getLeft()) && grenade.isAlive()) {
                        grenade.decreaseMoves();
                        grenade.setPosition(grenade.getPosition().getLeft());
                    }
                } else {
                    grenade.kill();
                }
                break;
            }
            case (int) 4: {
                if (getModel().isEmpty(grenade.getPosition().getRight()) && grenade.isAlive()) {
                    if (getModel().isEmpty(grenade.getPosition().getRight()) && grenade.isAlive()) {
                        grenade.decreaseMoves();
                        grenade.setPosition(grenade.getPosition().getRight());
                    }
                } else {
                    grenade.kill();
                }
                break;
            }
        }
    }
}
