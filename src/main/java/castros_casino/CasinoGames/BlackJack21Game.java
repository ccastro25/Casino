package castros_casino.CasinoGames;

import castros_casino.Player;
import castros_casino.UserInputScanner;

import java.util.*;

/**
 * Created by castro on 10/3/16.
 */
public class BlackJack21Game {
    UserInputScanner userInputScanner = new UserInputScanner();
    Cards cards = new Cards();
    private BlackJackDealer blackjackgGame = new BlackJackDealer();
    Player player;


    public void playBlackJack21(Player player) {
       ArrayList<String> cardSuits;
        ArrayList<Integer> cardValue ;
        this.player = player;
        double thewager;


        boolean playagain ;
        do {

            cardValue= addAndShuffleValues();
            cardSuits= addAndShuffleSuits();
            addAndShuffleSuits();
            thewager= howMuchAreYOUBetting();
            dealingforPlayersCards(cardSuits,cardValue,thewager);

            playagain = playAgain();
        } while (playagain);
    }

    public ArrayList<Integer> addAndShuffleValues(){return cards.shuffleCards();}
    public ArrayList<String> addAndShuffleSuits(){  return cards.shuffleSuits();}

    public void dealingforPlayersCards(ArrayList<String> cardSuits,ArrayList<Integer> cardValue,double thewager) {
         boolean usersOptionToStayORPlay = true;
         boolean dealerBoolean ;
        int valueOFDealersCard=0;
        int valueOFUsersCard =0;

        do {
            valueOFUsersCard += dealCardForUser(0,cardValue);
            usersOptionToStayORPlay = blackjackgGame.stayorPlay(cardSuits.get(0), addPlayersCards(cardValue.get(0)), valueOFUsersCard);
            valueOFDealersCard += dealCardforDealer(1,cardValue);
            dealerBoolean = blackjackgGame.stayOrPlayDealer(valueOFDealersCard);
            blackjackgGame.displayTotalScore(player, valueOFUsersCard, valueOFDealersCard, thewager);
            deleteSuitandValues(cardSuits,cardValue);
        } while (usersOptionToStayORPlay && dealerBoolean);


    }


    public int dealCardForUser(int throwCard,ArrayList<Integer> cardValue) {
       int theUserCardValue = addPlayersCards(cardValue.get(throwCard));
        return theUserCardValue;
    }

    public int dealCardforDealer(int throwCard,ArrayList<Integer> cardVaule) {
       int theDelearCardValue = addPlayersCards(cardVaule.get(throwCard));
        return theDelearCardValue;
    }

    public int addPlayersCards(int playerCardValue) {
        return playerCardValue;
    }

    public void deleteSuitandValues(ArrayList<String> cardSuits,ArrayList<Integer> cardValue) {
        cardSuits.remove(0);
        cardSuits.remove(1);
        cardValue.remove(0);
        cardValue.remove(1);
    }


    public double howMuchAreYOUBetting() {
        double wager;
        return wager = userInputScanner.getDoubleFromUser("how much are you betting?");
    }


    public boolean playAgain() {
        int playAgainOrNot = userInputScanner.getIntFromUser("enter 1 play again or 2 to return to main menu.");

        switch (playAgainOrNot) {
            case 1:
                playBlackJack21(player);
                return true;
            case 2:
                return false;
            default:
                return true;
        }
    }



}
