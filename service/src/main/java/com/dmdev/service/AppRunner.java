package com.dmdev.service;

import com.dmdev.service.service.UserService;

public class AppRunner {

    public static void main(String[] args) {
        UserService userService = new UserService();
        System.out.println(userService.getUser(25L));
    }
}
