package castrosCasinoTest;

import castros_casino.CasinoGames.HorseTrack;
import castros_casino.CasinoGames.HorseTrackOffice;
import castros_casino.Player;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by castro on 10/1/16.
 */
public class HorseTrackOfficeTest {
    HorseTrackOffice horseTrackOffice = new HorseTrackOffice();

    HorseTrackOffice horseTrackDisplay = new HorseTrackOffice();
    ArrayList<String> actual= horseTrackOffice.addHorsesToTrack();;
    ArrayList<String> expected = new ArrayList<String>(Arrays.asList("billy","charley","henry","steven"));
    Player player = new Player("castro",50);
    @Test
    public void addingHorse(){
        //actual names


        //excepted names
        Assert.assertEquals("adds all the horse name , which is in ascending order",expected, actual);
    }





@Test
   public void  chooseHorseTest(){

    String expectedHorseName = "charley";
    //1 billy, 2 charley , 3 henry , 4 steven
   String actualhorseName =horseTrackOffice.userPefferedHorse(2);


   Assert.assertEquals("show return horse name ",expectedHorseName,actualhorseName);

   }







@Test
public void theHorsetheUserChoose(){
//1 for Billy 2 for Charlie 3 for Henry  4 for Steven";
   String acutal= horseTrackOffice.userPefferedHorse(1);

    String expected = "billy";

    Assert.assertEquals("prints users selected horse ",expected,acutal);
}




   }







