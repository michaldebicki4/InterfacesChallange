package com.company;

import java.util.ArrayList;
import java.util.List;

public class MOnster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strenght;

    public MOnster(String name, int hitPoints, int strenght) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strenght = strenght;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrenght() {
        return strenght;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strenght);


        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0) {
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strenght = Integer.parseInt(savedValues.get(2));
        }

    }

    @Override
    public String toString() {
        return "MOnster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strenght=" + strenght +
                '}';
    }
}
