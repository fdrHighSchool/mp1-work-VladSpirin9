
/**
 * Write a description of class NumberGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
	int mysteryNumber = 0;

        System.out.println("What mode do you want?\nEasy\nMedium\nHard");
        String mode = s.nextLine();
        System.out.println(mode);
        
        if(mode.equals("Easy")) {
	    mysteryNumber = (int)(Math.random()*10+1);
        }
        else  if(mode.equals("Medium")) {
	    mysteryNumber = (int)(Math.random()*50+1);
        }
        else {
	    mysteryNumber = (int)(Math.random()*100+1);
        }
        
	System.out.println(mysteryNumber);       
        System.out.print("Enter your guess: ");
        int playerGuess = s.nextInt();
        
        //if player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            if (playerGuess < mysteryNumber) {
		System.out.println("You were off by " + (mysteryNumber - playerGuess));
	    }
	    else {
		System.out.println("You were off by " + (playerGuess - mysteryNumber));
	    }
	}
	else {
	    System.out.println("Correct!!!");
        }
	s.close();
    }

}
