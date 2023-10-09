package battleEncounterGenerator.models;

import java.util.HashMap;

public class Turn {
    //Need to flesh out the turn model but this will be used to track things like
    // whose turn it is and actions and bonus actions left in the turn
    private int actionAmount;
    private int bonusActionAmount;
    private int currentActionAmount;
    private int currentBonusActionAmount;

    public Turn(Character character){
        HashMap<String,Integer> characterTurnInfo = character.getTurnHash();
        this.actionAmount = characterTurnInfo.get("action");
        this.bonusActionAmount = characterTurnInfo.get("bonusAction");
    }

    public int getActionsLeftThisTurn(){
        return this.actionAmount;
    }
}
