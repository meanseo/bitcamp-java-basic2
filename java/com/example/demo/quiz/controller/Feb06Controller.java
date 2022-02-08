package com.example.demo.quiz.controller;

import com.example.demo.quiz.sevrice.QuizService;
import com.example.demo.quiz.sevrice.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName   : Feb06Controller
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class Feb06Controller {
    public void execute(Scanner scanner) {
        QuizService service = new QuizServiceImpl();
        String[] oneNames = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "Sort", "Stack", "Hash", "Heap", "Greedy",
                "Binary Search", "Queue", "Graph", "DFS", "BFS",
                "Brute Force", "DP"};

        while (true){
            String menu = "0.종료 1.팀별 과제 출력 2.팀장 과제만 출력 3.큐를 담당한 사람 출력 4.팀원별 과제 수를 출력";
            System.out.println(menu);
            System.out.println("문제를 선택하세요");

            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템 종료"); return;
                case "1" :
                    service.quiz1(oneNames);break;
                case "2" :
                    service.quiz2(oneNames);break;
                case "3" :
                    service.quiz3(oneNames);break;
                case "4" :
                    service.quiz4(oneNames);break;
                default:
                    System.out.println("잘못된 번호 입니다.");
            }
        }
    }
}
