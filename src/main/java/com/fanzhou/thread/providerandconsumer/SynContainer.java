package com.fanzhou.thread.providerandconsumer;

/**
 * @author fanzhou
 * @create 2020/8/18 0018
 */
public class SynContainer {
    private String threadFlag;
    Chicken[] chickens = new Chicken[10];
    private static int count = 0;
    SynContainer(String threadFlag) {
        this.threadFlag = threadFlag;
    }


    // 控制生产者生产
    public synchronized void push(Chicken chicken){
        if( count > 0){
            this.notifyAll();
        }
        if(count == 10){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        chickens[count] = chicken;
        count++;

    }
    // 控制消费者消费
    public synchronized Chicken pop(){
        if(count == 0){
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        count--;
        return chickens[count];
    }
}
