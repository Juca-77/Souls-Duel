package SoulsDuel.model;

import SoulsDuel.model.game.elements.Enemy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnemyTest {
    private Enemy enemy;

    @BeforeEach
    void setUp() {
        enemy=new Enemy(1,1,1);
    }
    @Test
    void setGetEnemyLevel() {
        enemy.setEnemyLevel(2);
        assertEquals(2,enemy.getEnemyLevel());
    }
}