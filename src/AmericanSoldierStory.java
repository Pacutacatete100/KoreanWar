import java.util.Scanner;

public class AmericanSoldierStory extends Story {

    public AmericanSoldierStory(Player player) {
        super();

    }
    public static void executeAmericanSoldierStory(Player player)throws InterruptedException{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Your name is Ken McMillan.\n" +
                "You are a soldier for the US Army during the Korean War\n" +
                "You are currently on a PT810 war boat, receiving information from general Douglas MacArthur:");
        Thread.sleep(1000);
        System.out.println("\"Due to lack of reconnaissance, there is a high possibility for friendly-fire. Be careful\"");
        Thread.sleep(500);
        System.out.println("\"The objective: push back the enemy and take back the land.\"");
        System.out.println("As soon as you know it, you have arrived at your destination.\n" +
                "You get off the boat and go to shore.\n" +
                "The first thing you notice is all the destruction.\n" +
                "All the destruction caused by the napalm bombs, all the destruction caused by bullets,\n" +
                "the guns, the grenades");
        System.out.println("What do you choose to do?\n" +
                "1. Stand perfectly still and admire all the destruction happening around you\n" +
                "2. Go help a fallen solder\n" +
                "3. Go farther inland");
        int soldierChoice1 = myScanner.nextInt();

        if(soldierChoice1 == 1){//if player decides to stand still
            System.out.println("As you admire the terrible destruction of the field, you feel something is off, that something is wrong\n" +
                    "Suddenly time goes so slow it seems almost as it has stopped. You can hear your heartbeat, loudly.\n" +
                    "You look around, you see soldiers fighting, ou see Mk.2 grenades being thrown, but right in front of you, is a bullet.\n" +
                    "This time, time really stops. Everything freezes, except for the bullet. You see your life flash before your eyes as you just let it happen");
            System.out.println("Press R to restart");
        }else if(soldierChoice1 == 2){//if player decides to help fallen soldier
            System.out.println("Getting off the boat, you look to your right and see a fellow soldier struggling for his life. You run to his side and try to help him.\n" +
                    "You apply a bandage to his wounded arm, right next to the american flag emblem. His name is Jack, he's your new friend");
            //TODO: continue this story line

        }else if(soldierChoice1 == 3){//if player decides to go inland
            System.out.println("You see many people fighting near the shore. You decide to go farther inland, hoping others will follow you, but no one does.\n" +
                    "As you get farther into the thick jungle of Inchon, you encounter a soldier. But he isn't a soldier, or is he? Hes too young to be a soldier, he's just a kid.\n" +
                    "You look at the young boys face, straight in the eyes, as he looks back.");
            Thread.sleep(1500);
            System.out.println("He's fearful, you can see the fear in his eyes, you can feel it in the air.");
            Thread.sleep(1000);
            System.out.println("Its out of fear that he raises his weapon, shaking.");
            Thread.sleep(1000);
            System.out.println("Its out of fear that he looks at you with remorse.");
            Thread.sleep(1000);
            System.out.println("Its out of fear that he pulls that trigger.");
            Thread.sleep(1000);
            System.out.println("You know its fear, because it's your own fear too");
            System.out.println("Press R to restart");
        }

    }
}
