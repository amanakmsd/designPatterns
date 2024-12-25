package com.learning.designPatterns.creationalDP.prototypeAndRegistery.registery;

public interface Registery<K,V> {
    void save(K key, V value);
    V get(K key);
}
