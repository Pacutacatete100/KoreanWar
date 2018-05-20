import java.util.Scanner;

public class AmericanSoldierStory extends Story {

    public AmericanSoldierStory(Player player) {
        super();

    }
    public static void executeAmericanSoldierStory(Player player)throws InterruptedException{
        System.out.println("Your name is Ken McMillan.\n" +
                "You are a soldier for the US Army during the Korean War\n" +
                "You are currently on a PT810 war boat, receiving information from general Douglas MacArthur:");
        Thread.sleep(1000);
        System.out.println("\"Due to lack of reconnaissance, there is a high possibility for friendly-fire\"");
        Thread.sleep(500);
        System.out.println("\"The objective: push back the enemy and take back the land.\"");
        System.out.println("As soon as you know it, you have arrived at your destination.\n" +
                "You get off the boat and go to shore.\n" +
                "The first thing you notice is all the destuction.");
        //TODO: continue this story line
    }
}
