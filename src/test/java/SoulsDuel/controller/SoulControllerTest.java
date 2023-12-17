package SoulsDuel.controller;

import SoulsDuel.controller.game.SoulController;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;
import SoulsDuel.viewer.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;

class SoulControllerTest {
    private SoulController controller;
    private Soul soul;
    private Arena arena;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10,1);

        soul = new Soul(5, 5);
        arena.setHero(soul);

        arena.setWalls(Arrays.asList());

        controller = new SoulController(arena);
    }

    @Test
    void moveHeroRightEmpty() {
        controller.moveSoulRight();
        assertEquals(new Position(6, 5), soul.getPosition());
    }

    @Test
    void moveHeroRightNotEmpty() {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        controller.moveSoulRight();
        assertEquals(new Position(5, 5), soul.getPosition());
    }

    @Test
    void testGetDamage() {
        // Create an instance of Arena
        Arena arena = new Arena(10, 10, 1);
        // Create an instance of HeroController
        SoulController soulController = new SoulController(arena);

        // Test getDamage method
        assertNotNull(soulController.getDamage());
    }

    @Test
    void testMoveHero() {
        // Create a mock instance of Arena
        Arena arena = Mockito.mock(Arena.class);
        // Create an instance of HeroController with the mock Arena
        SoulController soulController = new SoulController(arena);

        SoulController soulControllermock =  mock(SoulController.class);

        // Set up the necessary objects and positions
        Position emptyPosition = new Position(1, 1);
        when(arena.isEmpty(emptyPosition)).thenReturn(true);
        when(arena.isBlade(emptyPosition)).thenReturn(false);
        Soul mockSoul = Mockito.mock(Soul.class);
        when(arena.getHero()).thenReturn(mockSoul);

        Position bladePosition = new Position(2, 2);
        when(arena.isEmpty(bladePosition)).thenReturn(true);
        when(arena.isBlade(bladePosition)).thenReturn(true);
        when(arena.getHero()).thenReturn(mockSoul);

        Music mockDamage = Mockito.mock(Music.class);
        when(soulControllermock.getDamage()).thenReturn(mockDamage);

        // Test moveHero method when moving to an empty position
        soulController.moveSoul(emptyPosition);

        verify(arena, times(1)).isEmpty(emptyPosition);
        verify(arena, times(1)).getHero();
        verify(arena, times(1)).isBlade(emptyPosition);
        verify(mockSoul, times(1)).setPosition(emptyPosition);
        verify(mockSoul, times(0)).decreaseHP();
        verify(mockDamage, times(0)).stop();
        verify(mockDamage, times(0)).startonce();

        // Test moveHero method when moving to a position with a blade
        soulController.moveSoul(bladePosition);

        verify(arena, times(1)).isEmpty(bladePosition);
        verify(arena, times(1)).isBlade(bladePosition);
        verify(mockSoul, times(1)).setPosition(bladePosition);
        verify(mockSoul, times(1)).decreaseHP();

    }
}