package castros_casino.CasinoGames;

import castros_casino.Casino;
import castros_casino.Display;
import castros_casino.Player;
import jdk.nashorn.internal.runtime.regexp.joni.constants.OPCode;

/**
 * Created by castro on 10/1/16.
 */
abstract class Game {


    Player player;

    Display display = new Display();



    abstract void start(Player player);

    abstract String  result(String Name);

    abstract double addMoneyToPlayersBalance(String resultOFGame);

    abstract void subtractMoneyFromPlayersBalance(String resultsOFGame);

    abstract void restart();

    public void exitGame(){



    }










}






