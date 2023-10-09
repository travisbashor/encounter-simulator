package battleEncounterGenerator.models;

public class Weapon extends Item{
    private String name;
    private boolean equipped;
    private boolean requiresTwoHands;
    private Character.WeaponProficiency weaponType;
    public Weapon(String name, Double weight, Character.WeaponProficiency weaponType){
        super(name, weight);
        this.weaponType = weaponType;
    }


}

// Does item need to know who its equiper is? Does it need to know whether or not it is equipped and  maybe which hand its equipped too (although this should also be handled by the PC class since this affects damage calculation and which will be handled
// by the PC character.
