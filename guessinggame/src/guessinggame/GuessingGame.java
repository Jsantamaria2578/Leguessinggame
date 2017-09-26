package guessinggame;
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10");
			int guess = input.nextInt();
			int answer = (int)(Math.random() * 10 + 1);
			while(guess != answer) {
				boolean isnumber = false;
				while(!isnumber)
				{
					try {
						if(guess > 5 || guess <= 5 ) 
							isnumber = true;
							System.out.println("Guess again");;
							 guess = input.nextInt();}
					
						catch(InputMismatchException e) {
							System.out.println("Thats no number cheater! Try again.");
							main(args);
						}
					}
				}
			System.out.println("you win!");
		}
	}


