package com.aor.hero.model.game.elements;

public class Blade extends Element {
    private boolean isAlive;
    public Blade(int x, int y) {
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
