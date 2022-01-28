package com.example.demo.service;

import com.example.demo.domain.BmiDTO;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : BmiApp을 실행시키는 컨트롤러
 * =================================
 * DATE        AUTHOR        NOTE
 * =================================
 * 2022-01-25     최민서        최초 생성
 */
public class BmiService {
    public String getBmi (BmiDTO bmi) {

        return String.format("%s 정상", bmi.getName());
    }
}
