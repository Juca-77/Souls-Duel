package SoulsDuel.gui;

import SoulsDuel.model.Position;

import java.io.IOException;

public interface GUI {
    ACTION getNextAction() throws IOException;

    void drawHero(Position position);

    void drawEnemy(Position position, int level);
    void drawImage(Position position);
    void drawDead(Position position);

    void drawWin(Position position);

    void drawBlade(Position position);

    void drawGrenade(Position position);

    void drawWall(Position position);

    void drawText(Position position, String text, String color);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;
    public int getHeigth();
    public int getWidth();

    enum ACTION {UP, RIGHT, DOWN, LEFT, NONE, QUIT, SELECT}
}
