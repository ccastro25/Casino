package castrosCasinoTest;

import castros_casino.CasinoGames.BlackJackDealer;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 10/6/16.
 */
public class BlackJackDealerTest {

    BlackJackDealer blackJackDealer = new BlackJackDealer();


    @Test
    public void stayOrLeaveTest(){
// false to leave , true to stay
     boolean actual =   blackJackDealer.stayOrPlayDealer(2);
        boolean expected = true;
        Assert.assertEquals("Test if value is higher than 21 and prompts user if they want to stay or go" +
                "false to leave true to stay",expected,actual);
    }


    @Test
    public void dealerStayOrLeave(){

      boolean actaul= blackJackDealer.stayOrPlayDealer(15);
        boolean expected = false;

        Assert.assertEquals("if dealer card is higher than 17 it return false",expected,actaul);
    }

    @Test
    public void userChoosesToStayOrPlay(){

        boolean expected = false;

        boolean actual = blackJackDealer.usersChosesPlayOrStay(2);

        Assert.assertEquals("checks wheter user wants to stay or leave",expected,actual);
    }


    @Test
    public void comparingScores(){

      int compare=  blackJackDealer.comparingScores(1,5);
        int expected =0;

        Assert.assertEquals("",expected,compare);
    }






}
