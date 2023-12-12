package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.elements.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class LoaderArenaBuilder {
    private int level;
    private int width;
    private int height;
    private int seconds =0;

    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight(), level);
        arena.setWalls(createWalls());
        arena.setEnemy(createEnemy());
        arena.setHero(createHero());
        arena.setBlades(new ArrayList<>());
        //arena.setMonsters(createMonsters());
        Timer timer = new Timer();
        /*timer.schedule(new TimerTask() {
           @Override
            public void run() {
                arena.addBlades(createBlades1());
                level++;
                arena.setLevel(level);
                arena.setEnemy(createEnemy());
            }
        }, 3000);*/
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades1());
            }
        }, 1200);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_0());
            }
        }, 5500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, 7500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, 9500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 12800);

        return arena;
    }

    private List<Blade> createAdditionalBlades() {
        // Create and return a list of additional blades
        // You may want to customize this method based on your game logic
        return new ArrayList<>();
    }

    public LoaderArenaBuilder(int level, int width, int height) throws IOException {
        this.level = level;
        this.width=width;
        this.height=height;
    }




    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }


    public List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < 29; c++) {
            walls.add(new Wall(getWidth()/2-14+c, 26));
            walls.add(new Wall(getWidth()/2-14+c, 39));
        }
        for (int r = 1; r < 15; r++) {
            walls.add(new Wall(getWidth()/2-15, 25+r));
            walls.add(new Wall(getWidth()/2+15, 25+r));
        }
        return walls;
    }


    public List<Monster> createMonsters() {
        List<Monster> monsters = new ArrayList<>();
/*
        for (int y = 0; y < lines.size(); y++) {
            String line = lines.get(y);
            for (int x = 0; x < line.length(); x++)
                if (line.charAt(x) == 'M') monsters.add(new Monster(x, y));
        }*/

        return monsters;
    }


    public Hero createHero() {
        return new Hero(getWidth()/2, 32);
    }


    public Enemy createEnemy(){return new Enemy(getWidth()/2-24, 0,level);}
    
    public List<Blade> createBlades1() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }
    public List<Blade> createBlades2_0() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<10;i++) {
            blades.add(new Blade(getWidth()/2-14+i,27, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<10;i++) {
            blades.add(new Blade(getWidth()/2+5+i,27, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-4+i,38, 1)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }



    public List<Blade> createBlades2_1() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-14,30+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades2_2() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades3() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-14+4*i,27, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<6;i++) {
            blades.add(new Blade(getWidth()/2-14,27+2*i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-14+4*i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<6;i++) {
            blades.add(new Blade(getWidth()/2+14,27+2*i, 3)); //1=up 2=down 3=left 4=right
        }


        return blades;
    }

    public List<Blade> createBlades4() {
        List<Blade> blades = new ArrayList<>();

        return blades;
    }
}