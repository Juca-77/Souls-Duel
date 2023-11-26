import com.googlecode.lanterna.graphics.TextGraphics;


public abstract class Element {
    private Position position;

    public Element(Position p) {
        this.position = p;
    }

    public void set_position(Position position) {
        this.position.setX(position.getX());
        this.position.setY(position.getY());
    }

    public Element(int c, int i) {
        position = new Position(c, i);
    }


    public Position getPosition() {
        return position;
    }
    public abstract void draw(TextGraphics graphics);

}
