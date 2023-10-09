package battleEncounterGenerator;

import battleEncounterGenerator.models.Character;
import battleEncounterGenerator.models.Weapon;

import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        System.out.println("Application is running1");

        Weapon sword = new Weapon("sword", 2.0, Character.WeaponProficiency.SHORTSWORD);
        System.out.println(sword.getName());

        System.out.println(sword.getDescription());
        System.out.println(Double.valueOf(sword.getWeight()));
        Character aug = new Character("Auguccius");
        aug.setStat("CHA",18);
        System.out.println("Character's new stat is " + Integer.valueOf(aug.getStat("CHA")));
    }
}
