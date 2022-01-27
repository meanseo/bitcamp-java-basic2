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
 * 2022-01-26   최민서      if절 추가
 * 2022-01-26   최민서      switch절 추가
 * 2022-01-26   최민서      3항 연산식 사용
 */
public class LoginApp {
    public static String LOGIN_TITLE = " * Login App * ";
    private String id;
    private String pw;
    private String name;
    static String PASSWORD = "abc";
    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        /*
        if(pw.equals(PASSWORD)){
            res = String.format(" %s 님의 비번 %s가 맞습니다. 로그인 성공",this.id, this.pw;
        }else {
            res = String.format(" %s 님의 ID는 맞고 비번 %s가 틀립니다. 로그인 실패", this.id, this.pw);
        }*/

        /*
        switch (pw){
            case "abc": res = String.format(" %s 님의 비번 %s가 맞습니다. 로그인 성공",this.id, this.pw); break;
            default: res = String.format(" %s 님의 ID는 맞고 비번 %s가 틀립니다. 로그인 실패", this.id, this.pw); break;
        }*/

        return (pw.equals(PASSWORD)) ? String.format(" %s 님의 비번 %s가 맞습니다. 로그인 성공",this.id, this.pw)
                : String.format(" %s 님의 ID는 맞고 비번 %s가 틀립니다. 로그인 실패", this.id, this.pw);

    }
}
