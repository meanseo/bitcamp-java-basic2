package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentService
 * author     : 최민서
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-07     최민서        최초 생성
 */
public interface MemberService {
    String getBmi (BmiDTO bmi);
    String getCalc(CalcDTO calc);
    String getGoogle(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String getLogin(UserDTO login);
}
