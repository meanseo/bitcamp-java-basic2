package com.example.demo.service;

import com.example.demo.domain.KakaoDTO;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoDemo.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : KakaoApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class KakaoService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoDTO kakaoApp = new KakaoDTO();
        System.out.println(KakaoDTO.KAKAO_TITLE);
        System.out.println(" Telno :");
        String telno = scanner.next();
        System.out.println(" Message :");
        String message = scanner.next();
        String res = kakaoApp.kakao(telno, message);
        System.out.println(res);
    }
}