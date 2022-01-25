package com.example.demo.login;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginApp.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 아이디, 비번, 이름을 받아서 로그인하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class LoginApp {
    static String LOGIN_TITLE = " * Login App * ";
    private String id;
    private String pw;
    private String name;

    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        return String.format("id : %s, pw : %s, name : %s",this.id, this.pw, this.name);

    }

}
