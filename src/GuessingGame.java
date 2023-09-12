import java.util.Random;
import java.util.Scanner;

//Create a program that simulates a guessing game,
// which must generate a random number between
// 0 and 100 and ask the user to try to guess the number,
// in up to 7 attempts.

public class GuessingGame
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int numberRandom = new Random().nextInt(100);
        int attempts = 0;

        while (attempts < 7)
        {
            System.out.println("Enter a number from 0 to 100: ");
            int numberEntered = reader.nextInt();
            attempts++;

            if (numberRandom == numberEntered){
                System.out.println("Congratulations!! You guessed the number in " + attempts + " attempts");
                break;
            } else if (numberRandom < numberEntered)
            {
                System.out.println("The entered number is less than the generated number!");
            }
            else {
                System.out.println("The entered number is greater than the generated number!");
            }

        }

        if (attempts == 7)
        {
            System.out.println("You failed to guess the number in seven attempts. The generated number is " + numberRandom);
        }

    }

}
