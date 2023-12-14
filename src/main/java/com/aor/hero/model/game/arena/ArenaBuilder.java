package com.aor.hero.model.game.arena;

import com.aor.hero.model.game.elements.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class ArenaBuilder {
    private int level;
    private int width;
    private int height;
    private Timer timer;


    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight(), level);
        arena.setWalls(createWalls());

        arena.setHero(createHero());
        arena.setBlades(new ArrayList<>());
        arena.setGrenades(new ArrayList<>());
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


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenade());

            }
        }, 126000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());

            }
        }, 130000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades2());

            }
        }, 134000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());

            }
        }, 138500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());

            }
        }, 142000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenadesLast());

            }
        }, 146000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());

            }
        }, 149000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 152000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 155000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 155500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 157000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 157500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 158500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
                arena.addBlades(createBladesCos2());
            }
        }, 159000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2_1());
            }
        }, 159500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_1());
            }
        }, 159750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, 160000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 160250);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
                arena.addBlades(createBladesCos2());
            }
        }, 160500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2_1());
            }
        }, 160750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_1());
            }
        }, 161500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, 162500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_3());
            }
        }, 162750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
                arena.addBlades(createBladesCos2_3());
            }
        }, 163000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
                arena.addBlades(createBladesCos3_1());
            }
        }, 163500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenade());

            }
        }, 168000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());

            }
        }, 173000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades2());

            }
        }, 177000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());

            }
        }, 181500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());

            }
        }, 185500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenadesLast());

            }
        }, 189500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());

            }
        }, 195000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                level++;
                arena.setLevel(level);
            }
        }, 200000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, 202000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, 203000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 204000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
                arena.addBlades(createBlades6LU());
            }
        }, 205000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6LU());
            }
        }, 206000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
                arena.addBlades(createBlades6LU());
            }
        }, 207000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 208000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 209000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6LU());
            }
        }, 210000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, 211000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, 212000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, 213000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, 214000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, 215000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6LU());
            }
        }, 216000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6RU());
            }
        }, 217000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
                arena.addBlades(createBlades6RU());
            }
        }, 218000);



        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 221000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 224000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, 227000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels1());
            }
        }, 229000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels2());
            }
        }, 231000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels1());
            }
        }, 233000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels2());
            }
        }, 235000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
            }
        }, 237000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_2());
            }
        }, 239000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
            }
        }, 241000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
                arena.addBlades(createBlades5_2());
            }
        }, 243000);


        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 246000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 246500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 247000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, 247500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, 248000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_6());
            }
        }, 248500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, 249000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, 249500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 250000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 250500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 251000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 251500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 252000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 252500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 253000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 253500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 254000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 254500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 255000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 255500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 256000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 256500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, 257000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, 257500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, 258000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, 258500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, 259000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, 259500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_6());
            }
        }, 260000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 263000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 263500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 264000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2());
            }
        }, 264500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 265000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 265500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
                arena.addBlades(createBladesCos2());
            }
        }, 266000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2_1());
            }
        }, 266500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_1());
            }
        }, 266750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, 267000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, 267250);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
                arena.addBlades(createBladesCos2());
            }
        }, 267500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
                arena.addBlades(createBladesCos2_1());
            }
        }, 267750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_1());
            }
        }, 268500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, 269500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
                arena.addBlades(createBladesCos2_3());
            }
        }, 269750);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
                arena.addBlades(createBladesCos2_3());
            }
        }, 270000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
                arena.addBlades(createBladesCos3_1());
            }
        }, 270500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenade());

            }
        }, 275000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());

            }
        }, 279000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades2());

            }
        }, 284000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());

            }
        }, 288500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());

            }
        }, 293500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenadesLast());

            }
        }, 298500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());

            }
        }, 303000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenadesLast());

            }
        }, 307500);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenadesLast());

            }
        }, 312500);



        return arena;
    }



    public ArenaBuilder(int level, int width, int height) throws IOException {
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
            walls.add(new Wall(width/2-14+c, height/2-9));
            walls.add(new Wall(width/2-14+c, height/2+4));
        }
        for (int r = 1; r < 15; r++) {
            walls.add(new Wall(width/2-15, height/2-10+r));
            walls.add(new Wall(width/2+15, height/2-10+r));
        }
        return walls;
    }




    


    public Hero createHero() {
        return new Hero(width/2, height/2-3);
    }


    
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

    public List<Grenade> createGrenade() {
        List<Grenade> grenades=new ArrayList<>();

        grenades.add(new Grenade(getWidth()/2,27, 2)); //1=up 2=down 3=left 4=right

        return grenades;
    }

    public List<Grenade> createGrenades() {
        List<Grenade> grenades=new ArrayList<>();
        for (int i=0; i<9;i++) {
            grenades.add(new Grenade(getWidth()/2-8+2*i,27, 2)); //1=up 2=down 3=left 4=right
        }
        return grenades;
    }

    public List<Grenade> createGrenades2() {
        List<Grenade> grenades=new ArrayList<>();
        for (int i=0; i<4;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,27, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<5;i++) {
            grenades.add(new Grenade(getWidth()/2-4+2*i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<5;i++) {
            grenades.add(new Grenade(getWidth()/2-4+2*i,27, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            grenades.add(new Grenade(getWidth()/2+8+2*i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<4;i++) {
            grenades.add(new Grenade(getWidth()/2+8+2*i,27, 2)); //1=up 2=down 3=left 4=right
        }
        return grenades;
    }

    public List<Grenade> createGrenades3() {
        List<Grenade> grenades=new ArrayList<>();
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2+13+2*i,27+i, 3)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,32+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2+13+2*i,32+i, 3)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,36+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2+13+2*i,36+i, 3)); //1=up 2=down 3=left 4=right
        }
        return grenades;
    }

    public List<Grenade> createGrenadesLast() {
        List<Grenade> grenades=new ArrayList<>();
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,27+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2+13+2*i,27+i, 3)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<5;i++) {
            grenades.add(new Grenade(getWidth()/2-4+2*i,38, 1)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<5;i++) {
            grenades.add(new Grenade(getWidth()/2-4+2*i,27, 2)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2-14+2*i,36+i, 4)); //1=up 2=down 3=left 4=right
        }
        for (int i=0; i<2;i++) {
            grenades.add(new Grenade(getWidth()/2+13+2*i,36+i, 3)); //1=up 2=down 3=left 4=right
        }
        return grenades;
    }

}