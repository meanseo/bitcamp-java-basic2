package com.example.demo;

import java.util.Scanner;

/**
 * packageName: com.example.demo
 * fileName   : Test
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("출력할 단을 입력하세요 : ");
            int input = scanner.nextInt();
            if (input<2 || input >9){
                System.out.println("2~9단을 입력해주세요.");
            }else
                for (int j = 1; j < 10; j++) {
                    System.out.println(input + "*" + j + "=" + input * j);return;
                }
        }
    }
}
