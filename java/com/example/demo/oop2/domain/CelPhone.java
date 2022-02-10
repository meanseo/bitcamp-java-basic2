package com.example.demo.oop2.domain;

/**
 * packageName: com.example.demo.oop2.domain
 * fileName   : CelPhone
 * author     : 최민서
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     최민서        최초 생성
 */
public class CelPhone extends Phone{
    protected boolean portable;
    protected String move;

    public boolean isPortable() {
        return portable;
    }

    public void setPortable(boolean portable) {
        this.portable = portable;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return String.format("%s 인 %s 제품을 사용해서 %s라고 %s 통화한다.",super.getCompany(),super.getCall(),move);
    }
}
