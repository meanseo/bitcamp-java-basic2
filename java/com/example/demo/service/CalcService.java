package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

/**
 * packageName: com.example.demo.calc
 * fileName   : CalcDemo.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 */
public class CalcService {
    public String getCalc(CalcDTO calc){
        int res = 0;
        switch (calc.getOpcode()){
            case "+" : res = calc.getNum1() + calc.getNum2();
            case "-" : res = calc.getNum1() - calc.getNum2();
            case "*" : res = calc.getNum1() * calc.getNum2();
            case "/" : res = calc.getNum1() / calc.getNum2();
        }
        return String.format("%d %s %d = %d",calc.getNum1(),calc.getOpcode(),calc.getNum2(),res);
    }
}
