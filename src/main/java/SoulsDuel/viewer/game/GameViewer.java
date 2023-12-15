package SoulsDuel.viewer.game;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.game.arena.Arena;
import SoulsDuel.model.game.elements.Element;
import SoulsDuel.viewer.Viewer;

import java.util.List;

public class GameViewer extends Viewer<Arena> {
    public GameViewer(Arena arena) {
        super(arena);
    }

    @Override
    public void drawElements(GUI gui) {
        drawElements(gui, getModel().getWalls(), new WallViewer());
        //drawElements(gui, getModel().getMonsters(), new MonsterViewer());
        drawElement(gui, getModel().getHero(), new SoulViewer());
        drawElement(gui, getModel().getEnemy(), new EnemyViewer());
        drawElements(gui, getModel().getBlades(), new BladeViewer());
        drawElements(gui, getModel().getGrenades(), new GrenadeViewer());

        gui.drawText(new Position(getModel().getWidth()/2-15, 41), "HP: " + getModel().getHero().getHp() + "/30", "#FFFFFF");
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
