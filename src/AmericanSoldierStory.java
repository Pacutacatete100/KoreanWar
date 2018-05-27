import java.util.Scanner;

public class AmericanSoldierStory extends Story {

    public AmericanSoldierStory(Player player) {
        super();

    }
    public static void executeAmericanSoldierStory(Player player)throws InterruptedException{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Your name is Noah McMillan.\n" +
                "You are a soldier for the US Army during the Korean War\n" +
                "You are currently on a PT810 war boat, receiving information from general Douglas MacArthur:");
        Thread.sleep(1000);
        System.out.println("\"Due to lack of reconnaissance, there is a high possibility for friendly-fire. Be careful\"");
        Thread.sleep(2000);
        System.out.println("\"The objective: push back the enemy and take back the land.\"");
        System.out.println("As soon as you know it, you have arrived at your destination.\n" +
                "You get off the boat and go to shore.\n" +
                "The first thing you notice is all the destruction.\n" +
                "All the destruction caused by the napalm bombs, all the destruction caused by bullets,\n" +
                "the guns, the grenades");
        Thread.sleep(1400);
        System.out.println("What do you choose to do?\n" +
                "1. Stand perfectly still and admire all the destruction happening around you\n" +
                "2. Go help a fallen solder\n" +
                "3. Go farther inland");
        int soldierChoice1 = myScanner.nextInt();

        if(soldierChoice1 == 1){//if player decides to stand still
            System.out.println("As you admire the terrible destruction of the field, you feel something is off, that something is wrong\n" +
                    "Suddenly time goes so slow it seems almost as it has stopped. You can hear your heartbeat, loudly.\n" +
                    "You look around, you see soldiers fighting, ou see Mk.2 grenades being thrown, but right in front of you, is a bullet.\n" +
                    "This time, time really stops. Everything freezes, except for the bullet. \n" +
                    "You see your life flash before your eyes as you just let it happen");
            System.out.println("Press R to restart");
        }else if(soldierChoice1 == 2){//if player decides to help fallen soldier
            System.out.println("Getting off the boat, you look to your right and see a fellow soldier struggling for his life. \n" +
                    "You run to his side and try to help him.\n" +
                    "You apply a bandage to his wounded arm, right next to the american flag emblem. \n" +
                    "His name is Jack, he's your new friend");
            Thread.sleep(1300);
            System.out.println("You start to receive orders directly from General MacArtur through your walkie-talkie:");
            Thread.sleep(1000);
            System.out.println("\"Good job everyone, objective complete. Your next destination: Seoul. \n" +
                    "Get back on your boats, Ill give you your new orders upon arrival\"");
            Thread.sleep(1500);
            System.out.println("1. Ignore General MacArthur's order and go farther inland with Jack\n" +
                    "2. Obey General MacArthur's orders and go to Seoul");
            int obeyOrIgnore = myScanner.nextInt();
            if(obeyOrIgnore == 1){//if player decides to ignore generals command
                System.out.println("You hear the Generals orders, yet, something feels wrong. \n" +
                        "You and Jack decide to ignore MacArthur's orders and go farther inland.");
                Thread.sleep(1500);
                System.out.println("As you go farther into the thick jungle, this feeling that something is wrong increases.\n" +
                        "Whacking branches and plants out of your way while crouching to keep cover, you and Jack whisper to each other each others dreams.");
                System.out.println("Jack: You know I was a baker before getting recruited?");
                Thread.sleep(2500);
                System.out.println("You: Yeah?");
                Thread.sleep(2500);
                System.out.println("Jack: Yeah. My family owns a small diner in South Dakota. I was in charge of making the bread for it.");
                Thread.sleep(2500);
                System.out.println("You: I actually worked in a restaurant too");
                Thread.sleep(2500);
                System.out.println("Jack: Really?");
                Thread.sleep(2500);
                System.out.println("You: Yeah. I wasn't a cook. Only a waiter");
                Thread.sleep(2500);
                System.out.println("Jack: Ah yes. You know its always been my dream to open up my own restaurant");
                Thread.sleep(2500);
                System.out.println("You: Its my dream too! You know after this we should open up our own restaurant after this hell finishes");
                Thread.sleep(2500);
                System.out.println("Jack: Yeah! We'd open one in Southern California, we'll serve classic American food");
                Thread.sleep(2500);
                System.out.println("You: And we can give discounts to fellow veterans too!");
                Thread.sleep(2500);
                System.out.println("Jack: Hahahaha, yeah. We'll hire the best cooks in the nation, serve the best foo-");
                Thread.sleep(2500);
                System.out.println("*click*");
                Thread.sleep(2500);
                System.out.println("You look to Jack's eyes. You both know what has happened. You both know that there is no way out alive.");
                Thread.sleep(2500);
                System.out.println("You start scrambling for a way to help Jack. You rack your brain to try to think of something");
                Thread.sleep(2500);
                System.out.println("These damned commies, why did they have to start a war? God dammit America, why'd you have to Continue it?");
                Thread.sleep(2500);
                System.out.println("You: Maybe we could- I don't know, what if- How could we- what the-");
                Thread.sleep(2500);
                System.out.println("Jack: Noah.. Noah! NOAH!");
                Thread.sleep(2500);
                System.out.println("You stop scrambling for a way to get him out of this situation. You stand up straight and look directly into Jacks eyes");
                Thread.sleep(2500);
                System.out.println("Jack: Noah, there is no way out. This is goodbye.");
                Thread.sleep(2500);
                System.out.println("You: But what about the Diner?");
                Thread.sleep(2500);
                System.out.println("Your eyes start to water up");
                Thread.sleep(2500);
                System.out.println("What about our dream? We're both too young to die here, right now");
                Thread.sleep(2500);
                System.out.println("Jack puts his hand on your shoulder.\n" +
                        "Jack: I know Noah, I know.");
                Thread.sleep(2500);
                System.out.println("His eyes also start to tear up. You both salute each other, knowing this is goodbye forever.");
                Thread.sleep(2500);
                System.out.println("Jack lifts his foot up");
                Thread.sleep(2000);
                System.out.println("*click*");
                Thread.sleep(2500);
                System.out.println("A tear runs down your face and one down Jack's, as you both smile at each other, still crying.");
                Thread.sleep(2500);
                System.out.println("Press R to restart");


            }else if(obeyOrIgnore == 2){//if player decides to obey and go to seoul

            }
            //TODO: continue this story line

        }else if(soldierChoice1 == 3){//if player decides to go inland
            System.out.println("You see many people fighting near the shore. You decide to go farther inland, hoping others will follow you, but no one does.\n" +
                    "As you get farther into the thick jungle of Inchon, you encounter a soldier. But he isn't a soldier, or is he? Hes too young to be a soldier, he's just a kid.\n" +
                    "You look at the young boys face, straight in the eyes, as he looks back.");
            Thread.sleep(1500);
            System.out.println("He's fearful, you can see the fear in his eyes, you can feel it in the air.");
            Thread.sleep(2000);
            System.out.println("Its out of fear that he raises his weapon, shaking.");
            Thread.sleep(2000);
            System.out.println("Its out of fear that he looks at you with remorse.");
            Thread.sleep(2000);
            System.out.println("Its out of fear that he pulls that trigger.");
            Thread.sleep(2000);
            System.out.println("You know its fear, because it's your own fear too");
            Thread.sleep(1500);
            System.out.println("Press R to restart");
        }

    }
}
