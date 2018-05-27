import java.util.Scanner;

public class KoreanCivilianStory extends Story {

    public KoreanCivilianStory(Player player) {
        super();

    }
    public void executeKorenCivianStory(Player player) throws InterruptedException {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Your name is Ji Yeon, \n" +
                "you are a high school teacher in rural areas of South Korea during the Korean War.\n" +
                "You arrive to school one day and you notice that multiple students are missing.\n" +
                "You hear many fighter jets coming.\n" +
                "1. Do you go out into the fields to see whats happening\n" +
                "2. Do you try to flee to another city out of fear of being caught in crossfire");
        int fieldOrFlee = myScanner.nextInt();
        if(fieldOrFlee == 1){//if player decides to go into the fields
            System.out.println("You and the little students that are left in your class go out into the surrounding\n" +
                    "fields to check whats happening. You look up and see a bomber plane.\n" +
                    "You feel relieved but somehow also feel like something is wrong. \n" +
                    "You see the bomb compartment open up...");
            Thread.sleep(2300);
            ACIIArt.bombsAway();
            Thread.sleep(1700);
            System.out.println("Another one...");
            ACIIArt.bombsAway();
            Thread.sleep(1700);
            System.out.println("And another one...");
            ACIIArt.bombsAway();
            Thread.sleep(2700);
            System.out.println("The next thing you know you're waking up from being unconscious.\n" +
                    "You open your eyes and see the planes passing above you. You notice something peculiar.\n" +
                    "The plane that dropped the bombs, its a F-51D Mustang, its an American plane!!\n" +
                    "As your life force slowly fades away, you ask yourself, why? Why would the Americans do this? \n" +
                    "Why would the Americans bomb their own allies?\n" +
                    "You breathe your last breath, you close your eyes to never open them again");
            Thread.sleep(1500);
            System.out.println("Press R to restart");

        }else if(fieldOrFlee == 2){//if player decides to flee to seoul
            System.out.println("You decide to flee to Seoul, afraid of being caught in the crossfire.\n" +
                    "On the train on your way there, you see american and South Korean soldiers \n" +
                    "10 meters away from russian and North Korean soldiers, \n" +
                    "not fighting but mourning fellow fallen soldiers.");
            Thread.sleep(1500);
            System.out.println("This really hits you, it shows that this war, like all wars are tragic");
            Thread.sleep(1000);
            System.out.println("That there is never really a winner. Everyone comes out losing something.");
            Thread.sleep(1500);
            System.out.println("Your cousin that went to fight, KIA. Your mom, caught in a friendly fire while shopping.\n" +
                    "Your brother, lost his leg when debris hit him after a bombing in Seoul.");
            Thread.sleep(1500);
            System.out.println("You look back at the soldiers of opposite sides mourning.");
            Thread.sleep(1500);
            System.out.println("God damn these Russians, abusing our land like a dog, these damn Americans, bombing their own allies.\n" +
                    "Why God? Why??");
            Thread.sleep(1500);
            System.out.println("As your eyes fill up with tears, you arrive at Seoul. \n" +
                    "You get off the train and find a taxi to take to your aunts place");
            Thread.sleep(1500);
            System.out.println("While driving there, you see destruction. So much destruction. \n" +
                    "It hits you, What if my aunts place has been destroyed? What if shes dead? Where do I go?");
            Thread.sleep(1000);
            System.out.println("You panic for the rest of the trip, but as soon as you get there, your panic ends.\n" +
                    "Your aunts place is fine, at least it looks fine.");
            Thread.sleep(1500);
            //TODO: continue this story line
        }
    }

}
