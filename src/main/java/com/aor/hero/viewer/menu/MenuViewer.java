package com.aor.hero.viewer.menu;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.game.elements.Wall;
import com.aor.hero.model.menu.MainMenu;
import com.aor.hero.viewer.Viewer;

import java.util.ArrayList;
import java.util.List;

public class MenuViewer extends Viewer<MainMenu> {
    public MenuViewer(MainMenu menu) {
        super(menu);
    }

    @Override
    public void drawElements(GUI gui) {

        int menuWidth = 100;
        int titleX = (menuWidth - "Menu".length()) / 2;
        gui.drawText(new Position(50-3, 33), "Menu", "#FFFFFF");

        for (int i = 0; i < getModel().getNumberEntries(); i++) {
            //int entryX = (menuWidth - getModel().getEntry(i).length()) / 2;
            gui.drawText(new Position(50-7+7*i, 35), getModel().getEntry(i), getModel().isSelected(i) ? "#FF0000" : "#FFFFFF");
        }
        gui.drawImage(new Position(0,0));
    }
}
