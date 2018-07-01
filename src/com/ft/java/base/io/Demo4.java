package com.ft.java.base.io;

import java.io.*;

/**
 * 控制台输入内容，控制台输出内容
 */
public class Demo4 {

    public static void main(String[] args) {
        BufferedReader bufRead=null;
        BufferedWriter bufWrite=null;
        String line=null;
        try {
            bufRead=new BufferedReader(new InputStreamReader(System.in,"utf-8"));
            bufWrite=new BufferedWriter(new OutputStreamWriter(System.out,"utf-8"));
            //将控制台输入的内容读入BufferedReader中
            while ((line=bufRead.readLine())!=null){
                //将BufferedReader中的内容写出到控制台
                bufWrite.write(line);
                bufWrite.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(bufRead!=null){
                    bufRead.close();
                }
                if(bufWrite!=null){
                    bufWrite.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
