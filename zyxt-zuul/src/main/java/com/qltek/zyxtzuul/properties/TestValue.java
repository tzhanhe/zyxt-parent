package com.qltek.zyxtzuul.properties;

import org.springframework.beans.factory.annotation.Value;

public class TestValue {
    @Value("${spring.aa}")
    private static String bb;
    static{
        System.out.println("===============");
        System.out.println(bb);
    }
}
