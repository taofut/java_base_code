
package com.ft.java.base.io;

import java.io.*;

/**
 * 在控制台输入，将内容写到taofut3.txt中（中文会乱码）
 */
public class Demo3 {

    public static void main(String[] args) {
        File file=new File("D://taofut3.txt");
        OutputStream out=null;
        InputStreamReader reader=null;
        try {
            //定义字符输入流，用来接收控制台输入的内容
            reader=new InputStreamReader(System.in);
            //定义文件输出流，用来将控制台内容写出到taofut3.txt
            out=new FileOutputStream(file);
            int len=0;
            while ((len=reader.read())!=-1){
                //len是字符编码
                out.write(len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(out!=null){
                    out.close();
                }
                if(reader!=null){
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
