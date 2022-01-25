package com.example.demo.calc;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class CalcDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CALC_TITLE);
        System.out.println("숫자 1:");
        int num1 = scanner.nextInt();
        System.out.println("연산 기호:");
        String opcode = scanner.next();
        System.out.println("숫자 2:");
        int num2 = scanner.nextInt();
        String res = calcApp.calc(num1, opcode, num2);
        System.out.println(res);
    }
}
