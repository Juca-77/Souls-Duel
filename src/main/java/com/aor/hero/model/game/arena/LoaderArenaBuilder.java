package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.elements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LoaderArenaBuilder {
    private final int level;
    private int width;
    private int height;

    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());

        arena.setHero(createHero());
        //arena.setMonsters(createMonsters());
        arena.setWalls(createWalls());
        arena.setEnemy(createEnemy(level));
        arena.setBlades(createBlades1());

        return arena;
    }

    public LoaderArenaBuilder(int level, int width, int height) throws IOException {
        this.level = level;
        this.width=width;
        this.height=height;
    }




    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }


    public List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < 40; c++) {
            walls.add(new Wall(getWidth()/2-19+c, 26));
            walls.add(new Wall(getWidth()/2-19+c, 44));
        }
        for (int r = 1; r < 20; r++) {
            walls.add(new Wall(getWidth()/2-20, 25+r));
            walls.add(new Wall(getWidth()/2+21, 25+r));
        }
        return walls;
    }


    public List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();
/*
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'M') monsters.add(new Monster(x, y));
        }*/

        return monsters;
    }


    public Hero createHero() {
        return new Hero(getWidth()/2, 39);
    }


    public Enemy createEnemy(int level){return new Enemy(getWidth()/2-24, 0,level);}


    public List<Blade> createBlades1() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-17+5*i,29, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-17,27+2*i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-17+5*i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2+19,27+2*i, 3)); //1=up 2=down 3=left 4=right
        }


        return blades;
    }
}