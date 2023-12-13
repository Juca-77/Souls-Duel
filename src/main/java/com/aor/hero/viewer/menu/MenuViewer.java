package com.aor.hero.viewer.menu;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.menu.Menu;
import com.aor.hero.viewer.Viewer;

public class MenuViewer extends Viewer<Menu> {
    public MenuViewer(Menu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {

        int menuWidth = 100;
        int titleX = (menuWidth - "Menu".length()) / 2;
        gui.drawText(new Position(titleX-1, 28), "Menu", "#FFFFFF");
        int entryX = (menuWidth - getModel().getEntry(0).length()) / 2;
        for (int i = 0; i < getModel().getNumberEntries(); i++) {
            //int entryX = (menuWidth - getModel().getEntry(i).length()) / 2;
            gui.drawText(new Position(entryX, 30 + i), getModel().getEntry(i), getModel().isSelected(i) ? "#FFD700" : "#FFFFFF");
        }
    }
}
