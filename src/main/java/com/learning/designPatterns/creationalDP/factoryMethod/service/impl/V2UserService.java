package com.learning.designPatterns.creationalDP.factoryMethod.service.impl;

import com.learning.designPatterns.creationalDP.factoryMethod.db.UserDatabase;
import com.learning.designPatterns.creationalDP.factoryMethod.db.impl.KeycloakUserDatabaseImpl;
import com.learning.designPatterns.creationalDP.factoryMethod.service.UserService;

public class V2UserService extends UserService {

    @Override
    protected UserDatabase createDB() {
        return new KeycloakUserDatabaseImpl();
    }
}
