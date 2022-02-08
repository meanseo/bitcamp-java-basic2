package com.example.demo.quiz.controller;

import com.example.demo.quiz.sevrice.QuizService;
import com.example.demo.quiz.sevrice.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController2
 * author     : 최민서
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-04     최민서        최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner) {
        Feb06Controller feb06Controller = new Feb06Controller();
        Feb07Controller feb07Controller = new Feb07Controller();
        Feb08Controller feb08Controller = new Feb08Controller();
        while (true){
            System.out.println("0)EXIT 1)2월6일 2)2월7일 3)2월8일");
            switch (scanner.next()){
                case "0" :
                    System.out.println("### EXIT ###");return;
                case "1":
                    feb06Controller.execute(scanner);break;
                case "2":
                    feb07Controller.execute(scanner);break;
                case "3":
                    feb08Controller.execute(scanner);break;
                default:
                    System.out.println("Wrong Number");break;
            }
        }
    }

}
