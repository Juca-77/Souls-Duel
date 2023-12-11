package com.aor.hero.viewer.game;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.arena.Arena;
import com.aor.hero.model.game.elements.Element;
import com.aor.hero.model.game.elements.Enemy;
import com.aor.hero.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        //drawElements(gui, getModel().getMonsters(), new MonsterViewer());
        drawElement(gui, getModel().getHero(), new HeroViewer());
        drawElement(gui, getModel().getEnemy(), new EnemyViewer());
        drawElements(gui, getModel().getBlades(), new BladeViewer());

        gui.drawText(new Position(getModel().getWidth()/2-15, 41), "HP: " + getModel().getHero().getHp() + "/5", "#FFFFFF");
        gui.drawText(new Position(getModel().getWidth()/2+9, 41), "LEVEL:" + getModel().getLevel(), "#FFFFFF");
    }

    private <T extends Element> void drawElements(GUI gui, List<T> elements, ElementViewer<T> viewer) {
        for (T element : elements)
            drawElement(gui, element, viewer);
    }

    private <T extends Element> void drawElement(GUI gui, T element, ElementViewer<T> viewer) {
        viewer.draw(element, gui);
    }
}
