package com.xst.commons;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.util.Collection;

/**
 * created with IntelliJ IDEA
 * author      : YaoDong
 * date        : 2020/2/5
 * time        : 19:39
 * description :
 */
public class CIOTest01 {
    public static void main(String[] args) {
        long len = FileUtils.sizeOf(new File("src"));
        System.out.println(len);

        len = FileUtils.sizeOf(new File("C:/Users/MrYou/IdeaProjects/IO_study01/IO_study01.iml"));
        System.out.println(len);

        //只列出一级
        Collection<File> files = FileUtils.listFiles(new File("C:/Users/MrYou/IdeaProjects/IO_study01"),
                EmptyFileFilter.NOT_EMPTY, null);
        for (File temp : files) {
            System.out.println(temp.getAbsolutePath());
        }
        System.out.println("___________________________________");
        //列出所有的文件
        Collection<File> files1 = FileUtils.listFiles(new File("C:\\Users\\MrYou\\IdeaProjects\\IO_study01"),
                EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
        for (File temp : files1) {
            System.out.println(temp.getAbsolutePath());
        }
        System.out.println("___________________________________");

        files = FileUtils.listFiles(new File("C:/Users/MrYou/IdeaProjects/IO_study01"), new SuffixFileFilter("java"),
                DirectoryFileFilter.INSTANCE);
        for (File temp : files) {
            System.out.println(temp.getAbsolutePath());
        }
        System.out.println("___________________________________");

        files = FileUtils.listFiles(new File("C:/Users/MrYou/IdeaProjects/IO_study01"), FileFilterUtils.or(
                new SuffixFileFilter("java"),new SuffixFileFilter("class")),
                DirectoryFileFilter.INSTANCE);
        for (File temp : files) {
            System.out.println(temp.getAbsolutePath());
        }
        System.out.println("___________________________________");


        files = FileUtils.listFiles(new File("C:/Users/MrYou/IdeaProjects/IO_study01"), FileFilterUtils.and(
                new SuffixFileFilter("txt"),EmptyFileFilter.NOT_EMPTY), DirectoryFileFilter.INSTANCE);
        for (File temp : files) {
            System.out.println(temp.getAbsolutePath());
        }
        System.out.println("___________________________________");
    }



}
