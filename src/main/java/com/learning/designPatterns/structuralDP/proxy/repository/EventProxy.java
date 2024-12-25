package com.learning.designPatterns.structuralDP.proxy.repository;

import java.util.HashMap;
import java.util.Map;

public class EventProxy implements EventRuleDB {

    EventRuleDB eventRuleDB;

    public static final Map<Integer, String> CACHE = new HashMap<>();

    public EventProxy(EventRuleDB eventRuleDB) {
        this.eventRuleDB = eventRuleDB;
    }

    @Override
    public String get(int id) {
        if (CACHE.containsKey(id)) {
            System.out.println("Cache contains : " + id + " " + CACHE.get(id));
            return CACHE.get(id);
        }
        String out = eventRuleDB.get(id);
        CACHE.put(id, out);
        return out;
    }
}
