package com.aor.hero.viewer.menu;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.Position;
import com.aor.hero.model.menu.WinMenu;
import com.aor.hero.viewer.Viewer;

public class WinViewer extends Viewer<WinMenu> {
    public WinViewer(WinMenu model) {
        super(model);
    }

    @Override
    protected void drawElements(GUI gui) {
        int menuWidth = 100;
        int entryX = (menuWidth - getModel().getEntry(0).length()) / 2;
        gui.drawWin(new Position(49-23,25));
        for (int i = 0; i < getModel().getNumberEntries(); i++) {
            gui.drawText(new Position(entryX, 42 + i), getModel().getEntry(i), getModel().isSelected(i) ? "#FF0000" : "#FFFFFF");
        }
    }
}
