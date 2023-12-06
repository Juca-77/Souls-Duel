package com.aor.hero.viewer.game;

import com.aor.hero.gui.GUI;
import com.aor.hero.model.game.elements.Element;
import com.aor.hero.model.game.elements.Enemy;

public class EnemyViewer implements ElementViewer<Enemy>{
    @Override
    public void draw(Enemy enemy, GUI gui) {
        gui.drawEnemy(enemy.getPosition(), enemy.getEnemyLevel());
    }
}
