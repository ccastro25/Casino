package castros_casino;

import castros_casino.CasinoGames.BlackJack21Game;
import castros_casino.CasinoGames.HorseTrack;

/**
 * Created by castro on 10/1/16.
 */
public class Casino {

    private Player player;
    private UserInputScanner userInputScanner = new UserInputScanner();
    HorseTrack horseTrack = new HorseTrack();
    BlackJack21Game bLackJackDealer = new BlackJack21Game();
    Display display = new Display();


    public void createPlayer(){
        String name =  userInputScanner.getStringFromUser("Enter your name ");
        double wallet =  userInputScanner.getDoubleFromUser("Enter Starting amount");
        player = new Player(name,wallet);
            startGame(player);

        }


        public void startGame(Player player){
       chooseAGame();
        }



        public void chooseAGame(){
            display.displayMessage("Welcome to Castro Casino");
      int casinoGames =    userInputScanner.getIntFromUser("for the racetrack enter 1 ,2 for blackjack");
            otpions(casinoGames,player);

        }

        public void otpions(int choice, Player player){

            switch (choice){
                case  1:
                    horseTrack.start(player);
                    break;

                case 2:
                    bLackJackDealer.playBlackJack21(player);
                    break;
            }



        }
}