package com.example.demo.service;


import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName   : Feb07ServiceImpl
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service{

    @Override
    public void getDice(Scanner scanner) {

    }

    @Override
    public void getRps(Scanner scanner) {

    }

    @Override
    public void getPrime(Scanner scanner) {
        System.out.println("두 수를 입력하시오.");
        System.out.println("num 1");
        int num1 = scanner.nextInt();
        System.out.println("num 2");
        int num2 = scanner.nextInt();
        int count=0;
        for(int i = num1; i <= num2; i++) {
            for(int j=2; j<=i; j++) {
                if(i%j ==0) {
                    count ++;
                }
            }
            if(count==1){
                System.out.println(i+" ");
            }
            count=0;
        }
    }

    @Override
    public void getLeapYear(Scanner scanner) {

    }

    @Override
    public void getGuessNumber(Scanner scanner) {

    }
}
