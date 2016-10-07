package castros_casino.CasinoGames;

import castros_casino.Display;
import castros_casino.Player;
import castros_casino.UserInputScanner;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by castro on 10/1/16.
 */
public class HorseTrack {
    Player player;
    Display display = new Display();

    UserInputScanner userInputScanner = new UserInputScanner();
    HorseTrackOffice horseTrackOpitions = new HorseTrackOffice();
    ArrayList<String> horseNames = horseTrackOpitions.addHorsesToTrack();
    double betPlaced;
    String yourHorsesName;
    private int userchoice;



    public void start(Player player) {
        this.player = player;

        display.displayMessage(horseTrackOpitions.getGameRules(player));
        horseNames = horseTrackOpitions.addHorsesToTrack();
        this.yourHorsesName = horseTrackOpitions.userPefferedHorse(horseTrackOpitions.choosenHorse());
        this.betPlaced = horseTrackOpitions.placeBet(yourHorsesName);
        runRace();
        horseTrackOpitions.addMoneyToPlayersBalance(player, result(yourHorsesName), betPlaced);
        horseTrackOpitions.subtractMoneyFromPlayersBalance(player, result(yourHorsesName), betPlaced);
        display.displayMessage("your current Balance is: " + player.getWallet());
        userchoice = userInputScanner.getIntFromUser("Enter 1 to restart or 2 to return to casion");
        horseTrackOpitions.optionsAfterRace(userchoice);
    }

    public void runRace() {
        display.displayMessage("Race is about to start...Starting positions are....");
        loopTodisplayRace();
        display.displayMessage("The results are :");
        display.displayMessage(displayCurrentHorsePlaces());
    }

    public String result(String usersNameHorse) {
        String placeInRace;
        if (horseNames.get(0).equalsIgnoreCase(usersNameHorse)) {
            display.displayMessage("Congrats you've won first place");
            placeInRace = "first";
        } else if (horseNames.get(1).equalsIgnoreCase(usersNameHorse)) {
            display.displayMessage("Congrats you've won second place");
            placeInRace = "second";
        } else {
            display.displayMessage("You lost, better luck next Time");
            placeInRace = "lost";
        }
        return placeInRace;
    }


    public void restart() {
        start(this.player);
    }

    public String displayCurrentHorsePlaces() {
        String results = "";
        for (int i = 0; i < horseNames.size(); i++) {
            results += i + 1 + ". " + horseNames.get(i) + "\n";
        }
        return results;
    }

    public void loopTodisplayRace() {
        int count = 1;
        while (count < 4) {

            display.displayMessage("AT " + count + "/4 MILE THE RESULTS ARE: \n");
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





}
