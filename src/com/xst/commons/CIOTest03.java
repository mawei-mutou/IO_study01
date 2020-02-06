package com.xst.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/2/5
 * time        : 22:32
 * description :
 */
public class CIOTest03 {
    public static void main(String[] args) throws IOException {
        FileUtils.copyFile(new File("src/copy.jpg"), new File("copy2.jpg"));

        FileUtils.copyFileToDirectory(new File("src/copy.jpg"), new File("src/com.xst.commons"));
        FileUtils.copyDirectory(new File("bin"),new File("bin2"));
        FileUtils.copyDirectoryToDirectory( new File("bin"), new File("bin3"));

        String url = "https://www.baidu.com";
        FileUtils.copyURLToFile(new URL(url) ,new File("dest.txt") );

        String datas = IOUtils.toString(new URL("http://www.163.com"), "gbk");
        System.out.println(datas);

    }
}
