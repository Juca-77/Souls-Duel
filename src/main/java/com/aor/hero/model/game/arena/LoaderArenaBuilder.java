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
    private final List<String> lines;

    public LoaderArenaBuilder(int level) throws IOException {
        this.level = level;

        URL resource = LoaderArenaBuilder.class.getResource("/levels/level" + level + ".lvl");
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));

        lines = readLines(br);
    }

    private List<String> readLines(BufferedReader br) throws IOException {
        List<String> lines = new ArrayList<>();
        for (String line; (line = br.readLine()) != null; )
            lines.add(line);
        return lines;
    }

    @Override
    protected int getWidth() {
        int width = 0;
        for (String line : lines)
            width = Math.max(width, line.length());
        return width;
    }

    @Override
    protected int getHeight() {
        return lines.size();
    }

    @Override
    protected List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < 40; c++) {
            walls.add(new Wall(101+c, 30));
            walls.add(new Wall(101+c, 48));
        }
        for (int r = 1; r < 20; r++) {
            walls.add(new Wall(100, 29+r));
            walls.add(new Wall(140, 29+r));
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
        return new Hero(120, 39);
    }

    @Override
    protected Enemy createEnemy(){return new Enemy(100, 5);}

    @Override
    protected List<Blade> createBlades() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<3;i++) {
            blades.add(new Blade(10+5*i,60));
        }
        return blades;
    }
}