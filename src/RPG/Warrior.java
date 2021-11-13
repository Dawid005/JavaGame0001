package RPG;

public class Warrior {

    protected String name;
    protected int strength;
    protected int intelligence;
    protected int charisma;
    protected int gold;
    protected Boolean Move = false;

    public Warrior(int strength1, int intelligence1, int charisma1, String name1){
        strength = strength1;
        intelligence = intelligence1;
        charisma = charisma1;
        name = name1;
        gold = 0;
    }

    public void show(){
        System.out.println("Name of this warrior is: "+ name);
        System.out.println();
        System.out.println("Strenth: " + strength);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
        System.out.println("Gold: " + gold);
    }

    public void boost(){
        strength = strength+5;
        intelligence = intelligence+5;
        charisma = charisma +5;
        Move = true;
    }

    public void goToWork(){
        gold = gold + (strength *2 + intelligence*3 + charisma* 4);
        Move = true;
    }

    public void goToWizzard(){

        if(gold > 0) {
            Wizzard wizzard = new Wizzard();
            wizzard.boost(strength, intelligence, charisma, gold);

            strength = wizzard.strength;
            intelligence = wizzard.intelligence;
            charisma = wizzard.charisma;
            gold = wizzard.gold;
            Move = true;
        }
        else{
            Move = false;
        }
    }
}
