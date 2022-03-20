package com.example.demo.reflect;

import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Create By hc on 2022/1/12
 */
public class Test {
    public static void main(String[] args)throws Exception {
        Class clz = Class.forName("com.example.demo.entity.Person");
        Method method = clz.getMethod("setName", String.class);
        Constructor constructor = clz.getConstructor();
        Object object = constructor.newInstance();
        method.invoke(object,"alex");
    }
}