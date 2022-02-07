package com.example.demo.service;

/**
 * packageName: com.example.demo.service
 * fileName   : quizService
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public class QuizServiceImpl implements QuizService{
    @Override
    public void quiz1(String[] oneNames) {
        System.out.println("Q1. 팀별 과제를 출력하세요.");
        String s = "";
        for (int i = 0; i < oneNames.length; i++){
            if (i % 5 == 0){
                s += "\n";
            }
            s += oneNames[i] + "\t";
        }
        System.out.println(s);
    }

    @Override
    public void quiz2(String[] oneNames) {
        String s = "";
        System.out.println("Q2. 팀장님이 맡은 과제만 출력하세요.");
        for (int i = 0; i < oneNames.length; i++){
            if (oneNames[i].equals("김윤섭")){
                for (int j = 0; j < 4; i++){
                    s += oneNames[i + j*5];
                }
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz3(String[] oneNames) {
        String s = "";
        System.out.println("Q3. 큐를 담당한 사람을 출력하세요.");
        for (int i = 0; i < oneNames.length; i++){
            if (oneNames[i].equals("Queue")){
                s += oneNames[i] + "를 담당한 사람: " + oneNames[i%5];
            }
            if(i == 17){
                break;
            }
        }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] oneNames) {
        System.out.println("Q4. 팀원별 과제 수를 출력하세요.");
        String s = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int[] countArr = new int[5];
        for (int i = 0; i<5; i++){
            if (oneNames[i].equals(oneNames[5])){
                count0++;
            }
            if (oneNames[i].equals(oneNames[6])){
                count1++;
            }
            if (oneNames[i].equals(oneNames[7])){
                count2++;
            }
            if (oneNames[i].equals(oneNames[8])){
                count3++;
            }
            if (oneNames[i].equals(oneNames[9])){
                count4++;
            }
        }
        System.out.println(oneNames[0]+"의 카운트는 " +count0);
        System.out.println(oneNames[1]+"의 카운트는 " +count1);
        System.out.println(oneNames[2]+"의 카운트는 " +count2);
        System.out.println(oneNames[3]+"의 카운트는 " +count3);
        System.out.println(oneNames[4]+"의 카운트는 " +count4);
    }
}
