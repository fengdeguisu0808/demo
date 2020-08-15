package com.fanzhou.thread.downloadfile;

/**
 * @author fanzhou
 * @create 2020/8/15 0015
 */
public class TestMyThread01 {
    public static void main(String[] args) {
        MyThread01 mt1 = new MyThread01("https://ss0.bdstatic.com/94oJfD_bAAcT8t7mm9GUKT-xh_/timg?image&quality=100&size=b4000_4000&sec=1597482914&di=eb81a372b543292e9deb152704008b27&src=http://zkres1.myzaker.com/201811/5be017eb77ac6408d945eafe_640.jpg", "img/1.jpg");
        System.out.println("下载1.jpg");
        MyThread01 mt2 = new MyThread01("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597493126175&di=c60c19acdf371ddb5f76c714c1cdade0&imgtype=0&src=http%3A%2F%2Fdingyue.nosdn.127.net%2F%3D0zvsBS8t3PIb3M%3DZZlD9pmtBA0Mv%3D0g7qtvXfdQkwEeL1543807890250compressflag.jpg", "img/2.jpg");
        System.out.println("下载2.jpg");
        MyThread01 mt3 = new MyThread01("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1597493126174&di=7d3f76da79bb18ee5d97e9f52c8d841a&imgtype=0&src=http%3A%2F%2Fn.sinaimg.cn%2Fsinacn%2Fw1421h960%2F20180208%2F1163-fyrkuxs1379115.jpg","img/3.jpg");
        System.out.println("下载3.jpg");
        mt3.start();
        mt2.start();
        mt1.start();
    }

}
