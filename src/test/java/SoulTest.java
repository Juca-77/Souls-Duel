
import com.aor.hero.model.Position;
import com.aor.hero.model.game.elements.Hero;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SoulTest {

    private Hero soul;

    @BeforeEach
    public void setUp() {
        soul = new Hero(0,0);
    }

    @Test
    public void soulInitializationTest() {
        assertEquals(30, soul.getHp());
        assertEquals(new Position(0, 0), soul.getPosition());
    }


    @Test
    public void testTakeDamage() {
        Hero soul = new Hero(10, 10);
        soul.decreaseHP();
        assertEquals(29, soul.getHp());
    }
}

