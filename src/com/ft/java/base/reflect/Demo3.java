package com.ft.java.base.reflect;

/**
 * Created by Administrator on 2018\7\1 0001.
 */
public class Demo3 {
    public static void main(String[] args) {
        String s="taofut";
        ClassUtils.printClassMethodInfo(s);

        Integer n1=1;
        ClassUtils.printClassFieldInfo(n1);

        Integer n2=2;
        ClassUtils.printClassConstructorInfo(n2);
    }
}
