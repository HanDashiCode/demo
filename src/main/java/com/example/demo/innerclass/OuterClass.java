package com.example.demo.innerclass;

/**
 * Create By hc on 2022/2/14
 */
public class OuterClass {
    private static String className = "StaticInnerClass";

    //    定义一个静态内部类
    public static class StaticInnerClass {
        public void getClassName() {
            System.out.println("className:" + className);
        }
    }

    //调用内部类
    public static void main(String[] args) {
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.getClassName();
    }
}
