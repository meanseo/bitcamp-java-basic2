package com.example.demo.calc2;

public class Calc2App {
    static String WEB_TITLE = "계산기 2";
    private int num1;
    private String opcode;
    private int num2;

    public String calc(int num1, String opcode, int num2){
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        return String.format(" %d %s %d = %d ",this.num1, this.opcode, this.num2);

    }
}
