package castros_casino.CasinoGames;

import castros_casino.Player;
import castros_casino.UserInputScanner;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by castro on 10/2/16.
 */
public class BlackJackDealer extends CardGames {
    Player player;
    UserInputScanner userInputScanner = new UserInputScanner();

    private int options;


    public boolean stayorPlay(String userCardSuit, int userCardValue, int totalCardCount) {
        System.out.println("stay or play , cardvalue" +userCardValue+" and "+totalCardCount);
        if (totalCardCount >= 21) {
            return false;
        } else {
            display.displayMessage("Your current card is " + userCardValue + " of " + userCardSuit + " and your total count card is: " + totalCardCount);
            options = userInputScanner.getIntFromUser("To get another card press 1 , to stay press 2");
        }

        return usersChosesPlayOrStay(options);

    }

    public boolean stayOrPlayDealer(int totalCardAmount) {
        boolean result;
        if (totalCardAmount > 17) {
            result = false;
        } else {
            result = true;
        }
        return result;
    }


    public boolean usersChosesPlayOrStay(int choice) {
        boolean ch;

        switch (choice) {
            case 1:
                ch = true;
                break;
            case 2:
                ch = false;
                break;
            default:
                ch = true;
                break;
        }


        return ch;
    }


    public void displayTotalScore(Player player, int userFinalScore, int dealrsFinalScore, double wager) {
        switch (comparingScores(userFinalScore, dealrsFinalScore)) {

            case 0:
                subtractMoneyFromPlayersBalance(player, wager);
                display.displayMessage("You lost " + wager + " ,your  score was :" + userFinalScore + " and the dealers final score is: "
                        + dealrsFinalScore + "your current wallet is now " + player.getWallet());
                break;

            case 1:
                addMoneyToPlayersBalance(player, wager);
                display.displayMessage("You won " + wager + ", your score was : " + userFinalScore + " and the dealers final score is: "
                        + dealrsFinalScore + " your current wallet is now " + player.getWallet());
                break;


            default:
                display.displayMessage("nooooo " + comparingScores(userFinalScore, dealrsFinalScore));

        }


    }

    public int comparingScores(int user, int dealer) {
        int compare=0;

        if (user < 21 && user > dealer) {
            compare =1;
        }
        return compare;
    }


    public double addMoneyToPlayersBalance(Player player, double betPlaced) {
        player.addMoneyToWallet(betPlaced * 2);
        return player.getWallet();
    }

    public double subtractMoneyFromPlayersBalance(Player player, double betPlaced) {
        player.subtractMoneyFromWallet(betPlaced);
        return player.getWallet();
    }


}







