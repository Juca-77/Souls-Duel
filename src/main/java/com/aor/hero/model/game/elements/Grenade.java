package com.aor.hero.model.game.elements;

public class Grenade extends Element{

    private boolean isAlive;

    public Grenade(double x, double y) {
        super(x, y);
        isAlive=true;
    }

    public void kill() {
        isAlive = false;
    }
    public boolean isAlive() {
        return isAlive;
    }
}
