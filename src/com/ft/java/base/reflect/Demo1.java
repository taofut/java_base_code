package com.ft.java.base.reflect;

/**
 * Created by Administrator on 2018\7\1 0001.
 */
public class Demo1 {

    public static void main(String[] args) {
        //Taofut的实例对象通过new出来
        Taofut taofut=new Taofut();

        //Taofut这个类也是一个实例对象，它是Class类的实例对象，但是它不能被new出来
        //任何一个类都是Class的实例对象，这个实例对象有三种表示方式

        //第一种表示方式--》实际上在告诉我们任何一个类都有一个隐含的静态成员变量
        Class c1=Taofut.class;

        //第二种表示方式，已经知道该类的实例对象，通过getClass方法
        Class c2=taofut.getClass();

        //不管c1 or c2都代表了Taofut类的类类型，一个类只可能是Class类的一个实例对象
        System.out.println(c1==c2);

        //第三种表达方式，类的全路径
        Class c3=null;
        try {
            c3=Class.forName("Taofut");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //可以通过c1或c2或c3来创建Taofut的实例
        try {
            Taofut taofut1=(Taofut) c1.newInstance();
            taofut1.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}

class Taofut{
    void print(){
        System.out.println("taofut被创建了！");
    }
}