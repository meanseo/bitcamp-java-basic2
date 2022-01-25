package com.example.demo.hello;

public class HelloApp {
    static String HELLO_TITLE = " hello.com";
    private String name;
    private int age;

    public String hello(String name,int age){
        this.name = name;
        this.age = age;
        return String.format ("안녕 내 이름은 %s 이고, 나이는 %d 이야.",this.name, this.age);
    }
}
