package controller;

import com.aor.hero.Game;
import com.aor.hero.controller.game.BladeController;


import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.elements.Blade;
import com.aor.hero.model.game.elements.Hero;
import com.aor.hero.model.game.elements.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BladeControllerTest {
    private BladeController controller;
    private Hero hero;
    private Arena arena;
    private Game game;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10,1);

        hero = new Hero(5, 5);
        arena.setHero(hero);

        arena.setWalls(Arrays.asList());
        arena.setBlades(Arrays.asList());

        controller = new BladeController(arena);

        game = Mockito.mock(Game.class);
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
}
