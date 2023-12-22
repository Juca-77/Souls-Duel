package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.viewer.game.BladeViewer;
import SoulsDuel.viewer.game.SoulViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BladeViewerTest {
    private Blade blade;
    private BladeViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        blade = new Blade(10, 10,1);
        viewer = new BladeViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(blade, gui);
        Mockito.verify(gui, Mockito.times(1)).drawBlade(blade.getPosition());
    }
}
