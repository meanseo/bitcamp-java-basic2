package com.example.demo.oop2.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.oop2.controller
 * fileName   : OopController
 * author     : 최민서
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     최민서        최초 생성
 */
public class OopController {
    public void execute(Scanner scanner){
        while (true){
            System.out.println("[메뉴] 0.exit 1.은닉화 2.상속 3.추상화 4.다형성");
            switch (scanner.next()){
                case "0":
                    System.out.println("실행 종료");return;
                case "1":
                    System.out.println("### 은닉화 ###");
                    break;
                case "2":
                    System.out.println("### 상속 ###");
                    break;
                case "3":
                    System.out.println("### 추상화 ###");
                    break;
                case "4":
                    System.out.println("### 다형성 ###");
                    break;
                default:
                    System.out.println("Wrong Number");
                    break;
            }
        }
    }
}
