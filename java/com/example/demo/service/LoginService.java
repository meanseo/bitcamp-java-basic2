package com.example.demo.service;

import com.example.demo.domain.LoginDTO;

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
public class LoginService {
    public String getLogin(LoginDTO login) {
        return (login.getPw().equals(LoginDTO.PASSWORD)) ? String.format(" %s 님의 비번 %s가 맞습니다. 로그인 성공",login.getId(), login.getPw())
                : String.format(" %s 님의 ID는 맞고 비번 %s가 틀립니다. 로그인 실패", login.getId(), login.getPw());
    }
}
