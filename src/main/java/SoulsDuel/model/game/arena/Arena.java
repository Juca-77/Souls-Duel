package SoulsDuel.model.game.arena;

import SoulsDuel.model.game.elements.*;
import SoulsDuel.model.Position;


import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Arena {
    private final int width;
    private final int height;

    private Timer timer;

    private int level;

    private Soul soul;

    private Enemy enemy;

    private List<Blade> blades;


    private List<Grenade> grenades;
    private List<Wall> walls;

    public Arena(int width, int height, int level) {
        this.width = width;
        this.height = height;
        this.level= level;
        this.timer=new Timer();
        this.blades=new ArrayList<>();
        this.grenades=new ArrayList<>();
        this.enemy=new Enemy(getWidth()/2-24, 0,level);
    }

    public int getWidth() {
        return width;
    }

    public Timer getTimer() {
        return timer;
    }

    public Soul getSoul() {
        return soul;
    }

    public void setSoul(Soul soul) {
        this.soul = soul;
    }

    public Enemy getEnemy() {return enemy;}

    

    public List<Blade> getBlades() {return blades;}

    public void setBlades(List<Blade> blades) {this.blades=blades;}

    public List<Grenade> getGrenades() {
        return grenades;
    }

    public void setGrenades(List<Grenade> grenades) {
        this.grenades = grenades;
    }

    public void addBlades(List<Blade> blades) {
        this.blades.addAll(blades);
    }

    public void addGrenades(List<Grenade> grenades) {
        this.grenades.addAll(grenades);
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

    public void setLevel(int level) {this.level=level;
    this.enemy.setEnemyLevel(level);}
}
