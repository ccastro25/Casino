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
public class CardsTest {


    HashMap<String,ArrayList<Integer>> atualCards = new HashMap<>();
    CardGames cardGames = new CardGames();
    BlackJack21Game bLackJackDealer = new BlackJack21Game();
    Cards cards = new Cards();


    @Test
    public void  addCardsTest(){
        Assert.assertEquals("",cards.addCards());
    }

    @Test
    public void shuffleTest(){Assert.assertEquals("shuffle test ",cards.shuffleCards());}


        @Test
    public void getShuffleSuits(){
            Assert.assertEquals("",cards.shuffleSuits());
        }
}
