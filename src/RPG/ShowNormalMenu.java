package RPG;

public class ShowNormalMenu {
    public int costOfWizzard;

    public void show(){
        System.out.println("1. Go to work");
        System.out.println("2. Go to Wizzard (it will cos you: " + costOfWizzard +" )");
        System.out.println("q. To quit game");
    }
}