package com.example.demo.quiz.sevrice;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.sevrice
 * fileName   : Feb08ServiceImpl
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service {
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {

    }

    @Override
    public void gugudan(Scanner scanner) {
        /** int a = (int) (Math.random() * 9 + 1);
        int b = (int) (Math.random() * 9 + 1);
        int res = a * b;

        System.out.println(a + "*" + b + "= ?");
        int input = scanner.nextInt();
        System.out.println((input == res) ? "정답입니다." : "오답입니다.");
         */
        while (true){
            System.out.println("출력할 단을 입력하세요 : ");
            int input = scanner.nextInt();
            if (input<2 || input>9){
                System.out.println("2~9단을 입력해주세요.");
            }else{
                for (int j = 1; j < 10; j++) {
                    System.out.println(input + "*" + j + "=" + input * j);
                }
                break;
            }
        }


    }
}
