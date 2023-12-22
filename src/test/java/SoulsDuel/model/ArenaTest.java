package SoulsDuel.model;

import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ArenaTest {

    @Test
    void testIsBlade() {
        Arena arena = new Arena(10, 10, 1);

        // Adding a Blade at position (5, 5)
        Blade blade = new Blade(5, 5,1);
        List<Blade> blades = new ArrayList<>();
        blades.add(blade);
        arena.addBlades(blades);

        // Testing isBlade method
        assertTrue(arena.isBlade(new Position(5, 5)));
        assertFalse(arena.isBlade(new Position(0, 0)));
    }

    @Test
    void testSetLevel() {
        Arena arena = new Arena(10, 10, 1);

        // Setting the level to 2
        arena.setLevel(2);

        // Verifying the level is set correctly
        assertEquals(2, arena.getLevel());

        // Verifying that the enemy's level is also updated
        Enemy enemy = arena.getEnemy();
        assertEquals(2, enemy.getEnemyLevel());
    }
    @Test
    void testIsEmpty() {
        Arena arena = new Arena(10, 10, 1);

        // Adding a Wall at position (5, 5)
        arena.setWalls(List.of(new Wall(5, 5)));

        // Testing isEmpty method
        assertFalse(arena.isEmpty(new Position(5, 5)));
        assertTrue(arena.isEmpty(new Position(0, 0)));
    }

    @Test
    void testGetters() {
        Arena arena = new Arena(10, 10, 1);
        Soul soul = new Soul(0, 0);
        arena.setSoul(soul);

        // Testing getters
        assertEquals(10, arena.getWidth());
        assertNotNull(arena.getTimer());
        assertEquals(soul, arena.getSoul());
    }

    @Test
    void testAddGrenades() {
        Arena arena = new Arena(10, 10, 1);

        // Adding a Grenade at position (3, 3)
        Grenade grenade = new Grenade(3, 3,1);
        List<Grenade> grenades = new ArrayList<>();
        grenades.add(grenade);
        arena.addGrenades(grenades);

        // Testing getGrenades method
        assertEquals(grenades, arena.getGrenades());
    }

    @Test
    void testAddBlades() {
        Arena arena = new Arena(10, 10, 1);

        // Adding a Blade at position (2, 2)
        Blade blade = new Blade(2, 2, 1);
        List<Blade> blades = new ArrayList<>();
        blades.add(blade);
        arena.addBlades(blades);

        // Testing getBlades method
        assertEquals(blades, arena.getBlades());
    }

}