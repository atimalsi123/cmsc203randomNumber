import java.util.Random;
import java.util.Scanner;

public class RNGDriver {
	public static void main (String[] args) {
		final int number = 100;
		String ans;
		do {
		Scanner sc = new Scanner (System.in);
		Random rand = new Random();
		int random = rand.nextInt(100) + 1;
		int count = 1;
		int highGuess = 100, lowGuess = 0;
		RNG rng = new RNG ();
		int num  = rand.nextInt(number) + 1;
		System.out.println("Guess a random number between 0 and 100: ");
		int nextGuess1 = sc.nextInt();
		System.out.println("Number of guesses is " + count);
		
		if (random == nextGuess1) {
			System.out.println("Congratulations, you guessed correctly!");
			break;
		}
		if ((nextGuess1 < lowGuess) && (nextGuess1 < random) )
		{
			System.out.println("Your guess is too low. \n" +  "Enter you next guess between " + nextGuess1 + " and " +  highGuess);
			count++;	
		}	
		if ((nextGuess1 > highGuess) && (nextGuess1 < random)) {
			System.out.println("Your guess is too high. \n" + "Enter your next guess between " + lowGuess + " and " + nextGuess1);
			count++;	
		} 
		System.out.println("Guess a second number between " + nextGuess1 + " and " + highGuess + ": ");
		sc.nextLine();
		int nextGuess2 = sc.nextInt();
		System.out.println("Number of guesses is 2");
		if (random == nextGuess2) {
			System.out.println("Congratulations, you guessed correctly!");
			break;
		}
		if ((nextGuess2 < lowGuess) && (nextGuess2 < random) )
		{
			System.out.println("Your guess is too low. \n" +  "Enter you next guess between " + nextGuess1 + " and " +  nextGuess2);
			count++;
			}
		if ((nextGuess2 > highGuess) && (nextGuess2 < random)) {
			System.out.println("Your guess is too high. \n" + "Enter your next guess between " + nextGuess2 + " and " + highGuess);
			count++;
		}
		System.out.println("Guess a third number between " + nextGuess1 + " and " + nextGuess2 + ": ");
		sc.nextLine();
		int nextGuess3 = sc.nextInt();
		System.out.println("Number of guesses is 3");
		if (random == nextGuess3) {
			System.out.println("Congratulations, you guessed correctly!");
			
		}
		if ((nextGuess3 < lowGuess) && (nextGuess3 < random) )
		{
			System.out.println("Your guess is too low. \n" +  "Enter you next guess between " + nextGuess2 + " and " +  nextGuess3);
			count++;
			}
		if ((nextGuess3 > highGuess) && (nextGuess3 < random)) {
			System.out.println("Your guess is too high. \n" + "Enter your next guess between " + nextGuess1 + " and " + nextGuess3);
			count++;
		}
		System.out.println("Guess a forth number between " + nextGuess3 + " and " + nextGuess2 + ": ");
		int nextGuess4 = sc.nextInt();
		System.out.println("Number of guesses is 4");
		if (random == nextGuess4) {
			System.out.println("Congratulations, you guessed correctly!");
			break;
		}
		if ((nextGuess4 < lowGuess) && (nextGuess4 < random) )
		{
			System.out.println("Your guess is too low. \n" +  "Enter you next guess between " + nextGuess4 + " and " +  nextGuess3);
			count++;
			}
		if ((nextGuess4 > highGuess) && (nextGuess4 < random)) {
			System.out.println("Your guess is too high. \n" + "Enter your next guess between " + nextGuess1 + " and " + nextGuess4);
			count++;
		}
		sc.nextLine();
		System.out.println("Guess a fifth number between " + nextGuess4 + " and " + nextGuess2 + ": ");
		int nextGuess5 = sc.nextInt();
		System.out.println("Number of guesses is 5");
		if (random == nextGuess5) {
			System.out.println("Congratulations, you guessed correctly!");
		}
		if ((nextGuess5 < lowGuess) && (nextGuess5 < random) )
		{
			System.out.println("Your guess is too low. \n" +  "Enter you next guess between " + nextGuess4 + " and " +  nextGuess5);
			count++;
			}
		if ((nextGuess5 > highGuess) && (nextGuess5 < random)) {
			System.out.println("Your guess is too high. \n" + "Enter your next guess between " + nextGuess1 + " and " + nextGuess5);
			count++;
		} 
		sc.nextLine();
		System.out.println("Do you want to try again?");
		ans = sc.nextLine();
		}while (ans.equals("y"));
		System.out.println("Programmer: Alisha Timalsina \n" + "Thank you for playing.");
		

		}
}

		

