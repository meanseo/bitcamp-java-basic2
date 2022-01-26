package com.example.demo.calc;
/**
 * packageName: com.example.demo.calc
 * fileName   : CalcApp.java
 * author     : 최민서
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연산자를 받아서 결과를 리턴하는 앱
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-24   최민서      최초 생성
 * 2022-01-26   최민서      if 절 추가, 4칙연산 가능하도록 개선
 */
public class CalcApp {
    static String CALC_TITLE = "계산기";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        int res = 0;
        /*
        if(opcode.equals("+")){
            res = num1 + num2;
        }else if(opcode.equals("-")){
            res = num1 - num2;
        }else if(opcode.equals("*")){
            res = num1 * num2;
        }else if(opcode.equals("/")){
            res = num1 / num2;
        }else
            res = 0;*/

        switch (opcode){
            case "+": res = num1 + num2; break;
            case "-": res = num1 - num2; break;
            case "*": res = num1 * num2; break;
            case "/": res = num1 / num2; break;
        }

        String result  = String.format(" %d %s %s = %d", this.num1, this.opcode, this.num2, res);
        return result;
    }
}
