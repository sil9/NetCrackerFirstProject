package com.netcracker.homework2;


import java.util.*;

public class EntityMapOperation implements MapOperation<String, Entity> {

    @Override
    public void deleteByMaxField(Map<String, Entity> map) {
        int[] maxValue = {Integer.MIN_VALUE};
        for (Map.Entry<String, Entity> entity : map.entrySet()) {
            if (entity.getValue().getValue() > maxValue[0]) {
                maxValue[0] = entity.getValue().getValue();
            }
        }
        map.entrySet().removeIf(entry -> entry.getValue().getValue() == maxValue[0]);
    }

    @Override
    public void deleteByMinField(Map<String, Entity> map) {
        int[] minValue = {Integer.MAX_VALUE};
        for (Map.Entry<String, Entity> entity : map.entrySet()) {
            if (entity.getValue().getValue() < minValue[0]) {
                minValue[0] = entity.getValue().getValue();
            }
        }
        map.entrySet().removeIf(entry -> entry.getValue().getValue() == minValue[0]);
    }

    @Override
    public void deleteByValue(Map<String, Entity> map, int value) {
        map.entrySet().removeIf(entry -> entry.getValue().getValue() > value);
    }

    @Override
    public long calculateSum(Map<String, Entity> map) {
        long sum = 0;
        for (Map.Entry<String, Entity> entry : map.entrySet()) {
            sum += entry.getValue().getValue();
        }
        return sum;
    }

    @Override
    public Entity getThird(Map<String, Entity> map) {
        Entity entity = null;
        int i = 0;
        for (Map.Entry<String, Entity> entry : map.entrySet()) {
            if (i == 2) {
                entity = map.get(entry.getKey());
                break;
            }
            i++;
        }
        return entity;
    }

    @Override
    public List<Entity> getTwoFromSecond(Map<String, Entity> map) {
        List<Entity> entities = new ArrayList<>();
        int i = 0;
        for (Map.Entry<String, Entity> entry : map.entrySet()) {
            if (i == 1 || i == 2) {
                entities.add(entry.getValue());
                if (i == 2) {
                    break;
                }
            }
            i++;
        }
        return entities;
    }

    @Override
    public List<Entity> getAllByTemplate(Map<String, Entity> map) {
        List<Entity> entities = new ArrayList<>();
        for (Map.Entry<String, Entity> entry : map.entrySet()) {
            if (entry.getValue().getName().length() <= 5) {
                entities.add(map.get(entry.getKey()));
            }
        }
        return entities;
    }

    @Override
    public boolean findSymbolInAllItems(Map<String, Entity> map, Character character) {
        for (Map.Entry<String, Entity> entry : map.entrySet()) {
            if (!entry.getValue().getName().contains(character.toString())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public Map<String, Entity> sorted(Map<String, Entity> map) {
        List<Map.Entry<String, Entity>> list = new LinkedList<>(map.entrySet());
        list.sort(Comparator.comparing(o -> o.getValue().getName()));
        list.sort(Comparator.comparing(o -> o.getValue().getValue()));
        Map<String, Entity> result = new LinkedHashMap<>();
        for (Map.Entry<String, Entity> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
