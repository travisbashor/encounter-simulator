package battleEncounterGenerator.models;

public class Weapon extends Item{
    private String name;
    private Character equiper;
    private boolean requiresTwoHands;
    private Character.WeaponProficiency weaponType;
    public Weapon(String name, Character.WeaponProficiency weaponType){
        super(name);
        this.weaponType = weaponType;
    }

    public void equipItem(Character equiper, String hand){
        // still working out how I wanna handle the unequip/equip, i.e. which step is handled by which class

        if(equiper.doesCharacterHaveProficiency(weaponType) == true){
            if(requiresTwoHands == true){
                equiper.unequip("both");
            } else if(hand == "right") {

            }
        }

    }
}
