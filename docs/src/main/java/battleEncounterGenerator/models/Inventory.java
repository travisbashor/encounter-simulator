package battleEncounterGenerator.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Inventory {
    private List<Item> itemList;
    private HashMap<String,Item> equippedItemList;

    public Inventory(String owner, int weightLimit, boolean isOwnerPC){
        this.owner = owner;
        this.weightLimit = weightLimit;
        this.currentWeight = 0;
        this.itemList = new ArrayList<>();
        if(isOwnerPC){
            this.equippedItemList = new HashMap<>();
        }
    }

    public Inventory(String owner,  boolean isOwnerPC){
        this.owner = owner;
        this.weightLimit = 200;
        this.currentWeight = 0;
        this.itemList = new ArrayList<>();
        if(isOwnerPC){
            this.equippedItemList = new HashMap<>();
        }
    }
    private String owner;
    private int weightLimit;
    private int currentWeight;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(int weightLimit) {
        this.weightLimit = weightLimit;
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public void setCurrentWeight(int currentWeight) {
        this.currentWeight = currentWeight;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public void addToInventory(Item item){
        this.itemList.add(item);
    }

    public void removeFromInventory(Item item){
        if(itemList.contains(item)){
            this.itemList.remove(item);
        } else {
            System.out.println("Item not present in target inventory. Item not removed from inventory");
        }
    }

    public HashMap<String, Item> getEquippedItemList() {
        return equippedItemList;
    }

    public void setEquippedItemList(HashMap<String, Item> equippedItemList) {
        this.equippedItemList = equippedItemList;
    }

    //since certain applications of this method might allwo for a list with null in it, we check for null before
    //inserting into inventory
    public void addListOfItemsToInventory(List<Item> itemList){
        for(Item item: itemList){
            if(item != null){
                this.itemList.add(item);
            }
        }
    }


}
