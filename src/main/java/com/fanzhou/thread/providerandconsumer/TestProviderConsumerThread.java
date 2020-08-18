package com.fanzhou.thread.providerandconsumer;

/**
 * @author fanzhou
 * @create 2020/8/18 0018
 */
public class TestProviderConsumerThread {

    public static void main(String[] args) {
        String providerThreadFlag = "A";
        SynContainer synContainer = new SynContainer(providerThreadFlag);
        ConsumerThread consumerThread = new ConsumerThread(synContainer);
        new Thread(new ProviderThread(synContainer, providerThreadFlag), "老板").start();
        new Thread(consumerThread, "AAA").start();
    }
}
