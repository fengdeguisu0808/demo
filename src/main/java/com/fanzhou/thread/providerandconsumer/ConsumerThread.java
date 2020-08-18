package com.fanzhou.thread.providerandconsumer;

/**
 * @author fanzhou
 * @create 2020/8/18 0018
 */
public class ConsumerThread implements Runnable {
    private SynContainer synContainer;

    public ConsumerThread(SynContainer synContainer) {
        this.synContainer = synContainer;
    }

    private static int count = 101;

    @Override
    public void run() {
        for (int i = 1; i < count; i++) {
            Chicken chicken = synContainer.pop();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "买走容器中的第" + chicken.getId());
        }
    }

}
