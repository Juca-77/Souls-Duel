package SoulsDuel.controller;

import SoulsDuel.Game;
import SoulsDuel.controller.game.SoulController;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;
import SoulsDuel.viewer.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class SoulControllerTest {
    private SoulController controller;
    private Soul soul;
    private Arena arena;
    private Music damageMock;
    private Game game;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10,1);

        soul = new Soul(5, 5);
        arena.setSoul(soul);

        arena.setWalls(Arrays.asList());

        controller = new SoulController(arena);

        damageMock = mock(Music.class);
        controller.setDamage(damageMock);
        game = mock(Game.class);
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
    void testMoveSoul() {
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
        when(arena.getSoul()).thenReturn(mockSoul);

        Position bladePosition = new Position(2, 2);
        when(arena.isEmpty(bladePosition)).thenReturn(true);
        when(arena.isBlade(bladePosition)).thenReturn(true);
        when(arena.getSoul()).thenReturn(mockSoul);

        Music mockDamage = Mockito.mock(Music.class);
        when(soulControllermock.getDamage()).thenReturn(mockDamage);

        // Test moveHero method when moving to an empty position
        soulController.moveSoul(emptyPosition);

        verify(arena, times(1)).isEmpty(emptyPosition);
        verify(arena, times(1)).getSoul();
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

    @Test
    void stepMoveSoulUp() {
        // Simulate the GUI action triggering a move up
        controller.step(mock(Game.class), GUI.ACTION.UP, 1000);
        assertEquals(new Position(5, 4), soul.getPosition());
    }

    @Test
    void stepMoveSoulRight() {
        // Simulate the GUI action triggering a move right
        controller.step(mock(Game.class), GUI.ACTION.RIGHT, 1000);
        assertEquals(new Position(6, 5), soul.getPosition());
    }

    @Test
    void stepMoveSoulDown() {
        // Simulate the GUI action triggering a move down
        controller.step(mock(Game.class), GUI.ACTION.DOWN, 1000);
        assertEquals(new Position(5, 6), soul.getPosition());
    }

    @Test
    void stepMoveSoulLeft() {
        // Simulate the GUI action triggering a move left
        controller.step(mock(Game.class), GUI.ACTION.LEFT, 1000);
        assertEquals(new Position(4, 5), soul.getPosition());
    }



    @Test
    void stepWithNullAction() {
        // Simulate a null GUI action
        assertDoesNotThrow(() -> controller.step(mock(Game.class), null, 1000));
        // Verify that the position remains unchanged
        assertEquals(new Position(5, 5), soul.getPosition());
    }



}