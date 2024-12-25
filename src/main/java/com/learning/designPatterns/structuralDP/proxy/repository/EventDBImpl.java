package com.learning.designPatterns.structuralDP.proxy.repository;

public class EventDBImpl implements EventRuleDB {

    @Override
    public String get(int id) {
        if(id==1)
            return "Hello";
        if(id == 2)
            return "Buffalo";
        return "Oops";
    }
}
