package com.example.demo.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloApp.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 이름과 나이를 받아서 인삿말을 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class HelloDTO {
    public static String HELLO_TITLE = " hello.com";
    private String name;
    private int age;

    public String hello(String name,int age){
        this.name = name;
        this.age = age;
        return String.format ("안녕 내 이름은 %s 이고, 나이는 %d 이야.",this.name, this.age);
    }
}
