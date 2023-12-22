package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Grenade;
import SoulsDuel.viewer.game.BladeViewer;
import SoulsDuel.viewer.game.GrenadeViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GrenadeViewerTest {
    private Grenade grenade;
    private GrenadeViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        grenade = new Grenade(10, 10,1);
        viewer = new GrenadeViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(grenade, gui);
        Mockito.verify(gui, Mockito.times(1)).drawGrenade(grenade.getPosition());
    }
}
