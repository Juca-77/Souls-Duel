package SoulsDuel.controller;

import SoulsDuel.Game;
import SoulsDuel.controller.game.BladeController;


import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        arena.setHero(soul);

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
        // Add additional assertions based on your requirements for case 5
    }

    @Test
    void moveBladeCase6() throws IOException {
        Blade blade=new Blade(5,5,6);
        arena.setBlades(Arrays.asList(blade));
        controller.step(game, GUI.ACTION.NONE, 1000);

        assertNotNull(blade.getPosition());
        // Add additional assertions based on your requirements for case 5
    }


}