package castros_casino.CasinoGames;

import castros_casino.Player;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by castro on 10/2/16.
 */
public class CardGames extends Game{





    @Override
    void start(Player player) {}


    @Override
    public String result(String Name) {
        return null;
    }

    @Override
   public double addMoneyToPlayersBalance(String resultOFGame) {
        return 0;
    }

    @Override
   public void subtractMoneyFromPlayersBalance(String resultsOFGame) {}

    @Override
    public void restart() {}

    @Override
    public void exitGame() {
        super.exitGame();
    }

}
