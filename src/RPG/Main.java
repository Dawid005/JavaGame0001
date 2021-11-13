package RPG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int game = 10;
        boolean god = false;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome in my Game.");
        System.out.println("You need to earn as much money as You can.");
        System.out.println("(Press Enter to continue)");
        String actionGod = myObj.nextLine();  // Read user input
        Warrior player = new Warrior(10, 20, 15, "Dawid");
        final String GODMODE = "GODMODE";
        while(game>0){
            String action = "";

            if(actionGod.equals(GODMODE)){
                ShowMenu show = new ShowMenu();
                show.costOfWizzard = (int) (player.strength * 0.2) + (int) (player.intelligence * 0.4) +
                        (int) (player.charisma * 0.7);
                show.show();
                System.out.println("You have: " + game + " move");
                player.show();
                System.out.println("Give me command: ");
                action = myObj.nextLine();
                switch(action){
                    case "1":
                        player.boost();
                        player.show();
                        show.costOfWizzard = (int) (player.strength * 0.2) + (int) (player.intelligence * 0.4) +
                                (int) (player.charisma * 0.7);
                        break;
                    case "2":
                        player.goToWork();
                        player.show();

                        break;
                    case "3":
                        player.goToWizzard();
                        show.costOfWizzard = (int) (player.strength * 0.2) + (int) (player.intelligence * 0.4) +
                                (int) (player.charisma * 0.7);
                        player.show();
                        break;
                    case "q":
                        game = 0;
                        break;
                }
                if(player.Move ==true){
                    game = game -1;
                }
            }

            else{
                ShowNormalMenu show = new ShowNormalMenu();
                show.costOfWizzard = (int) (player.strength * 0.2) + (int) (player.intelligence * 0.4) +
                        (int) (player.charisma * 0.7);
                show.show();
                System.out.println("You have: " + game + " move");
                player.show();
                System.out.println("Give me command: ");
                action = myObj.nextLine();
                switch(action){
                    case "1":
                        player.goToWork();
                        player.show();
                        break;
                    case "2":
                        player.goToWizzard();
                        show.costOfWizzard = (int) (player.strength * 0.2) + (int) (player.intelligence * 0.4) +
                                (int) (player.charisma * 0.7);
                        player.show();
                        break;
                    case "q":
                        game = 0;
                        break;
                }
                if(player.Move ==true){
                    game = game -1;
                }
            }

        }
        System.out.println("Congratulation!");
        System.out.println("You end this game with score: "+ player.gold);
    }

}