import java.util.Scanner;

public class KoreanCivilianStory extends Story {

    public KoreanCivilianStory(Player player) {
        super();

    }
    public void executeKorenCivianStory(Player player){
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
            bombsAway();
            System.out.println("Another one...");
            bombsAway();
            System.out.println("And another one");
            bombsAway();
            System.out.println("The next thing you know you're waking up from being unconscious. \n" +
                    "");

        }else if(fieldOrFlee == 2){//if player decides to flee to seoul

        }
    }
    public void bombsAway(){
        System.out.printf("   |\\**/|      \n" +
                "   \\ == /\n" +
                "    |  |\n" +
                "    |  |\n" +
                "    \\  /\n" +
                "     \\/\n");
        System.out.println("     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .\n" +
                "     .");
        System.out.println("   \n" +
                "        _ ._  _ , _ ._\n" +
                "        (_ ' ( `  )_  .__)\n" +
                "      ( (  (    )   `)  ) _)\n" +
                "     (__ (_   (_ . _) _) ,__)\n" +
                "         `~~`\\ ' . /`~~`\n" +
                "              ;   ;\n" +
                "              /   \\\n" +
                "_____________/_ __ \\_____________\n" +
                "\n");
    }
}
