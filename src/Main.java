import java.util.*;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner myScanner = new Scanner(System.in);
        Story s = new Story();
        Player player = new Player(s);

        KoreanCivilianStory koreanCivilianStory = new KoreanCivilianStory(player);
        AmericanSoldierStory americanSoldierStory = new AmericanSoldierStory(player);

        System.out.println("Choose what story you would like to follow:\n" +
                "1. American Soldier\n" +
                "2. Korean Civilian");
        int playerStoryChoice =  myScanner.nextInt();
        if(playerStoryChoice == 1){
            player.setStory(americanSoldierStory);
            AmericanSoldierStory.executeAmericanSoldierStory(player);

        }else if(playerStoryChoice == 2){
            player.setStory(koreanCivilianStory);
            koreanCivilianStory.executeKorenCivianStory(player);
        }

    }
}

