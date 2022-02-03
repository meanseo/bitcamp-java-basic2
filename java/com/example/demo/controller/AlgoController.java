package com.example.demo.controller;

import com.example.demo.algorithm.Stack;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : 최민서
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     최민서        최초 생성
 */
public class AlgoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        while (true){
            System.out.println("[menu] 0.Exit \n" +
                    "[사람 1] 1. stack \t"+
                    "2. Queue \t" +
                    "3. heap \n"+
                    "[사람 2] 4. hash \t"+
                    "5. sort \n"+
                    "[사람 3] 6. brute force \t"+
                    "7. bfs \t"+
                    "8. bfs \n"+
                    "[사람 4] 9. dp \t"+
                    "10. graph \n"+
                    "[사람 5] 11. bin search \t"+
                    "12. greedy \n");
            switch (scanner.next()){
                case "0": return;
                case "1":
                    System.out.println(stack.solution(null)); break;
                default:
                    System.out.println("Wrong number");break;
            }

        }
    }
}
