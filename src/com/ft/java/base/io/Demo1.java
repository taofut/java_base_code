package com.ft.java.base.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * FileInputStream
 * 将本地文件taofut.txt的内容输出到控制台
 */
public class Demo1 {

    public static void main(String[] args) {
        //加载本地文件信息到File
        File file=new File("D://taofut.txt");
        InputStream in=null;
        try {
            //如果本地文件不存在，则创建
            if(!file.exists()){
                file.createNewFile();
            }
            //将文件加载到输入流
            in=new FileInputStream(file);
            byte[] buf=new byte[1024];
            int length=0;
            //字节数组（内存）从输入流中读入数据
            while ((length=in.read(buf))!=-1){
                //字节数组转成字符串格式，输出到控制台
                System.out.println(new String(buf,0,length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(in!=null){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
