package com.learning.designPatterns.creationalDP.factoryMethod.service;

import com.learning.designPatterns.creationalDP.factoryMethod.db.UserDatabase;

public abstract class UserService {

    public String getUser(int id) {
        UserDatabase userDatabase = createDB();
        return userDatabase.getUserName(id);
    }

    protected abstract UserDatabase createDB();
}
