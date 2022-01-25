package com.example.demo.kakao;

public class KakaoApp {
    static String KAKAO_TITLE = "=== Kakao ===";
    private String telno;
    private String message;

    public String kakao(String telno, String message){
        this.telno = telno;
        this.message = message;
        return String.format("telno : %s, message : %s", this.telno, this.message);

    }
}
