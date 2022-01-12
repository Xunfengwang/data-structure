package sam;


import java.lang.System;
import java.lang.reflect.*;
class Dog{
    public String name;
    public int age;

    public void call(){

    }

    public void jump(){

    }
}

public class checkType {
    public static void main(String[] args) {

        //java確認型別用法
        double[] values = new double[10];

        if(values instanceof double[]){
            System.out.println("is double array");
        }
        

        // java 簡易反射用法-------------------
        System.out.println("");
        System.out.println("取得Dog的方法：");
        Class c = Dog.class;
        Method m[] = c.getDeclaredMethods();
        for (int i = 0; i < m.length; i++)
        System.out.println(m[i].getName());

        System.out.println("");
        System.out.println("取得Dog的屬性：");
        Field  f[] = c.getFields();
        for (int i = 0; i < f.length; i++)
        System.out.println(f[i].getName());
        
    }
}
