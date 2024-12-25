package com.learning.designPatterns.creationalDP.factoryMethod.service.impl;

import com.learning.designPatterns.creationalDP.factoryMethod.db.UserDatabase;
import com.learning.designPatterns.creationalDP.factoryMethod.db.impl.Auth0UserDatabaseImpl;
import com.learning.designPatterns.creationalDP.factoryMethod.service.UserService;

public class V1UserService extends UserService {

    public UserDatabase createDB() {
        return new Auth0UserDatabaseImpl();
    }
}
