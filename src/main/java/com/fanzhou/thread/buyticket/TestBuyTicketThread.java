package com.fanzhou.thread.buyticket;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class TestBuyTicketThread {
    public static void main(String[] args) {
        BuyTicketThread buyTicketThread = new BuyTicketThread();
        new Thread(buyTicketThread,"范舟").start();
        new Thread(buyTicketThread,"朱金玲").start();
        new Thread(buyTicketThread,"范露").start();
        new Thread(buyTicketThread,"范卓").start();
    }
}
