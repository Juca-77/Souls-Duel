package SoulsDuel.model.game.elements;

public class Soul extends Element {
    private int hp;

    public Soul(int x, int y) {
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
