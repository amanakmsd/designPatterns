package com.learning.designPatterns.creationalDP.singleton.service;

import com.learning.designPatterns.creationalDP.singleton.connection.DBConnection;

public class DBService {

    public static void main(String[] args) {
        String connection1 = DBConnection.INSTANCE.getConnection();
        System.out.println(connection1);

        String connection2 = DBConnection.INSTANCE.getConnection();
        System.out.println(connection2);
    }
}
