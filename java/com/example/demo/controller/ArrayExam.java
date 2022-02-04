package com.example.demo.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : ArrayExam
 * author     : 최민서
 * date       : 2022-02-04
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-04     최민서        최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr = {"김승현", "김윤섭", "최민서", "한성수", "김태욱",
                "Sort", "Stack", "Hash", "Heap", "Greedy",
                "Binary Search", "Queue", "Graph", "DFS", "BFS",
                "Brute Force", "DP"};

        System.out.println("Q1. 팀별 과제를 출력하세요.");
        String s = "";
        for (int i = 0; i < arr.length; i++){
            if(i%5 == 0){ s += "\n";
            }
            s += arr[i]+ "\t";
        }
        System.out.println(s);
        System.out.println("Q2. 팀장님이 맡은 과제만 출력하세요.");
        s = "";
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("김윤섭")){
                for (int j = 0; j < 4; j++){
                    s += arr[i + j * 5] + " ";
                }
            }
        System.out.println(s);

        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        s = "";
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals("Queue")){
                s += arr[i] + "를 담당한 사람: " + arr[i % 5];
            }
        }
        System.out.println(s);
    }
}

