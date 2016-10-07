package castrosCasinoTest;

import castros_casino.CasinoGames.HorseTrack;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 10/6/16.
 */
public class HorseRaceTrackTest {


HorseTrack horseTrack = new HorseTrack();





    @Test
    public void displayCurrentHoresePlaceTest() {

        //expected  display
        String expected="1. billy\n2. charley\n3. henry\n4. steven";
        String actual = horseTrack.displayCurrentHorsePlaces();
        Assert.assertEquals(" prints horses place in race",expected, actual);
    }



    @Test
    public void resultRaceTest(){

        horseTrack.runRace();
        String expected = "first";
        String actual=  horseTrack.result("charley");

        Assert.assertEquals("Should give results wheter lost or won horse ", expected,actual);
    }









}
