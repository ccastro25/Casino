package castros_casino.CasinoGames;

import castros_casino.Casino;
import castros_casino.Player;
import castros_casino.UserInputScanner;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by castro on 10/1/16.
 */
public class HorseTrackOffice {
UserInputScanner userInputScanner = new UserInputScanner();
Player player;

    ArrayList<String> horseNames = new ArrayList<>();

    public String getGameRules(Player player) {

        return "Welcome "+player.getName()+" you have enter the horse track. " +
                "There are four horses which are Steven,Henry,Billy and Charley." +
                "\n IF you are fortunate and you lucky horse reaches 1st place ,you will win 2 times you bette amount (2 times the bet you place)." +
                "\n 2nd place will be a $10 and all other places will not be rewarded." +
                "\n\"While the  horses run  the mile long track and through every race you are given an update.\n" +
                "\nPlease select a horse:\n 1 for Billy\n 2 for Charlie \n 3 for Henry \n 4 for Steven;\n";
    }

    public ArrayList<String> addHorsesToTrack() {
        horseNames = new ArrayList<String>();
        horseNames.add("steven");
        horseNames.add("charley");
        horseNames.add("henry");
        horseNames.add("billy");
        Collections.sort(horseNames);

        return horseNames;
    }


    public String howMuchWillYouBet(String horseName){
        return "You have choose "+horseName +" how much will you be betting ?";
    }

    public int choosenHorse(){
        return  userInputScanner.getIntFromUser("");
    }


    public String userPefferedHorse(int horseChoice) {
        String usersHorse = null;

        switch (horseChoice) {
            case 1:
                usersHorse = horseNames.get(0);
                break;
            case 2:
                usersHorse = horseNames.get(1);
                break;
            case 3:
                usersHorse = horseNames.get(2);
                break;
            case 4:
                usersHorse = horseNames.get(3);
                break;
        }

        return usersHorse;
    }

    public double placeBet(String yourHorsesName) {
        return  userInputScanner.getDoubleFromUser(howMuchWillYouBet(yourHorsesName));
    }

    public double addMoneyToPlayersBalance(Player player,String resultOFGame,double betPlaced) {
        switch (resultOFGame){
            case "first":
                player.addMoneyToWallet(betPlaced*2);
                break;
            case "second":
                player.subtractMoneyFromWallet(betPlaced);
                player.addMoneyToWallet(.50);
                break;}
        return player.getWallet();
    }

    public double subtractMoneyFromPlayersBalance( Player player,String resultsOFGame, double betPlaced) {
        switch (resultsOFGame){
            case "lost":
                player.subtractMoneyFromWallet(betPlaced);

                break;}

                return player.getWallet();
    }


    public int optionsAfterRace(int userchoice) {

        Casino casino = new Casino();

        while (true) {


            switch (userchoice) {
                case 1:
                //  horseTrack.restart();
                    break;
                case 2:
                    casino.chooseAGame();
                    break;
            }
            return userchoice;    }
    }

}
