package com.learning.designPatterns.creationalDP.factoryMethod.controller;

import com.learning.designPatterns.creationalDP.factoryMethod.service.UserService;
import com.learning.designPatterns.creationalDP.factoryMethod.service.impl.V1UserService;
import com.learning.designPatterns.creationalDP.factoryMethod.service.impl.V2UserService;

public class UserController {


    public static void main(String[] args) {
        UserService v1UserService = new V1UserService();
        String user = v1UserService.getUser(1);
        System.out.println(user);

        UserService v2UserService = new V2UserService();
        String user2 = v2UserService.getUser(2);
        System.out.println(user2);
    }
}
