package SoulsDuel.model.game.elements;

public class Enemy extends Element {

    private int level;
    public Enemy(int x, int y,int level) {
        super(x, y);
        this.level=level;
    }
    public int getEnemyLevel() {return level;}

    public void setEnemyLevel(int level) {this.level=level;}
}
