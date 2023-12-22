package SoulsDuel.controller;

import SoulsDuel.Game;
import SoulsDuel.controller.game.BladeController;
import SoulsDuel.controller.game.GrenadeController;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Grenade;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;
import SoulsDuel.viewer.Music;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.sound.sampled.Clip;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class GrenadeControllerTest {
    private GrenadeController controller;
    private Soul soul;
    private Arena arena;
    private Game game;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10,1);

        soul = new Soul(5, 5);
        arena.setSoul(soul);

        arena.setWalls(Arrays.asList());
        arena.setGrenades(Arrays.asList());

        controller = new GrenadeController(arena);

        game = Mockito.mock(Game.class);
    }
    @Test
    void moveGrenadeRightEmpty() throws IOException {
        Grenade grenade=new Grenade(5,5,4);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(6, 5), grenade.getPosition());
    }

    @Test
    void moveGrenadeRightNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(6, 5)));
        Grenade grenade=new Grenade(5,5,4);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertFalse(grenade.isAlive());
    }

    @Test
    void moveGrenadeLeftEmpty() throws IOException {
        Grenade grenade=new Grenade(5,5,3);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(4, 5), grenade.getPosition());
    }

    @Test
    void moveGrenadeLeftNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(4, 5)));
        Grenade grenade=new Grenade(5,5,3);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertFalse(grenade.isAlive());
    }

    @Test
    void moveGrenadeDownEmpty() throws IOException {
        Grenade grenade=new Grenade(5,5,2);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(5, 6), grenade.getPosition());
    }

    @Test
    void moveGrenadeDownNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(5, 6)));
        Grenade grenade=new Grenade(5,5,2);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertFalse(grenade.isAlive());
    }

    @Test
    void moveGrenadeUpEmpty() throws IOException {
        Grenade grenade=new Grenade(5,5,1);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(5, 4), grenade.getPosition());
    }

    @Test
    void moveGrenadeUpNotEmpty() throws IOException {
        arena.setWalls(Arrays.asList(new Wall(5, 4)));
        Grenade grenade=new Grenade(5,5,1);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertFalse(grenade.isAlive());
    }

    @Test
    void moveGrenadeCaseNotAlive() throws IOException {
        Grenade grenade = new Grenade(4, 6, 1);
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        controller.step(game, GUI.ACTION.NONE, 2000);
        controller.step(game, GUI.ACTION.NONE, 3000);
        controller.step(game, GUI.ACTION.NONE, 4000);
        controller.step(game, GUI.ACTION.NONE, 5000);
        controller.step(game, GUI.ACTION.NONE, 6000);


        assertEquals(new Position(0, 0), grenade.getPosition());
        assertEquals(0, grenade.getMoves());
        assertFalse(grenade.isAlive());
    }
/*
    @Test
    void moveGrenadeCaseNotAliveAndPositionNotZero() throws IOException {
        Grenade grenade = new Grenade(5, 5, 1, 0);
        grenade.setPosition(new Position(1, 1));
        arena.setGrenades(Arrays.asList(grenade));
        controller.step(game, GUI.ACTION.NONE, 1000);
        assertEquals(new Position(0, 0), grenade.getPosition());
        assertFalse(grenade.isAlive());
        assertEquals(3, getModel().getBlades().size());
        assertNull(getModel().getGrenades());
    }*/

}