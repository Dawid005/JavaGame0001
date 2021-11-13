package RPG;

public class Wizzard {

    protected int cost;
    protected int strength;
    protected int intelligence;
    protected int charisma;
    protected int gold;

    public void boost(int strength1, int intelligence1, int charisma1, int gold1){
        cost = (int) (strength1 * 0.2) + (int) (intelligence1 * 0.4) + (int) (charisma1 * 0.7);
        gold1 = gold1 - cost;
        strength1 += (int) (strength1 * 0.1);
        intelligence1 +=(int) (intelligence1 * 0.4);
        charisma1 += (int) (charisma1 * 0.35);

        strength = strength1;
        intelligence = intelligence1;
        charisma = charisma1;
        gold = gold1;
    }
    public int giveStrength(){
        return strength;
    }

    public int giveIntelligence(){
        return intelligence;
    }

    public int giveCharisma(){
        return charisma;
    }

    public int giveGold(){
        return gold;
    }
}
