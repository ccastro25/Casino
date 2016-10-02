package castros_casino.CasinoGames;

import castros_casino.Player;

/**
 * Created by castro on 10/1/16.
 */
public class HorseTrackOffice {




    public String getGameRules(Player player) {

        return "Welcome "+player.getName()+" you have enter the horse track. " +
                "There are four horses which are Steven,Henry,Billy and Charley." +
                "\n IF you are fortunate and you lucky horse reaches 1st place ,you will win 2 times you bette amount (2 times the bet you place)." +
                "\n 2nd place will be a $10 and all other places will not be rewarded." +
                "\n\"While the  horses run  the mile long track and through every race you are given an update.\n" +
                "\nPlease select a horse:\n 1 for Billy\n 2 for Charlie \n 3 for Henry \n 4 for Steven\";";
    }




    public String howMuchWillYouBet(String horseName){
        return "You have choose "+horseName +" how much will you be betting ?";
    }




}
