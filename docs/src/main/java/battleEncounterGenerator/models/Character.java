package battleEncounterGenerator.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    private String name;
    private String race;
    //do we need a model dedicated solely to race?
    private int level;
    private int health;
    private Item leftHandEquipment;
    private Item rightHandEquipment;
    private ArrayList<String> feats;
    public ArrayList<Character> party;
    private HashMap<String,Integer> stats;
    private HashMap<String,Integer> tempStats;
    private ArrayList<Character.WeaponProficiency> weaponProficiencies;

//what is the best practice when it comes to overloading the class constructor? i.e. should we have a class constructor for each combination of class attribute?
    public Character(String name){
        this.name = name;
        this.health = 10;
        this.stats = new HashMap<>();
        this.stats.put("STR",10);
        this.stats.put("DEX",10);
        this.stats.put("CON",10);
        this.stats.put("INT",10);
        this.stats.put("WIS",10);
        this.stats.put("CHA",10);
        this.tempStats = this.stats;
        this.leftHandEquipment = null;
        this.rightHandEquipment = null;
    }

    public enum WeaponProficiency{
        CLUB,
        DAGGER,
        GREATCLUB,
        HANDAXE,
        JAVELIN,
        LIGHT_HAMMER,
        MACE,
        QUARTERSTAFF,
        SICKLE,
        SPEAR,
        CROSSBOW_LIGHT,
        DART,
        SHORTBOW,
        SLING,
        BATTLEAXE,
        FLAIL,
        GLAIVE,
        GREATAXE,
        GREATSWORD,
        HALBERD,
        LANCE,
        LONGSWORD,
        MAUL,
        MORNINGSTAR,
        PIKE,
        RAPIER,
        SCIMITAR,
        SHORTSWORD,
        TRIDENT,
        WAR_PICK,
        WARHAMMER,
        WHIP,
        BLOWGUN,
        CROSSBOW_HAND,
        CROSSBOW_HEAVY,
        LONGBOW,
        NET
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName(){
        return name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public ArrayList<String> getFeats() {
        return feats;
    }

    public void setFeats(ArrayList<String> feats) {
        this.feats = feats;
    }

    public ArrayList<Character> getParty() {
        return party;
    }

    public void setParty(ArrayList<Character> party) {
        this.party = party;
    }

    public HashMap<String, Integer> getStats() {
        return stats;
    }

    public void setStats(HashMap<String, Integer> stats) {
        this.stats = stats;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStat(String key, int newValue){
            this.stats.replace(key,newValue);
    }

    public int getStat(String key){
        return this.stats.get(key);
    }

    public int getTempStat(String key){
        return this.tempStats.get(key);
    }

    public void changeTempStat(String key, int newValue){
        int newTempValue = this.tempStats.get(key) + newValue;
        this.tempStats.replace(key,newTempValue);
    }

    public void addProficiency(Character.WeaponProficiency weaponProficiency){
        this.weaponProficiencies.add(weaponProficiency);
    }

    public void setLeftHandEquipment(Item item){
        this.leftHandEquipment = item;
    }

    public void setRightHandEquipment(Item item){
        this.rightHandEquipment = item;
    }
    public Item getLeftHandEquipStatus(){
        return this.leftHandEquipment;
    }

    public Item getRightHandEquipment(){
        return this.rightHandEquipment;
    }

    public boolean doesCharacterHaveProficiency(WeaponProficiency weaponProficiency){
        return weaponProficiencies.contains(weaponProficiency);
    }

    public void unequip(String hand){
        if(hand == "right"){
            this.rightHandEquipment = null;
        } else if(hand == "left"){
            this.leftHandEquipment = null;
        } else {
            this.rightHandEquipment = null;
            this.leftHandEquipment = null;
        }
    }
}
