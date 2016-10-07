package castrosCasinoTest;

import castros_casino.CasinoGames.BlackJack21Game;
import castros_casino.CasinoGames.CardGames;
import castros_casino.CasinoGames.Cards;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by castro on 10/4/16.
 */
public class BlackJack21GameTest {


    ArrayList<Integer> cardsValue = new ArrayList<>();
    ArrayList<String> cardSuits = new ArrayList<String>();
    BlackJack21Game bLackJack21Game = new BlackJack21Game();


    @Test
    public void addingAndShufflingValuesTest() {


    Assert.assertEquals("should add and shuffle cards",  bLackJack21Game.addAndShuffleValues());
    }

    @Test
    public void addingAndShufflingSuitsTest(){
        Assert.assertEquals("should add and shuffle suits",bLackJack21Game.addAndShuffleSuits());
    }


    @Test
    public  void  dealCardDealer(){
       cardsValue  = bLackJack21Game.addAndShuffleValues();
       cardSuits = bLackJack21Game.addAndShuffleSuits();
        Assert.assertEquals(" return random card value", bLackJack21Game.dealCardforDealer(1,cardsValue));
    }

    @Test
    public void dealUserCard(){
        cardsValue = bLackJack21Game.addAndShuffleValues();
        Assert.assertEquals("return random number",bLackJack21Game.dealCardForUser(1,cardsValue));
    }

    @Test
    public void deleteValues(){
        cardsValue= bLackJack21Game.addAndShuffleValues();
        cardSuits = bLackJack21Game.addAndShuffleSuits();
        int firsSize =cardsValue.size();
        bLackJack21Game.deleteSuitandValues(cardSuits,cardsValue);
        int secondSize = cardsValue.size();
        Assert.assertEquals("reduce the arrays size",firsSize,secondSize);
    }





}