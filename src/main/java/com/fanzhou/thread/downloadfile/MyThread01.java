package com.fanzhou.thread.downloadfile;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class MyThread01 extends Thread{
    private String url;
    private String name;

    public MyThread01(String url,String name){
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
        DownloadFileThread dft = new DownloadFileThread();
        dft.downloader(url,name);
    }
}
