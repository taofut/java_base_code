package com.ft.java.base.reflect;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2018\7\1 0001.
 */
public class Demo4 {

    public static void main(String[] args) {
        //获取print(int,int)
        A a1=new A();
        Class c=a1.getClass();
        /**
         * getMethod获取的是public的方法
         * getDeclaredMethod自己声明的方法
         */
        try {
//            Method m=c.getMethod("print",new Class[]{int.class,int.class});
            Method m=c.getMethod("print",int.class,int.class);

            //方法的反射操作
//            m.invoke(a1,10,20);
            //方法如果没有返回值返回null，有返回值返回具体的值
            Object o=m.invoke(a1,new Object[]{10,20});
            System.out.println("==============================");
            Method m1=c.getMethod("print",String.class,String.class);
            o=m1.invoke(a1,"hello,","world!");
            System.out.println("==============================");
            Method m2=c.getMethod("print",new Class[]{});
            m2.invoke(a1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class A{
    public void print(){
        System.out.println("helloworld");
    }
    public void print(int a,int b){
        System.out.println(a+b);
    }
    public void print(String a,String b){
        System.out.println(a.toLowerCase()+","+b.toLowerCase());
    }
}
