package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : BmiApp을 실행시키는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class BmiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiApp bmiApp = new BmiApp();
        System.out.println(BmiApp.TITLE);
        System.out.println("name : ");
        String name = scanner.next();
        System.out.println("height : ");
        String height = scanner.next();
        System.out.println("kg : ");
        String kg = scanner.next();
        String res = bmiApp.bmi(name, height, kg);
        System.out.println(res);
    }
}
