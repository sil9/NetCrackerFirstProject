package com.netcracker.homework2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class EntityListOperation implements ListOperation<Entity> {

    @Override
    public void deleteByMaxField(List<Entity> list) {
        int[] maxValue = {Integer.MIN_VALUE};
        for (Entity entity : list) {
            if (entity.getValue() > maxValue[0]) {
                maxValue[0] = entity.getValue();
            }
        }
        list.removeIf(entity -> entity.getValue() == maxValue[0]);
    }

    @Override
    public void deleteByMinField(List<Entity> list) {
        int[] minValue = {Integer.MAX_VALUE};
        for (Entity entity : list) {
            if (entity.getValue() < minValue[0]) {
                minValue[0] = entity.getValue();
            }
        }
        list.removeIf(entity -> entity.getValue() == minValue[0]);
    }

    @Override
    public void deleteByValue(List<Entity> list, int value) {
        list.removeIf(entity -> entity.getValue() == 3);
    }

    @Override
    public long calculateSum(List<Entity> list) {
        long sum = 0;
        for (Entity entity : list) {
            sum += entity.getValue();
        }
        return sum;
    }

    @Override
    public Entity getThird(List<Entity> list) {
        return list.get(2);
    }

    @Override
    public List<Entity> getTwoFromSecond(List<Entity> list) {
        List<Entity> returnedList = new ArrayList<>();
        returnedList.add(list.get(1));
        returnedList.add(list.get(2));
        return returnedList;
    }

    @Override
    public List<Entity> getAllByTemplate(List<Entity> list) {
        List<Entity> entities = new ArrayList<>();
        for (Entity entity : list) {
            if (entity.getName().length() <= 5) {
                entities.add(entity);
            }
        }
        return entities;
    }

    @Override
    public boolean findSymbolInAllItems(List<Entity> list, Character character) {
        for (Entity entity : list) {
            if (entity.getName().indexOf(character) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void addSymbolToName(List<Entity> list) {
        for (Entity entity : list) {
            entity.setName(entity.getName() + "_1");
        }
    }

    @Override
    public void sorted(List<Entity> list) {
        list.sort(Comparator.comparing(Entity::getName));
        list.sort(Comparator.comparing(Entity::getValue));
    }
}
