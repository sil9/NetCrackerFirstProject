package com.netcracker.homework2;


import java.util.List;

public interface ListOperation<T> {

    void maximumDelete(List<T> list);

    void deleteByValue(List<T> list, int value);

    long calculateSum(List<T> list);

    T getThird(List<T> list);

    List<T> getTwoFromSecond(List<T> list);

    List<T> getAllByTemplate(List<T> list);

    boolean findSymbolInAllItems(List<T> list, Character character);

    void addSymbolToName(List<T> list);

    void sorted(List<T> list);
}
