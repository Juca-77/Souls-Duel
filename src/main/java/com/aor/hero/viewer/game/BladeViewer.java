package com.aor.hero.viewer.game;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.elements.Blade;
import com.aor.hero.model.game.elements.Enemy;

public class BladeViewer implements ElementViewer<Blade>{
    @Override
    public void draw(Blade blade, GUI gui) {
        if(blade.isAlive()) {
            gui.drawBlade(blade.getPosition());
        }
    }
}
