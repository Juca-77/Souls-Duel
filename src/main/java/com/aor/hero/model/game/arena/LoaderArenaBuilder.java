package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.elements.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class LoaderArenaBuilder extends ArenaBuilder {
    private final int level;
    private int width;
    private int height;


    public LoaderArenaBuilder(int level, int width, int height) throws IOException {
        this.level = level;
        this.width=width;
        this.height=height;
    }



    @Override
    protected int getWidth() {
        return width;
    }

    @Override
    protected int getHeight() {
        return height;
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < 40; c++) {
            walls.add(new Wall(getWidth()/2-19+c, 30));
            walls.add(new Wall(getWidth()/2-19+c, 48));
        }
        for (int r = 1; r < 20; r++) {
            walls.add(new Wall(getWidth()/2-20, 29+r));
            walls.add(new Wall(getWidth()/2+20, 29+r));
        }
        return walls;
    }

    @Override
    protected List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();
/*
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'M') monsters.add(new Monster(x, y));
        }*/

        return monsters;
    }

    @Override
    protected Hero createHero() {
        return new Hero(getWidth()/2, 39);
    }

    @Override
    protected Enemy createEnemy(){return new Enemy(getWidth()/2-24, 0,1);}

    @Override
    protected List<Blade> createBlades() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-17+5*i,31));
        }

        return blades;
    }
}