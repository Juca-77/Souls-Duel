package SoulsDuel.viewer.game;

import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.gui.GUI;

public class SoulViewer implements ElementViewer<Soul> {
    @Override
    public void draw(Soul soul, GUI gui) {
        gui.drawHero(soul.getPosition());
    }
}
