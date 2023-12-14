package SoulsDuel.viewer.game;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Grenade;

public class GrenadeViewer implements ElementViewer<Grenade> {

    @Override
    public void draw(Grenade grenade, GUI gui) {
        if(grenade.isAlive()) {
            gui.drawGrenade(grenade.getPosition());
        }
    }
}
