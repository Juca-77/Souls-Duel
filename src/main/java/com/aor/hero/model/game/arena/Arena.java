package com.aor.hero.model.game.arena;

import com.aor.hero.model.Position;
import com.aor.hero.model.game.elements.*;

import java.util.List;
import java.util.Timer;

public class Arena {
    private final int width;
    private final int height;

    private Timer timer;

    private int level;

    private Hero hero;

    private Enemy enemy;

    private List<Blade> blades;
    private List<Monster> monsters;
    private List<Wall> walls;

    public Arena(int width, int height, int level) {
        this.width = width;
        this.height = height;
        this.level= level;
        this.timer=new Timer();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public Hero getHero() {
        return hero;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public Enemy getEnemy() {return enemy;}


    public void setEnemy(Enemy enemy) {this.enemy = enemy;}

    public List<Monster> getMonsters() {
        return monsters;
    }

    public void setMonsters(List<Monster> monsters) {
        this.monsters = monsters;
    }

    public List<Blade> getBlades() {return blades;}

    public void setBlades(List<Blade> blades) {this.blades=blades;}

    public void addBlades(List<Blade> blades) {
        this.blades.addAll(blades);
    }

    public List<Wall> getWalls() {
        return walls;
    }

    public void setWalls(List<Wall> walls) {
        this.walls = walls;
    }

    public boolean isEmpty(Position position) {
        for (Wall wall : walls)
            if (wall.getPosition().equals(position))
                return false;
        return true;
    }

    public boolean isBlade(Position position) {
        for (Blade blade : blades)
            if (blade.getPosition().equals(position))
                return true;
        return false;
    }

    public int getLevel() {return level;}

    public void setLevel(int level) {this.level=level;}
}
