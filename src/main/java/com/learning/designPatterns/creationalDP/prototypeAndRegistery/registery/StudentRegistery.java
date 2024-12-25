package com.learning.designPatterns.creationalDP.prototypeAndRegistery.registery;

import com.learning.designPatterns.creationalDP.prototypeAndRegistery.model.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistery implements Registery<String, Student> {
    public static final Map<String, Student> map = new HashMap<>();
    @Override
    public void save(String key, Student value) {
        map.put(key, value);

    }

    @Override
    public Student get(String key) {
        return map.get(key);
    }
}
