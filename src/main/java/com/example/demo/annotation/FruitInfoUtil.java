package com.example.demo.annotation;

import java.lang.reflect.Field;
import java.util.Iterator;

/**
 * Create By hc on 2022/1/23
 */
//3:定义注解处理器
public class FruitInfoUtil {
    public static void getFruitInfo(Class<?> clazz) {
        String strFruitProvider = "供应商：";
        Field[] fields = clazz.getDeclaredFields();//通过反射获取处理注解
        for (Field field : fields) {
            if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
//                处理注解信息
                strFruitProvider = " 供应商编号：" + fruitProvider.id() + " 供应商名称：" + fruitProvider.name() + " 供应商地址：" +
                        fruitProvider.address();
                System.out.println(strFruitProvider);
            }
        }
    }
}
