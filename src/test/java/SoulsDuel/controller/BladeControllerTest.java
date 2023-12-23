package SoulsDuel.controller;

import SoulsDuel.Game;
import SoulsDuel.controller.game.BladeController;


import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;
import SoulsDuel.viewer.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.sound.sampled.Clip;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class BladeControllerTest {
    private BladeController controller;
    private Soul soul;
    private Arena arena;
    private Game game;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10,1);

        soul = new Soul(5, 5);
        arena.setSoul(soul);

        arena.setWalls(Arrays.asList());
        arena.setBlades(Arrays.asList());



        controller = new BladeController(arena);

        game = mock(Game.class);
    }
    @Test
    void moveBladeRightEmpty() throws IOException {
        Blade blade=new Blade(5,5,4);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(6, 5), blade.getPosition());
    }

    @Test
    void moveBladeRightNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        Blade blade=new Blade(5,5,4);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(0, 0), blade.getPosition());
        assertFalse(blade.isAlive());
    }
    @Test
    void moveBladeLeftEmpty() throws IOException {
        Blade blade=new Blade(5,5,3);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(4, 5), blade.getPosition());
    }

    @Test
    void moveBladeLeftNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(4, 5)));
        Blade blade=new Blade(5,5,3);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(0, 0), blade.getPosition());
        assertFalse(blade.isAlive());
    }

    @Test
    void moveBladeDownEmpty() throws IOException {
        Blade blade=new Blade(5,5,2);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(5, 6), blade.getPosition());
    }

    @Test
    void moveBladeDownNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(5, 6)));
        Blade blade=new Blade(5,5,2);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(0, 0), blade.getPosition());
        assertFalse(blade.isAlive());
    }

    @Test
    void moveBladeUpEmpty() throws IOException {
        Blade blade=new Blade(5,5,1);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(5, 4), blade.getPosition());
    }

    @Test
    void moveBladeUpNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(5, 4)));
        Blade blade=new Blade(5,5,1);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(0, 0), blade.getPosition());
        assertFalse(blade.isAlive());
    }

    @Test
    void moveBladeCase5() throws IOException {
        Blade blade=new Blade(5,5,5);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);

        assertNotNull(blade.getPosition());

    }

    @Test
    void moveBladeCase6() throws IOException {
        Blade blade=new Blade(5,5,6);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);

        assertNotNull(blade.getPosition());

    }

    @Test
    void moveBladeCase1SoulCollision() throws IOException {
        Soul soul = mock(Soul.class);
        when(soul.getPosition()).thenReturn(new Position(5, 4));
        arena.setSoul(soul);

        Blade blade = new Blade(5, 5, 1);
        arena.setBlades(Arrays.asList(blade));

        Music damage = mock(Music.class); // Mocking the Music class
        when(damage.loadSound(anyString())).thenReturn(mock(Clip.class));

        BladeController controller = new BladeController(arena);
        controller.setDamage(damage); // Set the mocked damage in the controller

        controller.step(game, GUI.ACTION.NONE, 1000);

        verify(soul).decreaseHP();

        verify(damage).stop();
        verify(damage).startonce();
    }

    @Test
    void moveBladeCase2SoulCollision() throws IOException {
        Soul soul = mock(Soul.class);
        when(soul.getPosition()).thenReturn(new Position(5, 6));
        arena.setSoul(soul);

        Blade blade = new Blade(5, 5, 2);
        arena.setBlades(Arrays.asList(blade));

        Music damage = mock(Music.class); // Mocking the Music class
        when(damage.loadSound(anyString())).thenReturn(mock(Clip.class));

        BladeController controller = new BladeController(arena);
        controller.setDamage(damage); // Set the mocked damage in the controller

        controller.step(game, GUI.ACTION.NONE, 1000);

        verify(soul).decreaseHP();

        verify(damage).stop();
        verify(damage).startonce();
    }

    @Test
    void moveBladeCase3SoulCollision() throws IOException {
        Soul soul = mock(Soul.class);
        when(soul.getPosition()).thenReturn(new Position(4, 5));
        arena.setSoul(soul);

        Blade blade = new Blade(5, 5, 3);
        arena.setBlades(Arrays.asList(blade));

        Music damage = mock(Music.class); // Mocking the Music class
        when(damage.loadSound(anyString())).thenReturn(mock(Clip.class));

        BladeController controller = new BladeController(arena);
        controller.setDamage(damage); // Set the mocked damage in the controller

        controller.step(game, GUI.ACTION.NONE, 1000);

        verify(soul).decreaseHP();

        verify(damage).stop();
        verify(damage).startonce();
    }

    @Test
    void moveBladeCase4SoulCollision() throws IOException {
        Soul soul = mock(Soul.class);
        when(soul.getPosition()).thenReturn(new Position(6, 5));
        arena.setSoul(soul);

        Blade blade = new Blade(5, 5, 4);
        arena.setBlades(Arrays.asList(blade));

        Music damage = mock(Music.class); // Mocking the Music class
        when(damage.loadSound(anyString())).thenReturn(mock(Clip.class));

        BladeController controller = new BladeController(arena);
        controller.setDamage(damage); // Set the mocked damage in the controller

        controller.step(game, GUI.ACTION.NONE, 1000);

        verify(soul).decreaseHP();

        verify(damage).stop();
        verify(damage).startonce();
    }

    @Test
    void moveBladeCase5SoulCollision() throws IOException {
        Soul soul = mock(Soul.class);
        when(soul.getPosition()).thenReturn(new Position(3, 6));
        arena.setSoul(soul);

        Blade blade = new Blade(5, 5, 5);
        arena.setBlades(Arrays.asList(blade));

        Music damage = mock(Music.class); // Mocking the Music class
        when(damage.loadSound(anyString())).thenReturn(mock(Clip.class));

        BladeController controller = new BladeController(arena);
        controller.setDamage(damage); // Set the mocked damage in the controller

        controller.step(game, GUI.ACTION.NONE, 1000);

        verify(soul).decreaseHP();

        verify(damage).stop();
        verify(damage).startonce();
    }

    @Test
    void moveBladeCase6SoulCollision() throws IOException {
        Soul soul = mock(Soul.class);
        when(soul.getPosition()).thenReturn(new Position(7, 6));
        arena.setSoul(soul);

        Blade blade = new Blade(5, 5, 6);
        arena.setBlades(Arrays.asList(blade));

        Music damage = mock(Music.class); // Mocking the Music class
        when(damage.loadSound(anyString())).thenReturn(mock(Clip.class));

        BladeController controller = new BladeController(arena);
        controller.setDamage(damage); // Set the mocked damage in the controller

        controller.step(game, GUI.ACTION.NONE, 1000);

        verify(soul).decreaseHP();

        verify(damage).stop();
        verify(damage).startonce();
    }

    @Test
    void moveBladeCase5Boundary() throws IOException {
        Blade blade = new Blade(5, 5, 5);
        arena.setBlades(Arrays.asList(blade));
        arena.setWalls(Arrays.asList(new Wall(3, 6)));

        controller.step(game, GUI.ACTION.NONE, 1000);

        assertEquals(new Position(0, 0), blade.getPosition());
        assertFalse(blade.isAlive());
    }

    @Test
    void moveBladeCase6Boundary() throws IOException {
        Blade blade = new Blade(5, 5, 6);
        arena.setBlades(Arrays.asList(blade));
        arena.setWalls(Arrays.asList(new Wall(7, 6)));

        controller.step(game, GUI.ACTION.NONE, 1000);

        assertEquals(new Position(0, 0), blade.getPosition());
        assertFalse(blade.isAlive());
    }



}
