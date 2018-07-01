package com.ft.java.base.io;

import java.io.*;

/**
 * FileInputStream和FileOutputStream一起完成文件复制
 */
public class Demo2 {
    public static void main(String[] args) {
        //加载本地文件信息到oldFile
        File oldFile=new File("D://taofut1.txt");
        InputStream in=null;
        OutputStream out=null;
        try {
            //如果本地文件不存在，则创建
            if(!oldFile.exists()){
                oldFile.createNewFile();
            }
            //加载本地文件信息到newFile
            File newFile=new File("D://taofut1_new.txt");
            //将文件加载到输入流
            in=new FileInputStream(oldFile);
            //将文件加载到输出流，文件如果不存在，则自动创建
            out=new FileOutputStream(newFile);
            byte[] buff=new byte[1024];
            int len=0;
            //字节数组（内存）从输入流中读入数据
            while ((len=in.read(buff))!=-1){
                //输出流将数据从字节数组（内存）中写出到文件
                out.write(buff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(in!=null){
                    in.close();
                }
                if(out!=null){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
