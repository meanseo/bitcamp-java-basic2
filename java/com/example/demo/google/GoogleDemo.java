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
    public String execute(String search) {
        GoogleApp googleApp= new GoogleApp();
        return googleApp.google(search);



    }
}
