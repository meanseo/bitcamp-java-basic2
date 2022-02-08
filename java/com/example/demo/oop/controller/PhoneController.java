package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : PhoneController
 * author     : 최민서
 * date       : 2022-02-08
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-08     최민서        최초 생성
 */
public class PhoneController {
    public void execute(Scanner scanner) {

        PhoneService service = new PhoneServiceImpl();
        while (true){
            System.out.println("메뉴를 선택하세요.");
            String menu = "0.EXIT\n" +
                    " 1.집전화\n" +
                    " 2.휴대폰\n" +
                    " 3.아이폰\n" +
                    " 4.갤럭시노트";
            System.out.println(menu);
            switch (scanner.next()){
                case "0" :System.out.println("EXIT"); return;
                case "1" :
                    System.out.println("집전화");
                    service.usePhone(scanner); break;
                case "2" :
                    System.out.println("휴대폰");
                    service.useCelPhone(scanner); break;
                case "3" :
                    System.out.println("아이폰");
                    service.useIPhone(scanner); break;
                case "4" :
                    System.out.println("갤럭시노트");
                    service.useGalPhone(scanner); break;
                default: System.out.println("잘못된 메뉴 선택입니다."); break;
            }
        }
    }
}
