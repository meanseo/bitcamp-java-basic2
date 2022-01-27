package com.example.demo.login;

import java.util.Scanner;
/**
 * packageName: com.example.demo.calc
 * fileName   : LoginDemo.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : LoginApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class LoginDemo {
    public String execute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.login(id, pw, name);
    }
}
