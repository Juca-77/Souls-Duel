import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

import java.util.Random;

public class Monster extends Element{

    public Monster(Position position){
        super(position);
    }
    public Monster(int x, int y){
        super(x,y);
    }
    public Position move(){
        Random rand = new Random();
        int r = rand.nextInt(4);
        if (r == 0){
            return new Position(getPosition().getX()+1, getPosition().getY());
        }
        else if (r == 1){
            return new Position(getPosition().getX(), getPosition().getY()+1);
        }
        else if (r == 2){
            return new Position(getPosition().getX()-1, getPosition().getY());
        }
        else {
            return new Position(getPosition().getX(), getPosition().getY()-1);
        }
    }



    @Override
    public void draw(TextGraphics graphics) {
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFFFF"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(super.getPosition().getX(), super.getPosition().getY()), "@");
    }



}
