package com.fanzhou.thread.callable;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class DownloadFile {
    public void downloader(String url,String name)  {
        try {
            FileUtils.copyURLToFile(new URL(url),new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("下载文件失败！");
        }
    }
}
