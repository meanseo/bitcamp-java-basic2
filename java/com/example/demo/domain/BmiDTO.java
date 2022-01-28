package com.example.demo.domain;

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
public class BmiDTO {
    public static String TITLE = "BMI";
    private String name;
    private String hei;
    private String wei;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getHei(){
        return hei;
    }

    public void setHei(String hei){
        this.hei = hei;
    }

    public String getWei(){
        return wei;
    }

    public void setWei(String wei){
        this.wei = wei;
    }

}
