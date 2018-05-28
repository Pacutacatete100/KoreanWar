import java.util.Scanner;

public class KoreanCivilianStory extends Story {

    public KoreanCivilianStory(Player player) {
        super();

    }
    public void executeKoreanCivilanStory(Player player) throws InterruptedException {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Your name is Ji Yeon, \n" +
                "you are a high school teacher in rural areas of South Korea during the Korean War.");
        Thread.sleep(2500);
        System.out.println("You arrive to school one day and you notice that multiple students are missing.");
        Thread.sleep(2500);
        System.out.println("You hear many fighter jets coming.\n" +
                "1. Go outside to see what's happening\n" +
                "2. Flee to Seoul out of fear of getting caught in a crossfire");
        int fieldOrFlee = myScanner.nextInt();
        if(fieldOrFlee == 1){//if player decides to go into the fields
            System.out.println("You and the little students that are left in your class go out into the surrounding\n" +
                    "fields to check whats happening. You look up and see a bomber plane.\n" +
                    "You feel relieved but somehow also feel like something is wrong. \n" +
                    "You see the bomb compartment open up...");
            Thread.sleep(3000);
            ACIIArt.bombsAway();
            Thread.sleep(1700);
            System.out.println("Another one...");
            ACIIArt.bombsAway();
            Thread.sleep(1700);
            System.out.println("And another one...");
            ACIIArt.bombsAway();
            Thread.sleep(2700);
            System.out.println("The next thing you know you're waking up from being unconscious.");
            Thread.sleep(2500);
            System.out.println("You open your eyes and see the planes passing above you. You notice something peculiar.");
            Thread.sleep(1000);
            ACIIArt.planes();
            System.out.println("\n\n\n");
            Thread.sleep(1000);
            ACIIArt.planes();
            System.out.println("\n\n\n");
            Thread.sleep(1000);
            ACIIArt.planes();
            System.out.println("\n\n\n");
            Thread.sleep(1700);
            System.out.println("The planes that dropped the bombs, they're a F-51D Mustangs, they're American planes!!");
            Thread.sleep(2500);
            System.out.println("As your life force slowly fades away, you ask yourself, why? Why would the Americans do this?\n" +
                    "Why would the Americans bomb their own allies? What will happen to Hanguk?(Korea)");
            Thread.sleep(2800);
            System.out.println("You breathe your last breath, you close your eyes, to never open them again");
            System.out.println("Press R to restart");

        }else if(fieldOrFlee == 2){//if player decides to flee to seoul
            System.out.println("You decide to flee to Seoul, afraid of being caught in the crossfire.\n" +
                    "On the train on your way there, you see american and South Korean soldiers \n" +
                    "10 meters away from russian and North Korean soldiers, \n" +
                    "not fighting but mourning fellow fallen soldiers.");
            Thread.sleep(2500);
            System.out.println("This really hits you, it shows that this war, like all wars are tragic");
            Thread.sleep(1000);
            System.out.println("That there is never really a winner. Everyone comes out losing something.");
            Thread.sleep(1700);
            System.out.println("Your cousin that went to fight, KIA. Your mom, caught in a friendly fire while shopping.\n" +
                    "Your brother, lost his leg when debris hit him after a bombing in Seoul.");
            Thread.sleep(1700);
            System.out.println("You look back at the soldiers of opposite sides mourning.");
            Thread.sleep(1700);
            System.out.println("God damn these Russians, abusing our land like a dog, these damn Americans, bombing their own allies.\n" +
                    "Why God? Why??");
            Thread.sleep(1700);
            System.out.println("As your eyes fill up with tears, you arrive at Seoul. \n" +
                    "You get off the train and find a taxi to take to your aunts place");
            Thread.sleep(1700);
            System.out.println("While driving there, you see destruction. So much destruction. \n" +
                    "It hits you, What if my aunts place has been destroyed? What if shes dead? Where do I go?");
            Thread.sleep(2400);
            System.out.println("You panic for the rest of the trip, but as soon as you get there, your panic ends.\n" +
                    "Your aunts place is fine, at least it looks fine.");
            Thread.sleep(1700);
            System.out.println("You enter through the door and the first thing you notice is the shrine of your cousin your aunt has put up\n" +
                    "You also notice that your aunt is there praying. You dont say anything and let her finish her payers...");
            Thread.sleep(2500);
            System.out.println("Her: Ah Ji Yeon, you came!");
            Thread.sleep(1700);
            System.out.println("You: Yes! So glad to see you but, what happened to your place?");
            Thread.sleep(1700);
            System.out.println("You look around the room, you notice there are cracks in the walls and ceilings\n" +
                    "broken pictures of your family, broken plates, pots and glasses.");
            Thread.sleep(1700);
            System.out.println("\"I see you've noticed all the recent damage to the place. There was an attack 2 days ago.");
            Thread.sleep(2600);
            System.out.println("The bombs dropped not even 5 blocks away. Thank god they were small bombs or this place would have been destroyed\"");
            Thread.sleep(2700);
            System.out.println("\"Sweetie, do you mind going and getting some ingredients for lunch please?\"");
            Thread.sleep(1700);
            System.out.println("1. Decline to rest\n" +
                    "2. Accept and go into town");
            int acceptOrDecline = myScanner.nextInt();
            if(acceptOrDecline == 1){//if user declines to go shopping
                System.out.println("Sorry auntie, its been a long day, rather just stay here and rest");
                Thread.sleep(1300);
                System.out.println("That's ok, I'll go later then");
            }else if(acceptOrDecline == 2){//if user accepts to go shopping
                System.out.println("Sure thing auntie, what do you need?");
                Thread.sleep(2500);
                System.out.println("\"2 candles, 10 grams or turmeric, 2 pineapples and a lighter\"");
                Thread.sleep(1600);
                System.out.println("Ok sounds good, I'll go right now.");
                Thread.sleep(2900);
                System.out.println("You arrive at the market, and you remember what your aunt said");
                Thread.sleep(2500);
                System.out.println("\"2 candles...\" What would she need that for? she has light at her place.");
                Thread.sleep(1400);
                System.out.println("It must be for your cousins shrine...");
                Thread.sleep(2000);
                System.out.println("You get everything your auntie asked for, plus some chocolate for yourself");
                Thread.sleep(1600);
                System.out.println("NO PLEASE I SWEAR, I'M NOT A COMMIE, NO PLEASE, I'M TELLING YOU YOU HAVE THE WRONG GUY, HEEEEEELLPP");
                Thread.sleep(2500);
                System.out.println("You see 2 South Korean soldiers arresting a person because he has been accused of being a commie.");
                Thread.sleep(1300);
                System.out.println("If he is telling the truth, then he has been framed. \n" +
                        "Framing your competition, people you don't like or just plain enemies has become a common tactic to eliminate them.");
                Thread.sleep(1300);
                System.out.println("Since the South Korean government is so paranoid against communist and spies,\n" +
                        "they will take almost any accusation seriously, \n" +
                        "and it will lead to the imprisonment or even execution of the framed person.");
                Thread.sleep(2500);
                System.out.println("No one did much of it, because if you did, you'd also be imprisoned and or executed for \"helping a communist\"");
                Thread.sleep(2500);
                System.out.println("As your walking back home, North Korean soldiers come storming in, T-34 tanks rolling in behind them,\n" +
                        "South Korean and American soldiers coming in the opposite way trying to defend against the communists.");
                Thread.sleep(1000);
                ACIIArt.tanks();
                Thread.sleep(1000);
                ACIIArt.tanks();
                Thread.sleep(1000);
                ACIIArt.tanks();
                System.out.println("You are currently in the literal middle of it all. What do you do?\n" +
                        "1. Run away from the battle\n" +
                        "2. Stay in the middle");
                int runOrStay = myScanner.nextInt();
                if(runOrStay == 1){//if player decides to run away from the battle
                    System.out.println("You soon realize that you are in the middle of what will soon be known as the Second Battle of Seoul\n" +
                            "the second of 5.");
                    Thread.sleep(2500);
                    System.out.println("You start running back to your aunts home. You can hear the bullets, the explosions, the screams, the broken dreams.");
                    Thread.sleep(2500);
                    System.out.println("You finally get back home, panting and out of breath, you tell you aunt what happened");
                    Thread.sleep(2500);
                    System.out.println("\"The North-\" *pant pant* \"-they-they\" *pant* \"They attacked-\"");
                    Thread.sleep(1200);
                    System.out.println("\"I know Ji Yeon, I know, it's become regular by now, attacks, bombing all that, its normal now, better get used to it.\"");
                    Thread.sleep(2500);
                    System.out.println("Your aunt continues to clean up the broken pictures of you cousin that fell from his shrine.\n" +
                            "You pick one up. Its your cousin, about 15 years old, a couple of years before he went to war.");
                    Thread.sleep(2500);
                    System.out.println("You start to tear up as you remember playing hide and seek with him, as you remember playing tag with him.");
                    Thread.sleep(2500);
                    System.out.println("Your aunt takes out a piece of paper and hands it to you. Its a note from your cousin to you:");
                    Thread.sleep(2000);
                    System.out.println("\"Dear Ji Yeon,");
                    Thread.sleep(1700);
                    System.out.println("I know its a little late or maybe a little early but, happy birthday!");
                    Thread.sleep(1700);
                    System.out.println("Looking at where the situation is currently at, this will probably be my goodbye letter.");
                    Thread.sleep(1700);
                    System.out.println("I want you to always remember that day in late April, when we snuck out of my house and we went out into\n" +
                            "the fields and just ran.");
                    Thread.sleep(1700);
                    System.out.println("I want you to remember that feeling we had. That feeling of freedom and happiness");
                    Thread.sleep(1700);
                    System.out.println("Hold on to that feeling, and never let go.");
                    Thread.sleep(1700);
                    System.out.println("Promise me you'll do that, because I know I always will.");
                    Thread.sleep(1700);
                    System.out.println("Good luck teaching, see you when I see you.");
                    Thread.sleep(1700);
                    System.out.println("-your dearest cousin Jong Sun\"");
                    Thread.sleep(2500);
                    System.out.println("Your teary eyes soon turn to waterfalls of tears, your quiet gasps turn into loud cries.\n\n");
                    Thread.sleep(2500);
                    System.out.println("This war has taken so much from you, so much from your country, your family, from the world.\n" +
                            "\"In war, whichever side may call itself the victor, there are no winners, but all are losers...\"");
                    System.out.println("-Neville Chamberlain");
                    Thread.sleep(2800);
                    System.out.println("-------------------END--------------------");


                }else if(runOrStay == 2){//if player decides to stay in the middle of the battle
                    System.out.println("This battle stuns you. Although the battle has barely started, there is already uncountable amounts of destruction.\n" +
                            "All of this destruction, all the explosions, the screams, they all leave you paralyzed.");
                    Thread.sleep(1700);
                    System.out.println("Before anything happens to you, a young American soldier sweeps you off your feet.\n" +
                            "You take a look at his name tag \"Noah McMillan\".");
                    Thread.sleep(2500);
                    System.out.println("Ken tries to take you to safety, as he is running with you in his arms, he gets hit by a bullet. He drops you");
                    Thread.sleep(2500);
                    System.out.println("You try to save him, like he tried to save you. You try everything you can, but ultimately fail.");
                    Thread.sleep(2500);
                    System.out.println("As Noah dies in your arms, you start crying. Not over his death, but over what his death represents in your eyes.\n" +
                            "The death of dreams of young, hopeful soldiers. The broken families of other civilians, soldiers, innocent people caught in the crossfire.");
                    Thread.sleep(2500);
                    System.out.println("As you sit there crying over the loss of hope and happiness of the world, you hear an explosion not even a meter and a half away.\n" +
                            "You know this is the end, but at least it will end the misery that is the Korean War.");
                    Thread.sleep(2500);
                    System.out.println("Press R to restart");
                }

            }

        }
    }

}
