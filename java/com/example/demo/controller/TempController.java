package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : TempController
 * author     : 최민서
 * date       : 2022-02-03
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-03     최민서        최초 생성
 */

public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] oneNames = {"최민서", "한성수", "김윤섭", "김승현",
                             "해시",   "힙",   "스택",    "sort",
                             "그래프", "DFS",   "큐",    "이분탐색",
                             "그리디", "BFS",   "DP",    "완전탐색"};

        for (int i = 0; i < 4; i++){
            System.out.println(oneNames[i] + ": "
                    + oneNames[i+4] + ", "
                    + oneNames[i+8]+ ", "
                    + oneNames[i+12]);
        }
    }
}