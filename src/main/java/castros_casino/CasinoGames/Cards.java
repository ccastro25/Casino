package castros_casino.CasinoGames;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by castro on 10/3/16.
 */
public class Cards extends CardGames{



    ArrayList<String> suits = new ArrayList<>();
    ArrayList<Integer> valuesOfCards = new ArrayList<>();


    public ArrayList<Integer> addCards(){
        int J=10;
        int Q=10;
        int K=10;
        valuesOfCards.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,J,K,Q));
        valuesOfCards.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,J,K,Q));
        valuesOfCards.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,J,K,Q));

        return  valuesOfCards;}


    public ArrayList<Integer> shuffleCards(){
        addCards();
        Collections.shuffle(valuesOfCards);
        return valuesOfCards;
    }

public  ArrayList<String> addsuits(){
    suits.addAll(Arrays.asList("Hearts","Clubs","Spades","Diamonds","Hearts","Clubs",
            "Spades","Diamonds","Hearts","Clubs","Spades","Diamonds"));
    suits.addAll(Arrays.asList("Hearts","Clubs","Spades","Diamonds","Hearts","Clubs",
            "Spades","Diamonds","Hearts","Clubs","Spades","Diamonds"));
    suits.addAll(Arrays.asList("Hearts","Clubs","Spades","Diamonds","Hearts","Clubs",
            "Spades","Diamonds","Hearts","Clubs","Spades","Diamonds"));
return suits ;
}



            public ArrayList<String> shuffleSuits(){
                addsuits();
                Collections.shuffle(suits);
                return suits;
            }


}
