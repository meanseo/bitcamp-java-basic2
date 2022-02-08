package com.example.demo.quiz.sevrice;


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
        String s = "";
        int num = (int) (Math.random() * 6) + 1;
        switch (num) {
            case 1:
                s = "1번";
                break;
            case 2:
                s = "2번";
                break;
            case 3:
                s = "3번";
                break;
            case 4:
                s = "4번";
                break;
            case 5:
                s = "5번";
                break;
            case 6:
                s = "6번";
                break;
        }
        System.out.println(s);
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
        int year = scanner.nextInt();
        String res = "";
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            res = year + "년은 윤년";
        } else {
            res = year + "년은 평년";
        }
        System.out.println(res);

        /**
         * 윤년은 해당 연도를 4로 나눈 값이 0임을 의미한다.
         * 그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나
         * 400으로 나눈 값이 0인 것은 윤년으로 포함된다.
         * 그 외의 나머지 연도는 평년이다.
         * year % 4 == 0  year의 값은 4로 나눈 값이 0이여야한다.
         * &&                그리고(and)
         * year % 100 != 0   year의 값은 100으로 나누었을 때 0이 되면 안된다 (!는 부정의 의미)
         * ||               혹은 (or)
         * year % 400 == 0 year의 값은 400으로 나눈 값이 0이여야한다.
         *
         * else  {res = year + "년은 평년";} 이 외의 값은 모두 +년은 평년으로 출력된다.
         */
    }

    @Override
    public void getGuessNumber(Scanner scanner) {
        int answer = (int) (Math.random() * 100 + 1);
        int input;

        while (true) {
            System.out.println("1~100 사이 자연수 입력");
            input = scanner.nextInt();

            if (answer > input) {
                System.out.println("Up");
            } else if (answer < input) {
                System.out.println("Down");
            } else {
                System.out.println("정답");
                break;
            }
        }
    }
}
