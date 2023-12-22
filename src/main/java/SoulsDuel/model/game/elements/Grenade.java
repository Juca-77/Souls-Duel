package SoulsDuel.model.game.elements;

public class Grenade extends Element{

    private boolean isAlive;
    private int moves;
    private int move;

    public Grenade(int x, int y, int move) {
        super(x, y);
        moves=5;
        this.move=move;
        isAlive=true;
    }

    public int getMoves() {
        return moves;
    }

    public int getMove() {return move;}

    public void decreaseMoves() {
        this.moves--;
    }

    public void kill() {
        isAlive = false;
    }
    public boolean isAlive() {
        if(moves>0 & isAlive) {
            return true;
        }
        return false;
    }
}
