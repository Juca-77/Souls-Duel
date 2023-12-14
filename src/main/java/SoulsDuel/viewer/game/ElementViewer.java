package SoulsDuel.viewer.game;

import SoulsDuel.gui.GUI;

public interface ElementViewer<T> {
    void draw(T element, GUI gui);
}
