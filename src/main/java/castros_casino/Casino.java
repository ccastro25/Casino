package castros_casino;

import castros_casino.CasinoGames.HorseTrack;

/**
 * Created by castro on 10/1/16.
 */
public class Casino {

    private Player player;
    private UserInputScanner userInputScanner = new UserInputScanner();
    HorseTrack horseTrack = new HorseTrack();



    public void createPlayer(){
        String name =  userInputScanner.getStringFromUser("Enter your name ");
        double wallet =  userInputScanner.getDoubleFromUser("Enter Starting amount");
        player = new Player(name,wallet);


        }


        public void startGame(){
        horseTrack.start(this.player);

        }
}