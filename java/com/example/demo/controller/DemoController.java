package com.example.demo.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : 최민서
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     최민서        최초 생성
 */
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.println("메뉴 선택");
            String menu = "1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select) {
                case "1": res = "BMI"; break;
                case "2": res = "CAlC"; break;
                case "3": res = "SEARCH"; break;
                case "4": res = "GRADE"; break;
                case "5": res = "LOGIN"; break;
                default: res = "없는 메뉴 입니다."; break;
            }
            System.out.println(res);
        }
    }
}
