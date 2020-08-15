package com.fanzhou.thread.buyticket;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class BuyTicketThread implements Runnable {
    private Integer ticketNumber = 100;
    private Long startTime = 0l;
    private Long endTime = 0l;

    @Override
    public void run() {
        while (true) {
            synchronized (BuyTicketThread.class) {
                if (ticketNumber == 100) {
                    startTime = System.currentTimeMillis();
                }
                if (ticketNumber < 1) {
                    break;
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "购买了第" + ticketNumber-- + "张票。");
                if (ticketNumber == 0) {
                    endTime = System.currentTimeMillis();
                    System.out.println("一个耗时：" + (endTime - startTime) + "毫秒");
                }
            }
        }
    }
}
