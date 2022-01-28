package com.example.demo.domain;
/**
 * packageName: com.example.demo.calc
 * fileName   : KakaoApp.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 전화번호와 메세를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class KakaoDTO {
    public static String KAKAO_TITLE = "=== Kakao ===";
    private String telno;
    private String message;

    public String kakao(String telno, String message){
        this.telno = telno;
        this.message = message;
        return String.format("telno : %s, message : %s", this.telno, this.message);

    }
}
