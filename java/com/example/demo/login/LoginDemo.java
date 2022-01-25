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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.LOGIN_TITLE);
        System.out.println("id :");
        String id = scanner.next();
        System.out.println("pw :");
        String pw = scanner.next();
        System.out.println("name :");
        String name = scanner.next();
        String res = loginApp.login(id, pw, name);
        System.out.println("result :" + res);
    }
}
