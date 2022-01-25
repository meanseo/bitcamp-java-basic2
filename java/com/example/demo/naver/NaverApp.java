package com.example.demo.naver;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverApp.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : 아이디를 받아 로그인하는 앱
 * 클래스 변수 TITLE
 * 파라미터 id
 * 인스턴스 (this.)id
 * 로컬 변수 res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class NaverApp {
    public static String TITLE = " NAVER ";
    private String id;

    public String naver(String id){
        this.id = id;
        String res = " id : %s 로그인 성공하였습니다.";
        return String.format(res,this.id);

    }
}
