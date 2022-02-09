package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : DmbCellPhone
 * author     : 최민서
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     최민서        최초 생성
 */
public class DmbCellPhone extends CellPhone{
    public int channel;
    public DmbCellPhone(String model, String color, int channel){
        this.model = model;
        this.color = color;
        this.channel = channel;
    }

    public void turnOnDmb(){
        System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
    }
    public void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널" + channel + "번으로 바꿉니다.");
    }
    public void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }

}
