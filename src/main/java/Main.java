import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args) {
        guessingNumberGame();
    }

    public static void guessingNumberGame() {
        //Scanner class
        Scanner input = new Scanner(System.in);
        //Generate the numbers
        int number = 1 + (int) (100 * Math.random());
        // number of tries
        int tries = 5;


        System.out.println("Guess a number between 1 and 100 in 5 tries");
        //Iterate over the tries
        for (int i = 0; i < tries; i++) {
            System.out.println("Guess the number");


            //scanner input for the guess
            int guess = input.nextInt();

            //if the number is guessed
            if (number == guess) {
                System.out.println("You guessed it");
                break;
            } else if (number < guess && i != tries - 1) {
                System.out.println("Number is less than guess");
            } else if (number > guess && i != tries - 1) {
                System.out.println("Number is more than guess");
            }else{
                System.out.println("Game Over");
                System.out.println("Number was " + number);
            }
        }
    }
}

