package castros_casino;

/**
 * Created by castro on 10/1/16.
 */
public class Player {

    private String name;
    private double wallet;


    public Player(String name, double wallet){
        this.name = name;
        this.wallet = wallet;
    }


    public String getName() {
        return name;
    }

    public double getWallet() {
        return wallet;
    }



    public void addMoneyToWallet(double addAmount){
      wallet += addAmount;
    }

    public void subtractMoneyFromWallet(double subtractAmount){

        wallet -= subtractAmount;
    }
}
