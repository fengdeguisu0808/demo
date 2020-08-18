package com.fanzhou.thread.lock;

/**
 * @author fanzhou
 * @create 2020/8/18 0018
 */
public class TestThreadLock {
    public static void main(String[] args) {
        ThreadLock threadLock = new ThreadLock();
        new Thread(threadLock,"xiaoHong").start();
        new Thread(threadLock,"xiaoHua").start();
        new Thread(threadLock,"xiaoFan").start();
    }
}
