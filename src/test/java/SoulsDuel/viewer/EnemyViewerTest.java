package SoulsDuel.viewer;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Enemy;
import SoulsDuel.viewer.game.BladeViewer;
import SoulsDuel.viewer.game.EnemyViewer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class EnemyViewerTest {
    private Enemy enemy;
    private EnemyViewer viewer;
    private GUI gui;

    @BeforeEach
    void setUp() {
        enemy = new Enemy(10, 10,1);
        viewer = new EnemyViewer();
        gui = Mockito.mock(GUI.class);
    }

    @Test
    void drawElement() {
        viewer.draw(enemy, gui);
        Mockito.verify(gui, Mockito.times(1)).drawEnemy(enemy.getPosition(), enemy.getEnemyLevel());
    }
}
