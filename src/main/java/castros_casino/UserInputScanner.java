package castros_casino;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by castro on 10/1/16.
 */
public class UserInputScanner {

    Scanner scanner = new Scanner(System.in);
    Display display = new Display();

    public String getStringFromUser(String promt) {

        display.displayMessage(promt);
        return scanner.nextLine();

    }


    public double getDoubleFromUser(String promt) {

        while (true) {
            display.displayMessage(promt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                display.displayMessage("Error , wrong output, try again");
                scanner.next();

            }
        }

    }


    public int getIntFromUser(String prompt) {

        while (true) {
            display.displayMessage(prompt);
            try{ return scanner.nextInt();}

            catch (InputMismatchException e){display.displayMessage("Error , wrong output, try again");
                scanner.next();}

        }
    }
}