package com.example.demo.service;

import com.example.demo.domain.UserDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.user
 * fileName   : UserDemo
 * author     : 최민서
 * date       : 2022-01-26
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-01-26     최민서        최초 생성
 */
public class UserService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserDTO userApp = new UserDTO();
        String res = userApp.getUser();
        System.out.println(res);

    }
}
