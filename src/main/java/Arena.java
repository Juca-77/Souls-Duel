import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {

    private int width;
    private int height;
    private Soul Soul;
    private List<Wall> walls;
    private List<Coin> coins;
    private List<Monster> monsters;


    public Arena(int width, int height){
        this.width = width;
        this.height = height;
        this.walls = createWalls();
        this.coins = createCoins();
        this.monsters = createMonsters();
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }
        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }
        return walls;
    }
    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int aw = random.nextInt(width - 2) + 1;
            int bh = random.nextInt(height - 2) + 1;
            if (aw == 10 && bh == 10) {
                i--;
            } else if (abv(coins, aw, bh)) {
                coins.add(new Coin(aw, bh));
            } else {
                i--;
            }
        }

        return coins;
    }
    private boolean abv(ArrayList<Coin> coins, int a, int b) {
        for (Coin coin : coins) {
            if (coin.getPosition().getX() == a && coin.getPosition().getX() == b) {
                return false;
            }
        }
        return true;
    }

    public void retrieveCoins(Coin coin){
        coins.remove(coin);

    }
    public void set_Soul(Soul Soul){
        this.Soul = Soul;
    }
    private void verifyMonsterCollisions(Screen screen) {
        for (Monster monster : monsters)
            if (Soul.getPosition().equals(monster.getPosition())) {
                System.out.println("You lost!");
                System.exit(0);
            }
    }
    public void processKey(KeyStroke key,Screen screen) throws IOException {
        System.out.println(key);
        if (key.getKeyType() == KeyType.ArrowUp) {
            moveSoul(Soul.moveUp());
            moveMonsters();
            verifyMonsterCollisions(screen);

        }
        if (key.getKeyType() == KeyType.ArrowLeft) {
            moveSoul(Soul.moveLeft());
            moveMonsters();
            verifyMonsterCollisions(screen);
        }
        if (key.getKeyType() == KeyType.ArrowRight) {
            moveSoul(Soul.moveRight());
            moveMonsters();
            verifyMonsterCollisions(screen);

        }
        if (key.getKeyType() == KeyType.ArrowDown) {
            moveSoul(Soul.moveDown());
            moveMonsters();
            verifyMonsterCollisions(screen);

        }
        if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q') {
            screen.close();
        }

      

    }
    private List<Monster> createMonsters() {
        ArrayList<Monster> monsters = new ArrayList<>();
        monsters.add (new Monster(25,15));
        return monsters;
    }

    public void moveMonsters(){
        for (Monster monster : monsters){
            Position p = monster.move();
            if(canMonsterMove(p)){
                monster.set_position(p);
            }
        }
    }
    private boolean canMonsterMove(Position position) {
        if (!coins.isEmpty()) {
            for (Coin coin : coins) {
                if (coin.getPosition().equals(position)) {
                    return false;
                }
            }
            for (Wall wall : walls) {
                if (wall.getPosition().equals(position)) {
                    return false;
                }
            }
            return (position.getX() < width && position.getX() >= 0 && position.getY() < height && position.getY() >= 0);
        } else {
            for (Wall wall : walls) {
                if (wall.getPosition().equals(position)) {
                    return false;
                }
            }
            return (position.getX() < width && position.getX() >= 0 && position.getY() < height && position.getY() >= 0);
        }

    }

    public void moveSoul(Position position) {
        if(!coins.isEmpty()) {
            for (Coin coin : coins) {
                if (canSoulMove(position) && !position.equals(coin.getPosition())) {
                    Soul.set_position(position);
                }
                if (canSoulMove(position) && position.equals(coin.getPosition())) {
                    Soul.set_position(position);
                    retrieveCoins(coin);
                    break;
                }
            }
        }

            else{
                if (canSoulMove(position))
                    Soul.set_position(position);
            }

    }

    private boolean canSoulMove(Position position) {
        if((position.getX()>width-1)||(position.getX()<0)||(position.getY()>height-1)||(position.getY()<0)){
            return false;
        }
        for (Wall wall : walls){
            if (wall.getPosition().equals(position)) return false;}

            return true;

    }
    public void draw(TextGraphics graphics) throws IOException {
        graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(width, height), ' ');
        Soul.draw(graphics);
        for (Wall wall : walls)
            wall.draw(graphics);
        for (Coin coin : coins){
            coin.draw(graphics);
        for (Monster moster: monsters){
            moster.draw(graphics);
        }



        }


    }


}
