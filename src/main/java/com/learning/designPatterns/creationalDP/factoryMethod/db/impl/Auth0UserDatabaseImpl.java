package com.learning.designPatterns.creationalDP.factoryMethod.db.impl;

import com.learning.designPatterns.creationalDP.factoryMethod.db.UserDatabase;

public class Auth0UserDatabaseImpl implements UserDatabase {
    @Override
    public String getUserName(int id) {
        return "Auth0" + id;
    }
}
