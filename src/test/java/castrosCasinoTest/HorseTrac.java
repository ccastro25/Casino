package castrosCasinoTest;

import castros_casino.CasinoGames.HorseTrack;
import castros_casino.CasinoGames.HorseTrackOffice;
import castros_casino.Player;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by castro on 10/1/16.
 */
public class HorseTrac {

   HorseTrack horseTrack = new HorseTrack();
    Player player = new Player("will",200);
    HorseTrackOffice horseTrackDisplay = new HorseTrackOffice();

@Test
   public void  userPefferedHorseTest(){

horseTrack.horseTrack();
//1 for Billy 2 for Charlie 3 for Henry  4 for Steven";
    String expectedHorseName = "Charley";
   String actualhorseName =horseTrack.userPefferedHorse(2);


   Assert.assertEquals("show return horse name ",expectedHorseName,actualhorseName);

   }





    @Test
   public void runRaceTest(){
        horseTrack.horseTrack();
      horseTrack.runRace();
      String expected = "";
      String actual=  horseTrack.result("charley");


     Assert.assertEquals("Should give results wheter lost or wonhorse ", expected,actual);
   }

}
