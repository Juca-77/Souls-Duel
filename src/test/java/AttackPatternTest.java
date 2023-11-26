import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AttackPatternTest {

    private AttackPattern attackPattern;

    @BeforeEach
    public void setUp() {
        attackPattern = new AttackPattern();
    }

    @Test
    public void attackPatternInitializationTest() {
        Assertions.assertEquals(0, attackPattern.getDuration());
        assertTrue(attackPattern.getAttacks().isEmpty());
    }

    @Test
    public void addAttackTest() {
        AttackType attack = new AttackType(Grenade);
        attackPattern.addAttack(attack);
        Assertions.assertEquals(1, attackPattern.getAttacks().size());
    }

    @Test
    public void testAttackCollidesWithSoul() {
        Position p = new Position(10,10);
        Soul soul = new Soul(p);
        Attack attack = new Attack(10, 10);
        assertTrue(attack.collidesWith(Soul));
    }
}