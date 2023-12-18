package SoulsDuel.controller;

import SoulsDuel.controller.game.SoulController;
import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.arena.ArenaBuilder;

import net.jqwik.api.*;
import net.jqwik.api.constraints.IntRange;

import java.io.IOException;
import java.util.List;

public class ArenaIsClosedTest {

    //***Erro Stereo??***, o teste roda :)
    @Property
    void allArenasAreClosed(@ForAll @IntRange(min = 1, max = 5) int level,@ForAll @IntRange(min = 49, max = 100) int width, @ForAll @IntRange(min = 60, max = 70) int height, @ForAll List<GUI.@From("moveActions") ACTION> actions) throws IOException {
        ArenaBuilder ab = new ArenaBuilder(level, width, height);
        Arena arena = ab.createArena();
        SoulController controller = new SoulController(arena);

        for (GUI.ACTION action : actions) {
            controller.step(null, action, 100);
            assert (controller.getModel().getHero().getPosition().getX() > ((double)width)/2-15);
            assert (controller.getModel().getHero().getPosition().getY() > ((double)height)/2-9);
            assert (controller.getModel().getHero().getPosition().getX() < ((double)width)/2+15);
            assert (controller.getModel().getHero().getPosition().getY() < ((double)height)/2+4);
        }
    }

    @Provide
    Arbitrary<GUI.ACTION> moveActions() {
        return Arbitraries.of(GUI.ACTION.UP, GUI.ACTION.RIGHT, GUI.ACTION.DOWN, GUI.ACTION.LEFT);
    }
}
