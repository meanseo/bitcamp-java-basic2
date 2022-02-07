package com.example.demo.controller;

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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] oneNames = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "Sort", "Stack", "Hash", "Heap", "Greedy",
                "Binary Search", "Queue", "Graph", "DFS", "BFS",
                "Brute Force", "DP"};

        while (true){
            System.out.println("문제를 선택하세요");
            String menu = "0.종료 1.quiz1 2.quiz2 3.quiz3 4.quiz4";
            System.out.println(menu);
            switch (scanner.next()){
                case "0" :
                    System.out.println("시스템 종료"); break;
                case "1" :
                    quiz1(oneNames);break;
                case "2" :
                    quiz2(oneNames);break;
                case "3" :
                    quiz3(oneNames);break;
                case "4" :
                    quiz4(oneNames);break;
                default:
                    System.out.println("잘못된 번호 입니다.");
            }
        }
    }

    private static void quiz4(String[] oneNames) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        String s = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] countArr = new int[5];
        for (int i = 0; i<5; i++){
            if (oneNames[i].equals(oneNames[5])){
                count0++;
            }
            if (oneNames[i].equals(oneNames[6])){
                count1++;
            }
            if (oneNames[i].equals(oneNames[7])){
                count2++;
            }
            if (oneNames[i].equals(oneNames[8])){
                count3++;
            }
            if (oneNames[i].equals(oneNames[9])){
                count4++;
            }
        }
        System.out.println(oneNames[0]+"의 카운트는 " +count0);
        System.out.println(oneNames[1]+"의 카운트는 " +count1);
        System.out.println(oneNames[2]+"의 카운트는 " +count2);
        System.out.println(oneNames[3]+"의 카운트는 " +count3);
        System.out.println(oneNames[4]+"의 카운트는 " +count4);
    }

    private static void quiz3(String[] oneNames) {
        String s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        for (int i = 0; i < oneNames.length; i++){
            if (oneNames[i].equals("Queue")){
                s += oneNames[i] + "를 담당한 사람: " + oneNames[i%5];
            }
            if(i == 17){
                break;
            }
        }
        System.out.println(s);
    }

    private static void quiz2(String[] oneNames) {
        String s = "";
        System.out.println("Q2. 팀장님이 맡은 과제만 출력하세요.");
        for (int i = 0; i < oneNames.length; i++){
            if (oneNames[i].equals("김윤섭")){
                for (int j = 0; j < 4; i++){
                    s += oneNames[i + j*5];
                }
            }
        }
        System.out.println(s);
    }

    private static void quiz1(String[] oneNames) {
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        String s = "";
        for (int i = 0; i < oneNames.length; i++){
            if (i % 5 == 0){
                s += "\n";
            }
            s += oneNames[i] + "\t";
        }
        System.out.println(s);
    }
}
