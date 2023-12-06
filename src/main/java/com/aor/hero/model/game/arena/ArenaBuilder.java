package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.elements.*;

import java.util.List;

public abstract class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());

        arena.setHero(createHero());
        arena.setMonsters(createMonsters());
        arena.setWalls(createWalls());
        arena.setEnemy(createEnemy());
        arena.setBlades(createBlades());

        return arena;
    }

    protected abstract int getWidth();

    protected abstract int getHeight();

    protected abstract List<Wall> createWalls();

    protected abstract List<Monster> createMonsters();

    protected abstract Hero createHero();

    protected abstract Enemy createEnemy();

    protected abstract List<Blade> createBlades();
}
