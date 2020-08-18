package com.fanzhou.thread.providerandconsumer;

/**
 * @author fanzhou
 * @create 2020/8/18 0018
 */
public class ProviderThread implements Runnable {
    private String threadFlag;
    private SynContainer synContainer;

    public ProviderThread(SynContainer synContainer,String threadFlag) {
        this.threadFlag = threadFlag;
        this.synContainer = synContainer;
    }

    @Override
    public void run() {
        for (int i = 1; i < 101; i++) {
            synContainer.push(new Chicken(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "生产第" + i + "只鸡放到容器");
        }
    }
}
