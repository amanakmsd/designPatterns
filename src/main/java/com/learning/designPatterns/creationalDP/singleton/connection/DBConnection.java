package com.learning.designPatterns.creationalDP.singleton.connection;

import java.util.Random;

public enum DBConnection {
    INSTANCE;
    private final String connection;

    DBConnection() {
        connection = createConnection();
    }

    private String createConnection() {
        return "Connect" + new Random().nextInt();
    }

    public String getConnection() {
        return connection;
    }
}
