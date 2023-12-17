package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.viewer.game.SoulViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SoulViewerTest {
    private Soul soul;
    private SoulViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        soul = new Soul(10, 10);
        viewer = new SoulViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(soul, gui);
        Mockito.verify(gui, Mockito.times(1)).drawHero(soul.getPosition());
    }
}