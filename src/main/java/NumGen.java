import java.util.Random; //Importing number randomiser
import java.util.Scanner; // User input
public class NumGen {
    public static void main(String[] args) {
        Random Rand = new Random();
        int random = Rand.nextInt(5) + 1;
        System.out.println("Welcome to this new guessing game!");
        System.out.println("Are you ready?");
        System.out.println("Let us begin!");
        Scanner myInput = new Scanner(System.in);
        System.out.println("What's your Number:");
        int Gnum; //Gnum is an integer

        // Each wrong answere gets a Strike.
        boolean rightAnswer = false;

        {
            while (!rightAnswer) {
                Gnum = myInput.nextInt(); // The object I'm guessing is an integer.
                if (Gnum == random) { // if guess equals number
                    System.out.println("That is correct! It is" +random );
                    System.out.println("Here is your present");
                    System.out.println("https://www.youtube.com/watch?v=QcyPRFpkYak");
                    myInput.close();
                    rightAnswer = true;

                } else if (Gnum < random) { //if guess it too low
                    System.out.println("That is too low!");
                    System.out.println("Try again: ");



                } else if (Gnum > random) { //if guess is too high
                    System.out.println("That is too high!");
                    System.out.println("Try again: ");

                }

            }

        }

    }
}