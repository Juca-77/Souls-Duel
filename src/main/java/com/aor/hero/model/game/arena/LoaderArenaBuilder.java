package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.elements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class LoaderArenaBuilder  {
    private int level;
    private int width;
    private int height;
    private Timer timer;


    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight(), level);
        arena.setWalls(createWalls());
        arena.setEnemy(createEnemy());
        arena.setHero(createHero());
        arena.setBlades(new ArrayList<>());
        timer=arena.getTimer();
        //arena.setMonsters(createMonsters());


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, 1500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, 5000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, 8500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, 11500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 14800);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+2000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+2500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+3000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, 17000+3500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, 17000+4000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_6());
            }
        }, 17000+4500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, 17000+5000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, 17000+5500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+6000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 17000+6500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 17000+7000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 17000+7500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 17000+8000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 17000+8500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 17000+9000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 17000+9500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 17000+10000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+10500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+11000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 17000+11500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 17000+12000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 17000+12500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 17000+13000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 17000+13500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 17000+14000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 17000+14500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, 17000+15000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, 17000+15500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_6());
            }
        }, 17000+16000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, 37000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, 38500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1L());
            }
        }, 42000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2L());
            }
        }, 43500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1L());
            }
        }, 45000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2L());
            }
        }, 46500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, 50000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, 51500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, 53000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, 54500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels3());
            }
        }, 58000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels4());
            }
        }, 62000);

        timer.schedule(new TimerTask() {
           @Override
            public void run() {
                level++;
                arena.setLevel(level);
                arena.setEnemy(createEnemy());
            }
        }, 66000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 70000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 73000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 76000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels1());
            }
        }, 80000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels2());
            }
        }, 82000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels1());
            }
        }, 84000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels2());
            }
        }, 86000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
            }
        }, 88000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_2());
            }
        }, 90000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
            }
        }, 92000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
                arena.addBlades(createBlades5_2());
            }
        }, 92000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, 95000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, 96000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 97000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
                arena.addBlades(createBlades6LU());
            }
        }, 98000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6LU());
            }
        }, 99000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
                arena.addBlades(createBlades6LU());
            }
        }, 100000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 101000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 102000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6LU());
            }
        }, 103000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, 104000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, 105000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 106000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, 107000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, 108000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6LU());
            }
        }, 109000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6RU());
            }
        }, 110000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6RU());
            }
        }, 112000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                level++;
                arena.setLevel(level);
                arena.setEnemy(createEnemy());
            }
        }, 114000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 116000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 117000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 117500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 118000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 118500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 119000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
                arena.addBlades(createBladesCos2());
            }
        }, 120000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2_1());
            }
        }, 120500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_1());
            }
        }, 120750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, 121000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 121250);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
                arena.addBlades(createBladesCos2());
            }
        }, 121500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2_1());
            }
        }, 121750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_1());
            }
        }, 122500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, 122500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_3());
            }
        }, 122750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
                arena.addBlades(createBladesCos2_3());
            }
        }, 123000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
                arena.addBlades(createBladesCos3_1());
            }
        }, 123500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos2_2());
                arena.addBlades(createBladesCos3_1());
            }
        }, 123500);







        return arena;
    }



    public LoaderArenaBuilder(int level, int width, int height) throws IOException {
        this.level = level;
        this.width=width;
        this.height=height;
    }

    public Timer getTimer() {
        return timer;
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
    public List<Blade> createBladesParalels1() {
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

    public List<Blade> createBladesParalels2() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<10;i++) {
            blades.add(new Blade(getWidth()/2-14+i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<10;i++) {
            blades.add(new Blade(getWidth()/2+5+i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-4+i,27, 2)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBladesParalels3() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2-14,35+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2+14,31+i, 3)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBladesParalels4() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2+14,27+i, 3)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2+14,35+i, 3)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2-14,31+i, 4)); //1=up 2=down 3=left 4=right
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
        for (int i=0; i<5;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<5;i++) {
            blades.add(new Blade(getWidth()/2-14,34+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades4_1() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<6;i++) {
            blades.add(new Blade(getWidth()/2-14,33+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades4_2() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<3;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<7;i++) {
            blades.add(new Blade(getWidth()/2-14,32+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades4_6() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<2;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-14,31+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades4_3() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<6;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            blades.add(new Blade(getWidth()/2-14,35+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades4_4() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<7;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<3;i++) {
            blades.add(new Blade(getWidth()/2-14,36+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades4_5() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<8;i++) {
            blades.add(new Blade(getWidth()/2-14,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            blades.add(new Blade(getWidth()/2-14,37+i, 4)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades2_1L() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2+14,30+i, 3)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades2_2L() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2+14,27+i, 3)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades5_1() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<15;i++) {
            blades.add(new Blade(getWidth()/2-14+2*i,27, 2)); //1=up 2=down 3=left 4=right
        }

        return blades;
    }

    public List<Blade> createBlades5_2() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<16;i++) {
            blades.add(new Blade(getWidth()/2-14+2*i-1,38, 1)); //1=up 2=down 3=left 4=right
        }

        return blades;
    }

    public List<Blade> createBlades6LU() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<10;i++) {
            blades.add(new Blade(getWidth()/2+5+i,38, 1)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades6RU() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<10;i++) {
            blades.add(new Blade(getWidth()/2-14+i,38, 1)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades6CU() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-4+i,38, 1)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBlades6CD() {
        List<Blade> blades = new ArrayList<>();
        for (int i=0; i<9;i++) {
            blades.add(new Blade(getWidth()/2-4+i,27, 2)); //1=up 2=down 3=left 4=right
        }
        return blades;
    }

    public List<Blade> createBladesCos1() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2,27, 5)); //1=up 2=down 3=left 4=right

        return blades;
    }

    public List<Blade> createBladesCos1_1() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2-1,27, 5)); //1=up 2=down 3=left 4=right
        return blades;
    }

    public List<Blade> createBladesCos1_2() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2-2,27, 5)); //1=up 2=down 3=left 4=right
        return blades;
    }

    public List<Blade> createBladesCos2() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2,27, 6)); //1=up 2=down 3=left 4=right
        return blades;
    }

    public List<Blade> createBladesCos2_1() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2+1,27, 6)); //1=up 2=down 3=left 4=right
        return blades;
    }


    public List<Blade> createBladesCos2_2() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2+2,27, 6)); //1=up 2=down 3=left 4=right
        return blades;
    }

    public List<Blade> createBladesCos2_3() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2+1,27, 6)); //1=up 2=down 3=left 4=right
        blades.add(new Blade(getWidth()/2+4,27, 6)); //1=up 2=down 3=left 4=right
        return blades;
    }

    public List<Blade> createBladesCos3() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2+5,27, 6)); //1=up 2=down 3=left 4=right
        blades.add(new Blade(getWidth()/2-5,27, 5)); //1=up 2=down 3=left 4=right

        blades.add(new Blade(getWidth()/2+8,27, 6)); //1=up 2=down 3=left 4=right
        blades.add(new Blade(getWidth()/2+8,27, 6)); //1=up 2=down 3=left 4=right
        return blades;
    }
    public List<Blade> createBladesCos3_1() {
        List<Blade> blades = new ArrayList<>();
        blades.add(new Blade(getWidth()/2-13,27, 5)); //1=up 2=down 3=left 4=right
        blades.add(new Blade(getWidth()/2+13,27, 6)); //1=up 2=down 3=left 4=right


        return blades;
    }


}