package SoulsDuel.viewer.menu;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.menu.DeadMenu;
import SoulsDuel.viewer.Viewer;

public class DeadViewer extends Viewer<DeadMenu> {
    public DeadViewer(DeadMenu model) {
        super(model);
    }

    @Override
    public void drawElements(GUI gui) {
        int menuWidth = 100;

        for (int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(new Position(51-8+8*i, 42), getModel().getEntry(i), getModel().isSelected(i) ? "#FF0000" : "#FFFFFF");
        }
        gui.drawDead(new Position(16,20));
    }
}
