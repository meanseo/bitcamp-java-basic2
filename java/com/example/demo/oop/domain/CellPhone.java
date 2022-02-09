package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : CellPhone
 * author     : 최민서
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     최민서        최초 생성
 */
public class CellPhone {
     public String model;
     public String color;

    public void powerOn(){System.out.println("전원을 켭니다.");}
    public void powerOff(){System.out.println("전원을 켭니다.");}
    public void bell(){System.out.println("벨이 울립니다.");}
    public void sendVoice(String message){System.out.println("자기: "+ message);}
    public void receiveVice(String message){System.out.println("상대방:" + message);}
    public void hangUP(){System.out.println("전화를 끊습니다.");}
}
