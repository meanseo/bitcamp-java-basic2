package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleDemo.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : GoogleApp을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class GoogleService {
    public String getGoogle(GoogleDTO google) {

        return String.format("검색 결과는 ' %s ' 입니다.", google.getSearch());



    }
}
