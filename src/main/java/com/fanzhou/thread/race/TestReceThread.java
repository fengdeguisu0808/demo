package com.fanzhou.thread.race;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class TestReceThread {
    public static void main(String[] args) {
        RaceThread raceThread = new RaceThread();
        new Thread(raceThread,"兔子").start();
        new Thread(raceThread,"乌龟").start();


    }
}
