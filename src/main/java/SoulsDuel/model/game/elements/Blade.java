package SoulsDuel.model.game.elements;

public class Blade extends Element {
    private boolean isAlive;

    private int move;

    public Blade(int x, int y, int move) {  //1=up 2=down 3=left 4=right
        super(x, y);
        this.move=move;
        isAlive=true;
    }

    public int getMove() {return move;}
    public void kill() {
        isAlive = false;
    }
    public boolean isAlive() {
        return isAlive;
    }

}
