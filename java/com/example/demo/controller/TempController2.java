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
public class TempController2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        String[] oneNames = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "Sort", "Stack", "Hash", "Heap", "Greedy",
                "Binary Search", "Queue", "Graph", "DFS", "BFS",
                "Brute Force", "DP"};
        String s = "";
        for (int i = 0; i < oneNames.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ": " + oneNames[i] + "\t";
        }
        System.out.println(s);
        s = "";
        System.out.println("Q2. 팀장님이 맡은 과제만 출력하세요.");
        for (int i = 0; i < oneNames.length; i++) {
            if (oneNames[i].equals("김윤섭")) {
                for (int a = 0; a < 4; a++) {
                    s += oneNames[i + a * 5] + ", ";
                }
            }
                if (i == 17) {
                    break;


            /* if (i % 5 == 1) {
                zzang += oneNames[i] + ", ";
                if (i == 12) {break;}; */
                }
        }
        System.out.println(s);

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = "";
        for (int i = 0; i < oneNames.length; i++) {
            if (oneNames[i].equals("BFS")) {
                s += oneNames[i] + "을 담당한 사람 :" + oneNames[i % 5];
            }
        }
        System.out.println(s);
            System.out.println("Q4. 팀원별 과제 수를 입력하세요.");
            s = "";
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
    }
