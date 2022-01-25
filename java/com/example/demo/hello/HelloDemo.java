package com.example.demo.hello;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : HelloDemo.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : HelloApp 을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.HELLO_TITLE);
        System.out.println("이름 :");
        String name = scanner.next();
        System.out.println("나이 :");
        int age = scanner.nextInt();
        String res = helloApp.hello(name, age);
        System.out.println(res);

    }
}
