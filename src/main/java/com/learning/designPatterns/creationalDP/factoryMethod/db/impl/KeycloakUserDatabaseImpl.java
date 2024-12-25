package com.learning.designPatterns.creationalDP.factoryMethod.db.impl;

import com.learning.designPatterns.creationalDP.factoryMethod.db.UserDatabase;

public class KeycloakUserDatabaseImpl implements UserDatabase {
    @Override
    public String getUserName(int id) {
        return "Keycloak" + id;
    }
}
