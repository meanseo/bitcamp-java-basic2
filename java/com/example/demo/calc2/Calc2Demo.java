package com.example.demo.calc2;

import java.util.Scanner;

public class Calc2Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calc2App calc2App = new Calc2App();
        System.out.println(Calc2App.WEB_TITLE);
        System.out.println(" 첫번째 숫자 ");
        int num1 = scanner.nextInt();
        System.out.println(" 계산 부호 ");
        String opcode = scanner.next();
        System.out.println(" 두번째 숫자");
        int num2 = scanner.nextInt();
        String res = calc2App.calc(num1, opcode, num2);
        System.out.println(res);
    }
}
