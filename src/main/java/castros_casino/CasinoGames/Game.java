package castros_casino.CasinoGames;

import castros_casino.Casino;
import castros_casino.Display;
import castros_casino.Player;

/**
 * Created by castro on 10/1/16.
 */
abstract class Game {


    private double pot;

    Display display = new Display();



    abstract void start(Player player);

    abstract double placeBet(String yourHorsesName);

    abstract String  result(String usersNameHorse);

    abstract double addMoneyToPlayersBalance(String resultOFGame);

    abstract void subtractMoneyFromPlayersBalance(String resultsOFGame);

    abstract void restart();

    public void exitGame(){



    }










}






