package com.netcracker.homework2;


import java.util.List;
import java.util.Map;

public interface MapOperation<K, V> {

    void deleteByMaxField(Map<K, V> map);

    void deleteByMinField(Map<K, V> map);

    void deleteByValue(Map<K, V> map, int value);

    long calculateSum(Map<K, V> map);

    V getThird(Map<K, V> map);

    List<V> getTwoFromSecond(Map<K, V> map);

    List<V> getAllByTemplate(Map<K, V> map);

    boolean findSymbolInAllItems(Map<K, V> map, Character character);

    Map<String, Entity> sorted(Map<K, V> map);
}
