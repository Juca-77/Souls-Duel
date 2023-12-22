package SoulsDuel.model.game.arena;

import SoulsDuel.model.game.elements.Blade;
import SoulsDuel.model.game.elements.Grenade;
import SoulsDuel.model.game.elements.Soul;
import SoulsDuel.model.game.elements.Wall;


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
    private Arena arena;


    public Arena createArena() {
        arena = new Arena(getWidth(), getHeight(), level);
        timer=arena.getTimer();
        arena.setWalls(createWalls());

        arena.setSoul(createHero());
        arena.setBlades(new ArrayList<>());
        arena.setGrenades(new ArrayList<>());


        scheduleBlades2_1(1500);

        scheduleBlades2_2(5000);

        scheduleBlades2_1(8500);


        scheduleBlades2_2(11500);

        scheduleBlades3(14800);

        scheduleBlades4(17000+2000);

        scheduleBlades4(17000+2500);
        scheduleBlades4(17000+3000);

        scheduleBlades4_1(17000+3500);

        scheduleBlades4_2(17000+4000);
        scheduleBlades4_6(17000+4500);

        scheduleBlades4_2(17000+5000);
        scheduleBlades4_1(17000+5500);
        scheduleBlades4(17000+6000);
        scheduleBlades4_3(17000+6500);




        scheduleBlades4_4(17000+7000);

        scheduleBlades4_5(17000+7500);

        scheduleBlades4_5(17000+8000);

        scheduleBlades4_5(17000+8500);

        scheduleBlades4_5(17000+9000);

        scheduleBlades4_4(17000+9500);

        scheduleBlades4_3(17000+10000);

        scheduleBlades4(17000+10500);

        scheduleBlades4(17000+11000);

        scheduleBlades4_3(17000+11500);

        scheduleBlades4_4(17000+12000);

        scheduleBlades4_5(17000+12500);

        scheduleBlades4_5(17000+13000);

        scheduleBlades4_4(17000+13500);

        scheduleBlades4_3(17000+14000);

        scheduleBlades4(17000+14500);

        scheduleBlades4_1(17000+15000);

        scheduleBlades4_2(17000+15500);

        scheduleBlades4_6(17000+16000);

        scheduleBlades2_1(37000);

        scheduleBlades2_2(38500);

        scheduleBlades2_1L(42000);

        scheduleBlades2_2L(43500);
        scheduleBlades2_1L(45000);

        scheduleBlades2_2L(46500);
        scheduleBlades2_1(50000);
        scheduleBlades2_2(51500);

        scheduleBlades2_1(53000);

        scheduleBlades2_2(54500);

        scheduleBladesParalels3(58000);

        scheduleBladesParalels4(62000);

        timer.schedule(new TimerTask() {
           @Override
            public void run() {
                level++;
                arena.setLevel(level);
            }
        }, 66000);

        scheduleBlades3(70000);

        scheduleBlades3(73000);

        scheduleBlades3(76000);

        scheduleBladesParalels1(80000);

        scheduleBladesParalels2(82000);

        scheduleBladesParalels1(84000);


        scheduleBladesParalels2(86000);

        scheduleBlades5_1(88000);

        scheduleBlades5_2(90000);


        scheduleBlades5_1(92000);
        scheduleBlades5_2(92000);


        scheduleBlades6CU(95000);

        scheduleBlades6LU(96000);

        scheduleBlades6RU(97000);


        scheduleBlades6RU(98000);
        scheduleBlades6LU(98000);


        scheduleBlades6CU(99000);
        scheduleBlades6LU(99000);


        scheduleBlades6RU(100000);
        scheduleBlades6LU(100000);

        scheduleBlades6RU(101000);

        scheduleBlades6RU(102000);


        scheduleBlades6CU(103000);
        scheduleBlades6LU(103000);
        scheduleBlades6CU(104000);


        scheduleBlades6LU(105000);


        scheduleBlades6RU(106000);

        scheduleBlades6CU(107000);

        scheduleBlades6LU(108000);


        scheduleBlades6CU(109000);
        scheduleBlades6LU(109000);


        scheduleBlades6CU(110000);
        scheduleBlades6RU(110000);


        scheduleBlades6CU(112000);
        scheduleBlades6RU(112000);

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                level++;
                arena.setLevel(level);
            }
        }, 114000);

        scheduleBladesCos1(116000);


        scheduleBladesCos2(117000);
        scheduleBladesCos1(117000);


        scheduleBladesCos2(117500);
        scheduleBladesCos1(117500);


        scheduleBladesCos2(118000);
        scheduleBladesCos1(118000);

        scheduleBladesCos1(118500);
        scheduleBladesCos1(119000);

        scheduleBladesCos1_1(120000);
        scheduleBladesCos2(120000);

        scheduleBladesCos1(120500);
        scheduleBladesCos2_1(120500);


        scheduleBladesCos2_1(120750);
        scheduleBladesCos1_2(120750);
        scheduleBladesCos1_2(121000);
        scheduleBladesCos1(121500);


        scheduleBladesCos1_1(121500);
        scheduleBladesCos2(121500);

        scheduleBladesCos1(121750);
        scheduleBladesCos2_1(121750);

        scheduleBladesCos1_2(122500);
        scheduleBladesCos2_1(122500);


        scheduleBladesCos1_2(122500);


        scheduleBladesCos1_2(122750);
        scheduleBladesCos2_3(122750);


        scheduleBladesCos3(123000);
        scheduleBladesCos2_3(123000);


        scheduleBladesCos3(123500);
        scheduleBladesCos3_1(123500);

        scheduleBladesCos2_2(123500);
        scheduleBladesCos3_1(123500);


        scheduleGrenade(127000);

        scheduleGrenades(130000);

        scheduleGrenades2(134000);
        scheduleGrenades3(138500);
        scheduleGrenades(142000);
        scheduleGrenadesLast(146000);
        scheduleGrenades3(149000);
        scheduleBladesCos1(154000);

        scheduleBladesCos1(155000);
        scheduleBladesCos2(155000);


        scheduleBladesCos1(155500);
        scheduleBladesCos2(155500);


        scheduleBladesCos1(157000);
        scheduleBladesCos2(157000);

        scheduleBladesCos1(157500);
        scheduleBladesCos1(158500);

        scheduleBladesCos1_1(159000);
        scheduleBladesCos2(159000);

        scheduleBladesCos1(159500);
        scheduleBladesCos2_1(159500);

        scheduleBladesCos1_2(159750);
        scheduleBladesCos2_1(159750);

        scheduleBladesCos1_2(160000);
        scheduleBladesCos1(160250);

        scheduleBladesCos1_1(160500);
        scheduleBladesCos2(160500);


        scheduleBladesCos1(160750);
        scheduleBladesCos2(160750);


        scheduleBladesCos1_2(161500);
        scheduleBladesCos2_1(161500);

        scheduleBladesCos1_2(162500);


        scheduleBladesCos1_2(162750);
        scheduleBladesCos2_3(162750);


        scheduleGrenade(168000);

        scheduleGrenades(173000);
        scheduleGrenades2(177000);
        scheduleGrenades3(181500);
        scheduleGrenades(185500);
        scheduleGrenadesLast(189500);
        scheduleGrenades3(195000);
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                level++;
                arena.setLevel(level);
            }
        }, 200000);

        scheduleBlades6CU(202000);

        scheduleBlades6LU(203000);

        scheduleBlades6RU(204000);


        scheduleBlades6LU(205000);
        scheduleBlades6RU(205000);

        scheduleBlades6CU(206000);
        scheduleBlades6LU(206000);

        scheduleBlades6RU(207000);
        scheduleBlades6LU(207000);
        scheduleBlades6RU(208000);
        scheduleBlades6RU(209000);

        scheduleBlades6CU(210000);
        scheduleBlades6LU(210000);
        scheduleBlades6CU(211000);
        scheduleBlades6LU(212000);
        scheduleBlades6RU(213000);
        scheduleBlades6CU(214000);
        scheduleBlades6LU(215000);

        scheduleBlades6CU(216000);
        scheduleBlades6LU(216000);

        scheduleBlades6CU(217000);
        scheduleBlades6RU(217000);

        scheduleBlades6CU(218000);
        scheduleBlades6RU(218000);


        scheduleBlades3(221000);
        scheduleBlades3(224000);

        scheduleBladesParalels1(229000);
        scheduleBladesParalels2(231000);
        scheduleBladesParalels1(233000);
        scheduleBladesParalels2(235000);
        scheduleBlades5_1(237000);
        scheduleBlades5_2(239000);
        scheduleBlades5_1(241000);

        scheduleBlades5_1(243000);
        scheduleBlades5_2(243000);
        scheduleBlades4(246000);
        scheduleBlades4(246500);

        scheduleBlades4(247000);
        scheduleBlades4_1(247500);
        scheduleBlades4_2(248000);
        scheduleBlades4_6(248500);
        scheduleBlades4_2(249000);
        scheduleBlades4_1(249500);
        scheduleBlades4(250000);
        scheduleBlades4_3(250500);
        scheduleBlades4_4(251000);
        scheduleBlades4_5(251500);
        scheduleBlades4_5(252000);
        scheduleBlades4_5(252500);
        scheduleBlades4_5(253000);
        scheduleBlades4_4(253500);
        scheduleBlades4_3(254000);
        scheduleBlades4(254500);
        scheduleBlades4(255000);
        scheduleBlades4_3(255500);
        scheduleBlades4_4(256000);
        scheduleBlades4_5(256500);
        scheduleBlades4_5(257000);
        scheduleBlades4_4(257500);
        scheduleBlades4_3(258000);
        scheduleBlades4(258500);
        scheduleBlades4_1(259000);
        scheduleBlades4_2(259500);
        scheduleBlades4_6(260000);

        scheduleBladesCos1(263000);

        scheduleBladesCos1(263500);
        scheduleBladesCos2(263500);

        scheduleBladesCos1(264000);
        scheduleBladesCos2(264000);

        scheduleBladesCos1(264500);
        scheduleBladesCos2(264500);

        scheduleBladesCos1(265000);

        scheduleBladesCos1(265500);

        scheduleBladesCos1_1(266000);
        scheduleBladesCos2(266000);


        scheduleBladesCos1(266500);
        scheduleBladesCos2_1(266500);


        scheduleBladesCos1_2(266750);
        scheduleBladesCos2_1(266750);




        scheduleGrenade(272000);

        scheduleGrenades(277000);

        scheduleGrenades2(282000);

        scheduleGrenades3(287000);

        scheduleGrenades(292000);

        scheduleGrenadesLast(297000);

        scheduleGrenades3(302000);

        scheduleGrenadesLast(307000);

        scheduleGrenadesLast(312000);


        return arena;
    }

    public void scheduleBlades1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades1());
            }
        }, seconds);
    }
    public void scheduleBlades2_1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1());
            }
        }, seconds);
    }
    public void scheduleBlades2_2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2());
            }
        }, seconds);
    }

    public void scheduleBlades2_1L(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_1L());
            }
        }, seconds);
    }

    public void scheduleBlades2_2L(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades2_2L());
            }
        }, seconds);
    }
    public void scheduleBladesCos1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1());
            }
        }, seconds);
    }
    public void scheduleBladesCos1_1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_1());
            }
        }, seconds);
    }
    public void scheduleBladesCos1_2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos1_2());
            }
        }, seconds);
    }
    public void scheduleBladesCos2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos2());
            }
        }, seconds);
    }
    public void scheduleBladesCos2_1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos2_1());
            }
        }, seconds);
    }
    public void scheduleBladesCos2_2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos2_2());
            }
        }, seconds);
    }
    public void scheduleBladesCos2_3(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos2_3());
            }
        }, seconds);
    }
    public void scheduleBladesCos3(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3());
            }
        }, seconds);
    }
    public void scheduleBladesCos3_1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesCos3_1());
            }
        }, seconds);
    }

    public void scheduleBlades3(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades3());
            }
        }, seconds);
    }
    public void scheduleBlades4(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4());
            }
        }, seconds);
    }
    public void scheduleBlades4_1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_1());
            }
        }, seconds);
    }
    public void scheduleBlades4_2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_2());
            }
        }, seconds);
    }

    public void scheduleBlades4_3(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_3());
            }
        }, seconds);
    }
    public void scheduleBlades4_4(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_4());
            }
        }, seconds);
    }
    public void scheduleBlades4_5(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_5());
            }
        }, seconds);
    }

    public void scheduleBlades4_6(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades4_6());
            }
        }, seconds);
    }
    public void scheduleBlades5_1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_1());
            }
        }, seconds);
    }
    public void scheduleBlades5_2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades5_2());
            }
        }, seconds);
    }
    public void scheduleBlades6LU(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6LU());
            }
        }, seconds);
    }
    public void scheduleBlades6RU(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6RU());
            }
        }, seconds);
    }
    public void scheduleBlades6CU(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CU());
            }
        }, seconds);
    }
    public void scheduleBlades6CD(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBlades6CD());
            }
        }, seconds);
    }
    public void scheduleBladesParalels1(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels1());
            }
        }, seconds);
    }
    public void scheduleBladesParalels2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels2());
            }
        }, seconds);
    }
    public void scheduleBladesParalels3(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels3());
            }
        }, seconds);
    }
    public void scheduleBladesParalels4(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addBlades(createBladesParalels4());
            }
        }, seconds);
    }
    public void scheduleGrenade(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenade());
            }
        }, seconds);
    }
    public void scheduleGrenades(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades());
            }
        }, seconds);
    }
    public void scheduleGrenades2(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades2());
            }
        }, seconds);
    }
    public void scheduleGrenades3(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenades3());
            }
        }, seconds);
    }
    public void scheduleGrenadesLast(int seconds) {
         

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                arena.addGrenades(createGrenadesLast());
            }
        }, seconds);
    }


    public ArenaBuilder(int level, int width, int height) throws IOException {
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
            walls.add(new Wall(width/2-14+c, height/2-9));
            walls.add(new Wall(width/2-14+c, height/2+4));
        }
        for (int r = 1; r < 15; r++) {
            walls.add(new Wall(width/2-15, height/2-10+r));
            walls.add(new Wall(width/2+15, height/2-10+r));
        }
        return walls;
    }





    public Soul createHero() {
        return new Soul(width/2, height/2-3);
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
        for (int i=0; i<14;i++) {
            blades.add(new Blade(width/2-13+2*i,38, 1)); //1=up 2=down 3=left 4=right
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

    public void setArena(Arena arena) {
        this.arena=arena;
    }

    public void setTimer(Timer timer) {
        this.timer = timer;
    }
}