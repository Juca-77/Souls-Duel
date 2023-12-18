package SoulsDuel;

import SoulsDuel.model.Position;
import SoulsDuel.model.game.elements.Soul;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoulTest {

    private Soul soul;

    @BeforeEach
    public void setUp() {
        soul = new Soul(0,0);
    }

    @Test
    public void soulInitializationTest() {
        assertEquals(30, soul.getHp());
        assertEquals(new Position(0, 0), soul.getPosition());
    }


    @Test
    public void testTakeDamage() {
        Soul soul = new Soul(10, 10);
        soul.decreaseHP();
        assertEquals(29, soul.getHp());
    }
}

/*
public class SoulTest {

    private Soul soul;

    @BeforeEach
    public void setUp() {
        Position p = new Position(0,0);
        Soul = new Soul(p);
    }

    @Test
    public void soulInitializationTest() {
        assertEquals(100, soul.getHealth());
        assertEquals(new Position(0, 0), soul.getPosition());
    }

    @Test
    public void soulTakeDamageTest() {
        soul.takeDamage(20);
        assertEquals(80, soul.getHealth());
    }

    @Test
    public void testMoveUp() {
        Soul soul = new Soul(10, 10);
        soul.moveUp();
        assertEquals(10, soul.getX());
        assertEquals(9, soul.getY());
    }

    @Test
    public void testMoveDown() {
        Soul soul = new Soul(10, 10);
        soul.moveDown();
        assertEquals(10, soul.getX());
        assertEquals(11, soul.getY());
    }

    @Test
    public void testMoveLeft() {
        Soul soul = new Soul(10, 10);
        soul.moveLeft();
        assertEquals(9, soul.getX());
        assertEquals(10, soul.getY());
    }

    @Test
    public void testMoveRight() {
        Soul soul = new soul(10, 10);
        soul.moveRight();
        assertEquals(11, soul.getX());
        assertEquals(10, soul.getY());
    }

    @Test
    public void testTakeDamage() {
        Soul soul = new Soul(10, 10);
        soul.takeDamage(10);
        assertEquals(0, soul.getHealth());
    }
}
*/