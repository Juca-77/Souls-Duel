package model;

import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.arena.ArenaBuilder;
import SoulsDuel.model.game.elements.Blade;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

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


}
