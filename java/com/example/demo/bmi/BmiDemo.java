package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiDemo.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : BmiApp을 실행시키는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class BmiDemo {
    public String execute (String name, String height, String kg) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.bmi(name, height, kg);
    }
}
