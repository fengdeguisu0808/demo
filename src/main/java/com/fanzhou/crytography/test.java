package com.fanzhou.crytography;

import javax.crypto.Cipher;
import java.io.IOException;
import java.io.InputStream;
import java.security.PrivateKey;
import java.util.Properties;

/**
 * @author fanzhou
 * @create 2020/8/13 0013
 */
public class test {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
             // 使用ClassLoader加载properties配置文件生成对应的输入流
             InputStream in = Properties.class.getClassLoader().getResourceAsStream("config/config.properties");
            // 使用properties对象加载输入流
             properties.load(in);
            //获取key对应的value值
        String privateKey = properties.getProperty("privateKey").toString();
        String miwen = properties.getProperty("miwen").toString();

    }
    // 私钥解密
    public static byte[] decrypt(byte[] content, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        return cipher.doFinal(content);
    }
}
