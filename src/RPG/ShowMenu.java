package RPG;

public class ShowMenu {
    public int costOfWizzard;

    public void show(){
        System.out.println("1. Add extra points to your character.");
        System.out.println("2.Go to work.");
        System.out.println("3.Go to Wizzard (it will cos you: " + costOfWizzard +" )");
        System.out.println("q. To quit game");
    }
}
