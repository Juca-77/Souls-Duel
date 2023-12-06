package com.aor.hero.controller.game;

import com.aor.hero.Game;
import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.elements.Blade;
import com.aor.hero.model.game.elements.Monster;

import java.io.IOException;

public class BladeController extends GameController{
    private long lastMovement;

    public BladeController(Arena arena) {
        super(arena);

        this.lastMovement= 0;
    }

    @Override
    public void step(Game game, GUI.ACTION action, long time) throws IOException {
        if (time - lastMovement > 500) {
            for (Blade blade : getModel().getBlades())
                moveBlade(blade, blade.getPosition().getDown());
            this.lastMovement = time;
        }
    }

    private void moveBlade(Blade blade, Position position) {
        if (getModel().isEmpty(position)) {
            blade.setPosition(position);
            if (getModel().getHero().getPosition().equals(position))
                getModel().getHero().decreaseHP();
        }
    }
}
