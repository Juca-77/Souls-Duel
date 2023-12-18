package SoulsDuel;

import SoulsDuel.model.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PositionTest {

    private Position position;

    @BeforeEach
    public void helper(){
        position = new Position(10,5);

    }
    @Test
    public void setPositionTest(){
        int xp= (int) position.getX();
        int yp = (int) position.getY();
        Assertions.assertEquals(10,xp);
        Assertions.assertEquals(5,yp);
    }
}
