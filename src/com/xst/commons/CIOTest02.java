package com.xst.commons;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;
import java.util.List;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/2/5
 * time        : 22:02
 * description :读取文件内容
 */
public class CIOTest02 {
    public static void main(String[] args) throws IOException {
        String msg = FileUtils.readFileToString(new File("pp.txt"), "UTF-8");
        System.out.println(msg);

        byte[] datas = FileUtils.readFileToByteArray(new File("pp.txt"));
        System.out.println(datas.length);

        List<String> msgs = FileUtils.readLines(new File("pp.txt"), "UTF-8");
        for (String temp : msgs) {
            System.out.println(temp);

            //写出内容

            FileUtils.write(new File("pp2.txt"), temp,"UTF-8",true);
        }
        FileUtils.writeStringToFile(new File("pp2.txt"),"\n我扽零九","UTF-8",true);
        FileUtils.writeByteArrayToFile(new File("pp2.txt"), datas, 0, datas.length,true);


        List<String> data = new ArrayList<>();
        data.add("\n蚂蚁");
        data.add("大象");
        data.add("河马");
        FileUtils.writeLines(new File("pp2.txt"), data, "---", true);
    }
}


