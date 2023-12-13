package com.aor.hero.viewer.game;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.elements.Grenade;

public class GrenadeViewer implements ElementViewer<Grenade> {

    @Override
    public void draw(Grenade grenade, GUI gui) {
        if(grenade.isAlive()) {
            gui.drawBlade(grenade.getPosition());
        }
    }
}
