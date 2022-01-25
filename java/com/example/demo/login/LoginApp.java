package com.example.demo.login;

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
