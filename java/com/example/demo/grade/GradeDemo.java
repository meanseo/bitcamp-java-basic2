package com.example.demo.grade;

import com.example.demo.calc.CalcApp;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName   : GradeDemo
 * author     : 최민서
 * date       : 2022-01-26
 * desc       :
 *
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26     최민서        최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        System.out.println("이름");
        String name = scanner.next();
        System.out.println("국어");
        int kor = scanner.nextInt();
        System.out.println("영어");
        int eng = scanner.nextInt();
        System.out.println("수학");
        int math = scanner.nextInt();
        String grade = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(grade);
    }
}
