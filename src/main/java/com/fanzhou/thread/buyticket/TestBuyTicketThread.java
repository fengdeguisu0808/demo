package com.fanzhou.thread.buyticket;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class TestBuyTicketThread {
    public static void main(String[] args) {
        BuyTicketThread buyTicketThread = new BuyTicketThread();
        new Thread(buyTicketThread,"xiaoming").start();
        new Thread(buyTicketThread,"xiaohong").start();
        new Thread(buyTicketThread,"xiaohua").start();
        new Thread(buyTicketThread,"xiaofang").start();
    }
}
