package com.example.demo.google;

import java.util.Scanner;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleDemo.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : GoogleApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class GoogleDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GoogleApp googleApp= new GoogleApp();
        System.out.println(GoogleApp.WEB_TITLE);
        System.out.println("Google 검색 또는 URL 입력");
        String search = scanner.next();
        String res = googleApp.google(search);
        System.out.println(res);


    }
}
