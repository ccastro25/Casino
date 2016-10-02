package castros_casino.CasinoGames;

import castros_casino.Player;
import castros_casino.UserInputScanner;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by castro on 10/1/16.
 */
public class HorseTrack extends Game{
    Player player ;
ArrayList<String> horseNames;
UserInputScanner userInputScanner = new UserInputScanner();
HorseTrackOffice horseTrackOpitions = new HorseTrackOffice();
    double betPlaced;
    String yourHorsesName;

    public void  horseTrack(){
        horseNames = new ArrayList<String>();
        horseNames.add("billy");
        horseNames.add("charley");
        horseNames.add("henry");
        horseNames.add("steven");
        Collections.sort(horseNames);
    }

   public void start(Player player) {
       this.player = player;
    display.displayMessage(horseTrackOpitions.getGameRules(player));
       horseTrack();
     this.yourHorsesName = userPefferedHorse(choosenHorse());
     this.betPlaced=  placeBet(yourHorsesName);
       runRace();
       addMoneyToPlayersBalance(result(yourHorsesName));
       subtractMoneyFromPlayersBalance(result(yourHorsesName));
       display.displayMessage("your current Balance is: "+player.getWallet());
        optionsAfterRace();
    }

    public int choosenHorse(){
        return  userInputScanner.getIntFromUser("");
    }

    public double placeBet(String yourHorsesName) {
     return  userInputScanner.getDoubleFromUser(horseTrackOpitions.howMuchWillYouBet(yourHorsesName));
    }

    public void runRace()  {
        display.displayMessage("Race is about to start...Starting positions are....");

       loopTodisplayRace();
        display.displayMessage("the ranking is :");
        display.displayMessage(displayCurrentHorsePlaces());
    }

    public String  result(String usersNameHorse) {
        String placeInRace;
     if (horseNames.get(0).equalsIgnoreCase(usersNameHorse)){
         display.displayMessage("Congrats you've won first place");placeInRace= "first";}
      else if (horseNames.get(1).equalsIgnoreCase(usersNameHorse)){
           display.displayMessage("Congrats you've won second place");placeInRace= "second";}

        else{display.displayMessage("You lost, better luck next Time");placeInRace = "lost";}
        return placeInRace ;
      }

      public double addMoneyToPlayersBalance(String resultOFGame) {
        switch (resultOFGame){
            case "first":
                player.addMoneyToWallet(betPlaced*2);
                 break;
           case "second":
               player.subtractMonyeFromWallet(betPlaced);
               player.addMoneyToWallet(.50);
               break;}
    return player.getWallet();
    }

    public void subtractMoneyFromPlayersBalance(String resultsOFGame) {
        switch (resultsOFGame){
            case "lost":
               player.subtractMonyeFromWallet(betPlaced);
               break;}
   }

   public void restart() {start(this.player);}

   public void exitGame() {}





public String displayCurrentHorsePlaces(){
    String results = "";
    for (int i = 0; i < horseNames.size(); i++) {
        results += i+1 + ". " + horseNames.get(i) + "\n";
    }
    return results;
}



public void loopTodisplayRace(){
    int count=1;
    while (count<4){

        display.displayMessage("AT "+count+"/4 MILE THE RESULTS ARE: \n");
        display.displayMessage(displayCurrentHorsePlaces());
        Collections.shuffle(horseNames);
        count++;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            display.displayMessage("Error with the Thread.sleep");
        }
    }
}




    public  String userPefferedHorse(int horseChoice){
  String  usersHorse=null;

    switch (horseChoice){
        case 1:
          usersHorse =horseNames.get(0);
            break;
        case 2:
            usersHorse =horseNames.get(1);
            break;
        case 3:
            usersHorse =horseNames.get(2);
            break;
        case 4:
            usersHorse =horseNames.get(3);
            break;
    }

    return usersHorse;
}

public void optionsAfterRace(){
  int userchoice;

    while (true){
        display.displayMessage("Enter 1 to restart or 2 to return to casion");
        userchoice= userInputScanner.getIntFromUser("");
    switch (userchoice){
        case 1:
            restart();
            break;
        case 2:
            break;}

    }


}

}
