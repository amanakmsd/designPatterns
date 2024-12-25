package com.learning.designPatterns.creationalDP.factoryMethod.db;

@FunctionalInterface
public interface UserDatabase {
    String getUserName(int id);
}
