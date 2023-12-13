package com.aor.hero.model.game.elements;

public class Hero extends Element {
    private int hp;

    public Hero(double x, double y) {
        super(x, y);
        this.hp = 1000;
    }

    public void decreaseHP() {
        this.hp--;
    }

    public int getHp() {
        return hp;
    }
}
