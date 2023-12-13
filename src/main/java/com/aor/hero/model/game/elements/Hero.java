package com.aor.hero.model.game.elements;

public class Hero extends Element {
    private int hp;

    public Hero(int x, int y) {
        super(x, y);
        this.hp = 30;
    }

    public void decreaseHP() {
        this.hp--;
    }

    public int getHp() {
        return hp;
    }


}
