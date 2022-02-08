package com.example.demo.quiz.controller;

import com.example.demo.quiz.sevrice.Feb07Service;
import com.example.demo.quiz.sevrice.Feb07ServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : Feb07Controller
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public class Feb07Controller {
    public void execute(Scanner scanner) {
        /**
         * "0.EXIT
         * 1.주사위 dice
         * 2.가위바위보 Rps
         * 3.입력받은 두 수 사이의 있는 소수 구하기 getPrime
         *"4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear
         * 5.임의로 받은 숫자 맞추기 numberGolf
         * */
        Feb07Service service = new Feb07ServiceImpl();
        while (true){
            System.out.println("메뉴를 선택하세요");
            System.out.println("0.EXIT 1.주사위 2.가위바위보 3.입력받은 두 수 사이의 있는 소수 구하기 \n" +
                    "4.자바로 입력받은 연도가 윤년인지 평년인지 판단하기 5. 임의로 받은 숫자 맞추기");
            String s = "";
            switch (scanner.next()){
                case "0":
                    System.out.println("시스템 종료"); return;
                case "1":
                    service.getDice(scanner);
                    break;
                case "2":
                    service.getRps(scanner);
                    break;
                case "3":
                    service.getPrime(scanner);
                    break;
                case "4":
                    service.getLeapYear(scanner);
                    break;
                case "5":
                    service.getGuessNumber(scanner);
                    break;
                default:
                    System.out.println("잘못된 번호 입니다."); break;
            }
        }
    }
}
