package com.example.demo.bmi;

/**
 * packageName: com.example.demo.bmi
 * fileName   : BmiApp.java
 * author     : 최민서
 * date       : 2022-01-25
 * desc       : bmi 값을 받아 결과를 리턴하는 앱
 *  클래스 변수 TITLE
 *  파라미터 name, height, kg
 *  인스턴스 (this.)name, (this.)height, (this.)kg
 *  로컬 변수 res
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-25     최민서        최초 생성
 */
public class BmiApp {
    public static String TITLE = "BMI";
    private String name;
    private String hei;
    private String wei;

    public String bmi(String name, String hei, String wei){
        this.name = name;
        this.hei = hei;
        this.wei = wei;
        String res = "";
        return res;
    }



}
