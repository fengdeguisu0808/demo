package com.fanzhou.thread.callable;

import java.net.PortUnreachableException;
import java.util.concurrent.Callable;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class CallableThread implements Callable<Boolean> {
    private String url;
    private String name;
    public CallableThread(String url, String name){
        this.url = url;
        this.name = name;
    }
    @Override
    public Boolean call() throws Exception {
        new DownloadFile().downloader(url,name);
        return true;
    }
}
