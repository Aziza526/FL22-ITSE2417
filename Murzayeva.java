
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author murza
 */
public class Murzayeva implements FinalProject {

    @Override
    public void begin() throws NumberFormatException {
        int input;

        System.out.println("********************************************");
        System.out.println(" Welcome to the Guessing Game");
        System.out.println("********************************************");
        System.out.println();
        System.out.println("Try to guess the number from 1-10. Ready? ");
        System.out.println("Enter a positive integer between 1 and 10: ");

        try {
            input = Itse2417Main.myScan.nextInt();

            if (input >= 1 && input <= 10) {
                Guess(input);
            } else {
                throw new NumberFormatException();
            }
        } catch (InterruptedException e) {

        } catch (NumberFormatException e) {
            System.out.println("NUMBER IS OUT OF RANGE! TRY AGAIN!");
            begin();
            try {
                java.util.concurrent.TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException f) {
            }
        }
    }

    public void Guess(int userGuessNumber) throws InterruptedException {
        int x = 1 + (int) +(Math.random() * 10);

        System.out.println();
        System.out.println();

        while (userGuessNumber != x) {
            if (userGuessNumber > x) {
                System.out.println("Lower!");
                userGuessNumber = Itse2417Main.myScan.nextInt();
            } else if (userGuessNumber < x) {
                System.out.println("Higher!");
                userGuessNumber = Itse2417Main.myScan.nextInt();
            }

        }

        System.out.println("Congratulations! You found the Number!");

        System.out.println();
        System.out.println();
        java.util.concurrent.TimeUnit.SECONDS.sleep(2);

    }

}
