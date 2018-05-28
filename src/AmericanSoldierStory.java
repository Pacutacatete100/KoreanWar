import java.util.Scanner;

public class AmericanSoldierStory extends Story {

    public AmericanSoldierStory(Player player) {
        super();

    }
    public static void executeAmericanSoldierStory(Player player)throws InterruptedException{
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Your name is Noah McMillan.");
        System.out.println("You are a soldier for the US Army during the Korean War");
        Thread.sleep(2500);
        System.out.println("It was September 15, 1950. Start of operation Chromite, or the Battle of Inchon.");
        Thread.sleep(2500);
        System.out.println("You are currently on a PT810 war boat, receiving information from general Douglas MacArthur:");
        Thread.sleep(2500);
        System.out.println("\"Due to lack of reconnaissance, there is a high possibility for friendly-fire. Be careful\"");
        Thread.sleep(2500);
        System.out.println("\"The objective: push back the enemy and take back the land.\"");
        Thread.sleep(2500);
        System.out.println("As soon as you know it, you have arrived at your destination.");
        Thread.sleep(2500);
        System.out.println("You get off the boat and go to shore.");
        Thread.sleep(2500);
        System.out.println("The first thing you notice is all the destruction.");
        Thread.sleep(3500);
        System.out.println("The planes passing above you");
        ACIIArt.planes();
        Thread.sleep(800);
        System.out.println("\n\n");
        ACIIArt.planes();
        Thread.sleep(800);
        System.out.println("\n\n");
        ACIIArt.planes();
        Thread.sleep(800);
        System.out.println("\n\n");
        Thread.sleep(1800);
        System.out.println("All the destruction caused by the napalm bombs, all the destruction caused by bullets,\n" +
                "the guns, the grenades");
        Thread.sleep(2500);
        System.out.println("What do you choose to do?\n" +
                "1. Stand perfectly still and admire all the destruction happening around you\n" +
                "2. Go help a fallen solder\n" +
                "3. Go farther inland");
        int soldierChoice1 = myScanner.nextInt();

        if(soldierChoice1 == 1){//if player decides to stand still
            System.out.println("As you admire the terrible destruction of the field, you feel something is off, that something is wrong.");
            Thread.sleep(2500);;
            System.out.println("Suddenly time goes so slow it seems almost as it has stopped. You can hear your heartbeat, loudly.");
            Thread.sleep(2500);
            System.out.println("You look around, you see soldiers fighting, ou see Mk.2 grenades being thrown, but right in front of you, is a 7.62 mm bullet from an M1 carbine.");
            Thread.sleep(2500);
            System.out.println("This time, time really stops. Everything freezes, except for the bullet. ");
            Thread.sleep(2500);
            System.out.println("You see your life flash before your eyes as you just let it happen");
            Thread.sleep(3000);
            System.out.println("Press R to restart");
        }else if(soldierChoice1 == 2){//if player decides to help fallen soldier
            System.out.println("Getting off the boat, you look to your right and see a fellow soldier struggling for his life. \n" +
                    "You run to his side and try to help him.\n" +
                    "You apply a bandage to his wounded arm, right next to the american flag emblem. \n" +
                    "His name is Jack, he's your new friend");
            Thread.sleep(2300);
            System.out.println("You start to receive orders directly from General MacArtur through your walkie-talkie:");
            Thread.sleep(1000);
            System.out.println("\"Good job everyone, objective complete. Your next destination: Seoul. \n" +
                    "Get back on your boats, Ill give you your new orders upon arrival\"");
            Thread.sleep(2500);
            System.out.println("1. Ignore General MacArthur's order and go farther inland with Jack\n" +
                    "2. Obey General MacArthur's orders and go to Seoul");
            int obeyOrIgnore = myScanner.nextInt();
            if(obeyOrIgnore == 1){//if player decides to ignore generals command
                System.out.println("You hear the Generals orders, yet, something feels wrong. \n" +
                        "You and Jack decide to ignore MacArthur's orders and go farther inland.");
                Thread.sleep(2500);
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
                System.out.println("You: Its my dream too! You know after this hell is over we should open up our own restaurant");
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
                System.out.println("These damned commies, why did they have to start a war? God dammit America, why'd you have to continue it?");
                Thread.sleep(2500);
                System.out.println("You: Maybe we could- I don't know, what if- How could we- what the-");
                Thread.sleep(2500);
                System.out.println("Jack: Noah.. Noah! NOAH!");
                Thread.sleep(2700);
                System.out.println("You stop scrambling for a way to get him out of this situation. \n" +
                        "You stand up straight and look directly into Jacks eyes");
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
                Thread.sleep(2600);
                System.out.println("His eyes also start to tear up. You both salute each other, knowing this is goodbye forever.");
                Thread.sleep(2500);
                System.out.println("Jack lifts his foot up");
                Thread.sleep(2000);
                System.out.println("*click*");
                Thread.sleep(2500);
                System.out.println("A tear runs down your face and one down Jack's.");
                Thread.sleep(2500);
                System.out.println("Press R to restart");


            }else if(obeyOrIgnore == 2){//if player decides to obey and go to seoul
                System.out.println("You obviously obey General MacArthur's orders and go back to the boat to go to Seoul.");
                Thread.sleep(3000);
                System.out.println("You get to Seoul and receive your first orders.");
                Thread.sleep(2400);
                System.out.println("General MacArthur: \"The Seventh Infantry Division will go to Gangnam-gu, fight off the communists there.\"");
                Thread.sleep(2300);
                System.out.println("\"Do your best, I promised Syngman Rhee you would. Obliterate the NKPA\"");
                Thread.sleep(2800);
                System.out.println("Once you get there, you see the communists coming in with T-34 tanks from the opposite side.");
                Thread.sleep(2500);
                ACIIArt.tanks();
                Thread.sleep(1600);
                ACIIArt.tanks();
                Thread.sleep(1600);
                ACIIArt.tanks();
                Thread.sleep(2000);
                System.out.println("There are still people in the market, most of them fleeing for their lives, \n" +
                        "yet there are a couple of people who don't move.");
                Thread.sleep(2500);
                System.out.println("What do you do?\n" +
                        "1. Go help one of the people standing still\n" +
                        "2. Go fight against the enemy");
                int helpOrFight = myScanner.nextInt();
                if(helpOrFight == 1){//if player decides to help a civilian
                    System.out.println("You see a young woman dressed in a yellow flannel shirt, she stands still literally in the middle of everything.");
                    Thread.sleep(2500);
                    System.out.println("You decide to go help her.");
                    Thread.sleep(1700);
                    System.out.println("You run towards her, evading all attacks coming directly at you. As soon as you get to her, you sweep her off her feet.");
                    Thread.sleep(2500);
                    System.out.println("You try to run her to safety. As your'e running to the safe space you spotted earlier, you start to feel a sharp pain");
                    Thread.sleep(2500);
                    System.out.println("You look down to your side, only to see it bleeding. You've been shot.");
                    Thread.sleep(2500);
                    System.out.println("You start to feel light headed, you drop the lady on the ground as you fall to the floor. \n" +
                            "You faint for a quick second, but you quickly recover");
                    Thread.sleep(2500);
                    System.out.println("The lady you tried to help is now trying to help you. Shes scrambling for things in her bag, shes looking for first aids around her\n" +
                            "but you know its useless.");
                    Thread.sleep(2500);
                    System.out.println("As you slowly start to fade away, you start crying. Crying over dreams that will never come true.");
                    Thread.sleep(2500);
                    System.out.println("Families that will never be the same");
                    Thread.sleep(2500);
                    System.out.println("This world, that will be forever changed....");
                    Thread.sleep(2800);
                    System.out.println("Press R to restart");
                }else if(helpOrFight == 2){//if player decides to fight
                    System.out.println("You look at what comes ahead. It is clear that you will not go back home. You look at Jack, you salute each other. \n" +
                            "You know this is goodbye.");
                    Thread.sleep(2500);
                    System.out.println("You run into battle, determined to maybe make this world a tiny bit better. As you run into battle you feel something.\n" +
                            "Something you haven't felt in a long time. Alleviation. This feeling, it brings you freedom from the burden that is war.");
                    Thread.sleep(2500);
                    System.out.println("You disappear into the heat of the battle, gun raised, screaming at the top of your lungs, fulfilling your duty as a soldier.");
                    Thread.sleep(2400);
                    System.out.println("\"The soldier above all others prays for peace,");
                    Thread.sleep(1300);
                    System.out.println("for it is the soldier who must suffer and bear the deepest wounds and scars of war\"");
                    Thread.sleep(2500);
                    System.out.println("-Douglas MacArthur");
                    System.out.println("-------------------END--------------------");
                }
            }

        }else if(soldierChoice1 == 3){//if player decides to go inland
            System.out.println("You see many people fighting near the shore. You decide to go farther inland, hoping others will follow you, \n" +
                    "but no one does.\n" +
                    "As you get farther into the thick jungle of Inchon, you encounter a soldier. \n" +
                    "But he isn't a soldier, or is he? Hes too young to be a soldier, he's just a kid.\n" +
                    "You look at the young boys face, straight in the eyes, as he looks back.");
            Thread.sleep(2500);
            System.out.println("He's fearful, you can see the fear in his eyes, you can feel it in the air.");
            Thread.sleep(2000);
            System.out.println("Its out of fear that he raises his weapon, shaking.");
            Thread.sleep(2000);
            System.out.println("Its out of fear that he looks at you with remorse.");
            Thread.sleep(2000);
            System.out.println("Its out of fear that he pulls that trigger.");
            Thread.sleep(2000);
            System.out.println("You know its fear, because it's your own fear too");
            Thread.sleep(2500);
            System.out.println("Press R to restart");
        }

    }
}
