package com.fanzhou.thread.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author fanzhou
 * @create 2020/8/18 0018
 */
public class ThreadLock implements Runnable {
    /*private String name;*/
    private static Integer ticketNums = 100;
    private final ReentrantLock lock = new ReentrantLock();
    /*public ThreadLock(String name){
        this.name = name;
    }*/
    @Override
    public void run() {
        while(true){
            try {
            lock.lock();
            if(ticketNums<1){
                break;
            }else{
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName()+"买到了第"+ticketNums-- + "张票。");
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
