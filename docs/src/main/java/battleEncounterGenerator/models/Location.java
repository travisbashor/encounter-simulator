package battleEncounterGenerator.models;

import java.util.ArrayList;
import java.util.List;

public class Location {
    private Inventory inventoryList;
    private String locationName;
    private String description;


    public Location(String locationName, String description){
        this.locationName = locationName;
        this.description = description;
        this.inventoryList = new Inventory(locationName,false);
    }

    public void addToInventory(Item item){
        this.inventoryList.addToInventory(item);
    }

    public void addMultipleItemsToInventory(List<Item> itemList){
        this.inventoryList.addListOfItemsToInventory(itemList);
    }
}
