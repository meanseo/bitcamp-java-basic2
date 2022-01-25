package com.example.demo.login;

import java.util.Scanner;

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
