package battleEncounterGenerator.models;

import java.util.ArrayList;
import java.util.List;


public class Encounter {
    private List<Character> npcList;
    private List<Character> pcList;
    private List<Location> locationList;
    private List<Turn> turnList;
    private int roundTracker;
    private List<Character> characterTurnList;

    public Encounter(){
        this.npcList = new ArrayList<>();
        this.pcList = new ArrayList<>();
        this.locationList = new ArrayList<>();
        this.turnList = new ArrayList<>();
        this.roundTracker = 0; // maybe we'll make this 1 instead of 0
    }

}
