package guessinggame;
import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;
public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 10");
			int userguess = input.nextInt();
			int answer1 = (int)(Math.random() * 10 + 1);
			checkWin(userguess,answer1);
			System.out.println("you win!");
	}
	public static void checkWin(int guess, int answer){
		Scanner input = new Scanner(System.in);
		while(guess != answer) {
			boolean isnumber = false;
			while(!isnumber)
			{
				try {
					if(guess > 5 || guess <= 5 ) {
						isnumber = true;
						System.out.println("Guess again");
						 guess = input.nextInt();
						 }
				}
				
					catch(InputMismatchException e) {
						System.out.println("Thats no number cheater! Try again.");
						checkWin(guess,answer);
					}
				}
		}
	
	}}
	/*DANK MEMaEMs899k9s9*/

