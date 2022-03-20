package com.example.demo.annotation;

/**
 * Create By hc on 2022/1/22
 */
public class Apple {
    //    2:使用注解接口
    @FruitProvider(id = 1, name = "陕西红富士集团", address = "陕西省西安市")
    private String appleProvider;

    public String getAppleProvider() {
        return appleProvider;
    }

    public void setAppleProvider(String appleProvider) {
        this.appleProvider = appleProvider;
    }
}
