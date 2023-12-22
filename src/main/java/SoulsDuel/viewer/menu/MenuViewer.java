package SoulsDuel.viewer.menu;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.Position;
import SoulsDuel.model.menu.MainMenu;
import SoulsDuel.viewer.Viewer;

public class MenuViewer extends Viewer<MainMenu> {
    public MenuViewer(MainMenu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {


        gui.drawText(new Position(50-3, 33), "Menu", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++) {

            gui.drawText(new Position(50-7+7*i, 35), getModel().getEntry(i), getModel().isSelected(i) ? "#FF0000" : "#FFFFFF");
        }
        gui.drawImage(new Position(0,0));
    }
}
