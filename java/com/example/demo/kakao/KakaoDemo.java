package com.example.demo.kakao;

import java.util.Scanner;

public class KakaoDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        KakaoApp kakaoApp = new KakaoApp();
        System.out.println(KakaoApp.KAKAO_TITLE);
        System.out.println(" Telno :");
        String telno = scanner.next();
        System.out.println(" Message :");
        String message = scanner.next();
        String res = kakaoApp.kakao(telno, message);
        System.out.println(res);
    }
}
