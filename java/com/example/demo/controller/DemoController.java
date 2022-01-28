package com.example.demo.controller;

import com.example.demo.domain.BmiDTO;
import com.example.demo.service.BmiService;
import com.example.demo.domain.CalcDTO;
import com.example.demo.service.CalcService;
import com.example.demo.domain.GoogleDTO;
import com.example.demo.service.GoogleService;
import com.example.demo.domain.GradeDTO;
import com.example.demo.service.GradeService;
import com.example.demo.domain.LoginDTO;
import com.example.demo.service.LoginService;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController
 * author     : 최민서
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-27     최민서        최초 생성
 */

public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BmiDTO bmi = new BmiDTO();
        BmiService bmiService = new BmiService();
        CalcDTO calc = new CalcDTO();
        CalcService calcService = new CalcService();
        GoogleDTO google = new GoogleDTO();
        GoogleService googleService = new GoogleService();
        GradeDTO grade = new GradeDTO();
        GradeService gradeService = new GradeService();
        LoginDTO login = new LoginDTO();
        LoginService loginService = new LoginService();
        while (true){
            System.out.println("메뉴 선택");
            String menu = "0.EXIT 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String res = "";
            switch (scanner.next()) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1": res = "BMI";
                    System.out.println(BmiDTO.TITLE + "\n 이름, 키, 몸무게");
                    bmi.setName(scanner.next());
                    bmi.setHei(scanner.next());
                    bmi.setWei(scanner.next());
                    res = bmiService.getBmi(bmi);
                break;
                case "2": res = "CAlC";
                    System.out.println(CalcDTO.CALC_TITLE + "\n 숫자1, 연산자, 숫자2 입력");
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    res = calcService.getCalc(calc);
                break;
                case "3": res = "GOOGLE";
                    System.out.println(GoogleDTO.WEB_TITLE + "\n 검색어를 입력하세요.");
                    google.setSearch(scanner.next());
                    res = googleService.getGoogle(google);
                break;
                case "4": res = "GRADE";
                    System.out.println(GradeDTO.GRADE_TITLE + "\n 이름, 국어, 영어, 수학");
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    res = gradeService.getGrade(grade);
                break;
                case "5": res = "LOGIN";
                    System.out.println(LoginDTO.LOGIN_TITLE + "\n id, pw, name");
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    res = loginService.getLogin(login);
                break;
                default: res = "없는 메뉴 입니다.";
                break;
            }
            System.out.println(res);
        }
    }
}
