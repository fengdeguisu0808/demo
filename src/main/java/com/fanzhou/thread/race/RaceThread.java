package com.fanzhou.thread.race;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class RaceThread implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 101; i++) {
            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
            if (isGameOver(i)) {
                String name = Thread.currentThread().getName();
                if(name == "兔子" || name =="乌龟"){
                    Thread.currentThread().stop();
                }
                break;
            }
        }
    }

    private static boolean isGameOver(Integer step) {
        if (step == 100) {
            System.out.println("胜利者是：" + Thread.currentThread().getName());
        }
        return step == 100;
    }
}
