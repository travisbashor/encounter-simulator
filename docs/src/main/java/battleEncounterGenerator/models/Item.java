package battleEncounterGenerator.models;

import java.util.HashMap;

public class Item {
    private String name;
    private String description;
    private double weight;
    private double value;
    private Character owner;
    private int quantity;
    private HashMap<String, Integer> rollModifier;
    private HashMap<String,Integer> statModifier;

    public Item(String name, Double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getWeight() {
        return weight;
    }



    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Character getOwner() {
        return owner;
    }

    public void setOwner(Character owner) {
        this.owner = owner;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
