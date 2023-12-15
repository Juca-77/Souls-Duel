package controller;

import SoulsDuel.Game;
import SoulsDuel.controller.game.GrenadeController;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Grenade;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class GrenadeControllerTest {
    private GrenadeController controller;
    private Soul soul;
    private Arena arena;
    private Game game;

    @BeforeEach
    void setUp() {
        arena = new Arena(10, 10,1);

        soul = new Soul(5, 5);
        arena.setHero(soul);

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
    void grenadeExplode() throws IOException {
        Grenade grenade=new Grenade(5,5,1);
        arena.setGrenades(Arrays.asList(grenade));
        long time=1000;
        controller.step(game, GUI.ACTION.NONE, time);
        time+=1000;
        controller.step(game, GUI.ACTION.NONE, time);
        time+=1000;
        controller.step(game, GUI.ACTION.NONE, time);
        time+=1000;
        controller.step(game, GUI.ACTION.NONE, time);
        time+=1000;
        controller.step(game, GUI.ACTION.NONE, time);
        time+=1000;
        controller.step(game, GUI.ACTION.NONE, time);
        assertEquals(new Position(0, 0), grenade.getPosition());
        assertFalse(grenade.isAlive());
    }
}
