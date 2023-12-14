package SoulsDuel.viewer.game;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Blade;

public class BladeViewer implements ElementViewer<Blade>{
    @Override
    public void draw(Blade blade, GUI gui) {
        if(blade.isAlive()) {
            gui.drawBlade(blade.getPosition());
        }
    }
}
