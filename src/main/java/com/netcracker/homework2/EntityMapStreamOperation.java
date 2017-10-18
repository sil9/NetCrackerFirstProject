package com.netcracker.homework2;


import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EntityMapStreamOperation implements MapOperation<String, Entity> {

    @Override
    public void deleteByMaxField(Map<String, Entity> map) {
        int num = map.entrySet().stream()
                .mapToInt(entry -> entry.getValue().getValue())
                .max()
                .getAsInt();
        map.entrySet().removeIf(entry -> entry.getValue().getValue() == num);
    }

    @Override
    public void deleteByMinField(Map<String, Entity> map) {
        int num = map.entrySet().stream()
                .mapToInt(entry -> entry.getValue().getValue())
                .min()
                .getAsInt();
        map.entrySet().removeIf(entry -> entry.getValue().getValue() == num);
    }

    @Override
    public void deleteByValue(Map<String, Entity> map, int value) {
        map.entrySet().removeIf(entry -> entry.getValue().getValue() > value);
    }

    @Override
    public long calculateSum(Map<String, Entity> map) {
        return map.entrySet().stream()
                .mapToInt(entry -> entry.getValue().getValue())
                .sum();
    }

    @Override
    public Entity getThird(Map<String, Entity> map) {
        return map.entrySet().stream()
                .skip(2)
                .findFirst()
                .orElse(null)
                .getValue();

    }

    @Override
    public List<Entity> getTwoFromSecond(Map<String, Entity> map) {
        return map.entrySet().stream()
                .skip(1)
                .limit(2)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    @Override
    public List<Entity> getAllByTemplate(Map<String, Entity> map) {
        return map.entrySet().stream()
                .filter(entry -> entry.getValue().getName().length() <= 5)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

    }

    @Override
    public boolean findSymbolInAllItems(Map<String, Entity> map, Character character) {
        return map.entrySet().stream()
                .allMatch(entry -> entry.getValue().getName().contains(character.toString()));
    }

    @Override
    public Map<String, Entity> sorted(Map<String, Entity> map) {
        Map<String, Entity> result = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Comparator.comparing(entry -> entry.getValue().getName()))
                .sorted(Comparator.comparing(entry -> entry.getValue().getValue()))
                .forEach(entry -> result.put(entry.getKey(), entry.getValue()));
        return result;
    }
}
