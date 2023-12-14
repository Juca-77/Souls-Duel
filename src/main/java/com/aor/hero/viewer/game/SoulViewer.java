package com.aor.hero.viewer.game;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.elements.Soul;

public class SoulViewer implements ElementViewer<Soul> {
    @Override
    public void draw(Soul soul, GUI gui) {
        gui.drawHero(soul.getPosition());
    }
}
