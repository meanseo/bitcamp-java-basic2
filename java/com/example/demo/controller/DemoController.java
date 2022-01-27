package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

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
        BmiDemo bmiDemo = new BmiDemo();
        CalcDemo calcDemo = new CalcDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();
        while (true){
            System.out.println("메뉴 선택");
            String menu = "0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String res = "";
            switch (select) {
                case "0" :
                    System.out.println("Exit"); return;
                case "1": res = "BMI";
                    System.out.println(BmiApp.TITLE + "\n 이름, 키, 몸무게");
                    res = bmiDemo.execute(scanner.next(), scanner.next(), scanner.next());
                break;
                case "2": res = "CAlC";
                    System.out.println(CalcApp.CALC_TITLE + "\n 숫자1, 연산자, 숫자2 입력");
                    res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                break;
                case "3": res = "SEARCH";
                    System.out.println(GoogleApp.WEB_TITLE + "\n 검색어를 입력하세요.");
                    res = googleDemo.execute(scanner.next());
                break;
                case "4": res = "GRADE";
                    System.out.println(GradeApp.GRADE_TITLE + "\n 이름, 국어, 영어, 수학");
                    res = gradeDemo.execute(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                break;
                case "5": res = "LOGIN";
                    System.out.println(LoginApp.LOGIN_TITLE + "\n id, pw, name");
                    res = calcDemo.execute(scanner.nextInt(),scanner.next(),scanner.nextInt());
                break;
                default: res = "없는 메뉴 입니다.";
                break;
            }
            System.out.println(res);
        }
    }
}
