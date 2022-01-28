package com.example.demo.controller;

import com.example.demo.algorithm.Stack;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController2
 * author     : 최민서
 * date       : 2022-01-27
 * desc       : 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때,
 * 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
 *
 * 제한사항
 * prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 * prices의 길이는 2 이상 100,000 이하입니다.
 * 입출력 예
 * prices	return
 * [1, 2, 3, 2, 3]	[4, 3, 1, 1, 0]
 * 입출력 예 설명
 * 1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
 * 2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
 * 3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
 * 4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
 * 5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
 * ※ 공지 - 2019년 2월 28일 지문이 리뉴얼되었습니다.
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
