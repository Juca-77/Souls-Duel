package SoulsDuel.viewer.game;

import SoulsDuel.gui.GUI;
import SoulsDuel.model.game.elements.Enemy;

public class EnemyViewer implements ElementViewer<Enemy>{
    @Override
    public void draw(Enemy enemy, GUI gui) {
        gui.drawEnemy(enemy.getPosition(), enemy.getEnemyLevel());
    }
}
