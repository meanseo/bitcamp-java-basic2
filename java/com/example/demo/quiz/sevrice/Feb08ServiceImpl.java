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
        for (int dan = 2; dan < 10; dan += 4){
            for (int i = 1; i <= 9; i++){
                for (int j = dan; j < dan+4; j++){
                    System.out.print(j + "*" + i + "="+(j * i)+"\t");
                }
                System.out.print("\n");
            }
            System.out.println("\n");
        }
    }
}
