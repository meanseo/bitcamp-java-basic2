package com.example.demo.service;

import com.example.demo.domain.NaverDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverDemo.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : NaverApp을 실행시키는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class NaverService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NaverDTO naverApp = new NaverDTO();
        System.out.println(NaverDTO.TITLE);
        System.out.println("아이디");
        String id = scanner.next();
        String res = naverApp.naver(id);
        System.out.println(res);
    }
}
