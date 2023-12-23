package SoulsDuel.model;

import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.arena.ArenaBuilder;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Grenade;
import SoulsDuel.model.game.elements.Soul;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

public class ArenaBuilderTest {



    @Test
    void bladesSpawn1() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBlades1());

        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }
    @Test
    void bladesSpawn2() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBlades2_1());
        arena.addBlades(ab.createBlades2_2());
        arena.addBlades(ab.createBlades2_1L());
        arena.addBlades(ab.createBlades2_2L());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }

    @Test
    void bladesSpawn3() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBlades3());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }

    @Test
    void bladesSpawn4() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBlades4());
        arena.addBlades(ab.createBlades4_1());
        arena.addBlades(ab.createBlades4_2());
        arena.addBlades(ab.createBlades4_3());
        arena.addBlades(ab.createBlades4_4());
        arena.addBlades(ab.createBlades4_5());
        arena.addBlades(ab.createBlades4_6());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }

    @Test
    void bladesParalelsSpawn() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBladesParalels1());
        arena.addBlades(ab.createBladesParalels2());
        arena.addBlades(ab.createBladesParalels3());
        arena.addBlades(ab.createBladesParalels4());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }

    @Test
    void bladesSpawn5() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBlades5_1());
        arena.addBlades(ab.createBlades5_2());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }

    @Test
    void bladesSpawn6() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBlades6CD());
        arena.addBlades(ab.createBlades6CU());
        arena.addBlades(ab.createBlades6RU());
        arena.addBlades(ab.createBlades6LU());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }
    @Test
    void bladesSpawnCos() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addBlades(ab.createBladesCos1());
        arena.addBlades(ab.createBladesCos1_1());
        arena.addBlades(ab.createBladesCos1_2());
        arena.addBlades(ab.createBladesCos2());
        arena.addBlades(ab.createBladesCos2_1());
        arena.addBlades(ab.createBladesCos2_2());
        arena.addBlades(ab.createBladesCos2_3());
        arena.addBlades(ab.createBladesCos3());
        arena.addBlades(ab.createBladesCos3_1());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }

    @Test
    void GrenadesSpawn() throws IOException {
        ArenaBuilder ab=new ArenaBuilder(1, 100, 70);
        Arena arena = ab.createArena();
        arena.addGrenades(ab.createGrenade());
        arena.addGrenades(ab.createGrenades());
        arena.addGrenades(ab.createGrenades2());
        arena.addGrenades(ab.createGrenades3());
        arena.addGrenades(ab.createGrenadesLast());
        for(Blade bl: arena.getBlades()) {
            double x=bl.getPosition().getX();
            double y =bl.getPosition().getY();
            assertTrue(x > 100/2-15 & x<100/2+15 & y>70/2-9 & y<70/2+4);
        }
    }




    @Test
    void testCreateArena1() throws IOException {
        // Arrange
        ArenaBuilder arenaBuilder = new ArenaBuilder(1,100,70);


        // Act
        Arena createdArena = arenaBuilder.createArena();

        // Assert
        assertEquals(1, createdArena.getLevel());
        assertEquals(100, createdArena.getWidth());

    }

    @Test
    void testCreateBlades4_1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4_1();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());


        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 33), blades.get(4).getPosition());

    }
    @Test
    void testCreateBlades4_2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4_2();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());




        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 33), blades.get(4).getPosition());

    }

    @Test
    void testCreateBlades4_3() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4_3();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());


        assertEquals(new Position(width/2-14,27), blades.get(0).getPosition());
        assertEquals(new Position(width/2-14,35), blades.get(6).getPosition());

    }

    @Test
    void testCreateBlades4_4() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4_4();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());


        assertEquals(new Position(width/2-14,27), blades.get(0).getPosition());
        assertEquals(new Position(width/2-14,36), blades.get(7).getPosition());

    }

    @Test
    void testCreateBlades4_5() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4_5();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());



        assertEquals(new Position(width/2-14,27), blades.get(0).getPosition());
        assertEquals(new Position(width/2-14,37), blades.get(8).getPosition());


    }

    @Test
    void testCreateBlades1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades1();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());


        assertEquals(new Position(width/2-14,27), blades.get(0).getPosition());

    }

    @Test
    void testCreateBladesParalels1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesParalels1();

        // Assert
        // Test the size of the resulting list
        assertEquals(29, blades.size());


        assertEquals(new Position(width/2-14,27), blades.get(0).getPosition());
        assertEquals(new Position(width/2+5,27), blades.get(10).getPosition());
        assertEquals(new Position(width/2-4,38), blades.get(20).getPosition());

    }
    @Test
    void testCreateBladesParalels2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesParalels2();

        // Assert
        // Test the size of the resulting list
        assertEquals(29, blades.size());

        assertEquals(new Position(width / 2 - 14, 38), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 5, 38), blades.get(10).getPosition());
        assertEquals(new Position(width / 2 - 4, 27), blades.get(20).getPosition());

    }

    @Test
    void testCreateBladesParalels3() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesParalels3();

        // Assert
        // Test the size of the resulting list
        assertEquals(12, blades.size());


        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 35), blades.get(4).getPosition());
        assertEquals(new Position(width / 2 + 14, 31), blades.get(8).getPosition());

    }

    @Test
    void testCreateBladesParalels4() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesParalels4();

        // Assert
        // Test the size of the resulting list
        assertEquals(12, blades.size());


        assertEquals(new Position(width / 2 + 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 14, 35), blades.get(4).getPosition());
        assertEquals(new Position(width / 2 - 14, 31), blades.get(8).getPosition());

    }
    @Test
    void testCreateBlades2_1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades2_1();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());


        assertEquals(new Position(width / 2 - 14, 30), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 38), blades.get(8).getPosition());


    }

    @Test
    void testCreateBlades2_2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades2_2();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());


        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 35), blades.get(8).getPosition());


    }

    @Test
    void testCreateBlades3() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades3();

        // Assert
        // Test the size of the resulting list
        assertEquals(28, blades.size());


        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2-14,27), blades.get(8).getPosition());

    }

    @Test
    void testCreateBlades4() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());

        assertEquals(new Position(width / 2-14,27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 34), blades.get(5).getPosition());

    }

    @Test
    void testCreateBlades4_6() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades4_6();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());


        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 - 14, 31), blades.get(2).getPosition());


    }

    @Test
    void testCreateBlades2_1L() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades2_1L();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());


        assertEquals(new Position(width / 2 + 14, 30), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 14, 38), blades.get(8).getPosition());

    }

    @Test
    void testCreateBlades2_2L() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades2_2L();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());


        assertEquals(new Position(width / 2 + 14, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 14, 35), blades.get(8).getPosition());

    }

    @Test
    void testCreateBlades5_1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades5_1();

        // Assert
        // Test the size of the resulting list
        assertEquals(15, blades.size());


        assertEquals(new Position(width / 2 - 14, 27), blades.get(0).getPosition());

    }

    @Test
    void testCreateBlades5_2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades5_2();

        // Assert
        // Test the size of the resulting list
        assertEquals(14, blades.size());


        assertEquals(new Position(width / 2 - 13, 38), blades.get(0).getPosition());


    }

    @Test
    void testCreateBlades6LU() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades6LU();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());


        assertEquals(new Position(width / 2 + 5, 38), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 14, 38), blades.get(9).getPosition());


    }

    @Test
    void testCreateBlades6RU() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades6RU();

        // Assert
        // Test the size of the resulting list
        assertEquals(10, blades.size());


        assertEquals(new Position(width / 2 - 14, 38), blades.get(0).getPosition());


    }

    @Test
    void testCreateBlades6CU() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades6CU();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());


        assertEquals(new Position(width / 2 - 4, 38), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 4, 38), blades.get(8).getPosition());

    }

    @Test
    void testCreateBlades6CD() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBlades6CD();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, blades.size());

        assertEquals(new Position(width / 2 - 4, 27), blades.get(0).getPosition());
        assertEquals(new Position(width / 2 + 4, 27), blades.get(8).getPosition());

    }
    @Test
    void testCreateBladesCos1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos1();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, blades.size());

        assertEquals(new Position(width / 2, 27), blades.get(0).getPosition());

    }

    @Test
    void testCreateBladesCos1_1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos1_1();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, blades.size());


        assertEquals(new Position(width / 2 - 1, 27), blades.get(0).getPosition());

    }
    @Test
    void testCreateBladesCos1_2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos1_2();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, blades.size());


        assertEquals(new Position(width / 2-2,27), blades.get(0).getPosition());


    }
    @Test
    void testCreateBladesCos2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos2();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, blades.size());

        assertEquals(new Position(width / 2,27), blades.get(0).getPosition());

    }

    @Test
    void testCreateBladesCos2_1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos2_1();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, blades.size());


        assertEquals(new Position(width / 2+1,27), blades.get(0).getPosition());

    }

    @Test
    void testCreateBladesCos2_2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos2_2();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, blades.size());


        assertEquals(new Position(width / 2+2,27), blades.get(0).getPosition());

    }

    @Test
    void testCreateBladesCos2_3() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos2_3();

        // Assert
        // Test the size of the resulting list
        assertEquals(2, blades.size());


        assertEquals(new Position(width / 2+1,27), blades.get(0).getPosition());


    }


    @Test
    void testCreateBladesCos3() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos3();

        // Assert
        // Test the size of the resulting list
        assertEquals(4, blades.size());


        assertEquals(new Position(width / 2 + 5, 27), blades.get(0).getPosition());

        assertEquals(new Position(width / 2 - 5, 27), blades.get(1).getPosition());

    }
    @Test
    void testCreateBladesCos3_1() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Blade> blades = arenaBuilder.createBladesCos3_1();

        // Assert
        // Test the size of the resulting list
        assertEquals(2, blades.size());


        assertEquals(new Position(width / 2-13,27), blades.get(0).getPosition());

        assertEquals(new Position(width / 2+13,27), blades.get(1).getPosition());


    }

    @Test
    void testCreateGrenade() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Grenade> grenades = arenaBuilder.createGrenade();

        // Assert
        // Test the size of the resulting list
        assertEquals(1, grenades.size());


        assertEquals(new Position(width / 2, 27), grenades.get(0).getPosition());

    }

    @Test
    void testCreateGrenades() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Grenade> grenades = arenaBuilder.createGrenades();

        // Assert
        // Test the size of the resulting list
        assertEquals(9, grenades.size());


        assertEquals(new Position(width / 2 - 8, 27), grenades.get(0).getPosition());

    }

    @Test
    void testCreateGrenades2() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Grenade> grenades = arenaBuilder.createGrenades2();

        // Assert
        // Test the size of the resulting list
        assertEquals(26, grenades.size());


        assertEquals(new Position(width / 2 - 14, 27), grenades.get(0).getPosition());


    }

    @Test
    void testCreateGrenades3() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Grenade> grenades = arenaBuilder.createGrenades3();

        // Assert
        // Test the size of the resulting list
        assertEquals(12, grenades.size());


        assertEquals(new Position(width / 2 - 14, 27), grenades.get(0).getPosition());

    }

    @Test
    void testCreateGrenadesLast() throws IOException {
        // Arrange
        int width = 100; // replace with the actual width of your arena
        ArenaBuilder arenaBuilder = new ArenaBuilder(1, width, 70);

        // Act
        List<Grenade> grenades = arenaBuilder.createGrenadesLast();

        // Assert
        // Test the size of the resulting list
        assertEquals(18, grenades.size());


        assertEquals(new Position(width / 2 - 14, 27), grenades.get(0).getPosition());

    }
}