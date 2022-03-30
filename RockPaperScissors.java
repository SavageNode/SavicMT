package advancedhw;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int yes = 1;
		int playAgain;
		
		playGame();
		
		System.out.println("Would you like to play again? 1:yes or 2:no: ");
		playAgain = in.nextInt();
		
		if(playAgain == 1) {
			while(yes != 2) {
				System.out.println("Would you like to play again? 1:yes or 2:no ");
				playAgain = in.nextInt();
				if(playAgain == 2) {
					yes = 2;
				}else {
					playGame();
				}
			}
		}
		
	}
	public static void playGame() {
		Scanner in = new Scanner(System.in);
		
		// Get user input for how many rounds you want to play
		System.out.println("How many rounds would you like to play? pick from 1 - 10");
		int rounds = in.nextInt();
		int i = 1;
		int user;
		int comp;
		
		int userWins = 0;
		int computerWins = 0;
		int ties = 0;
		
		Random rand = new Random();
		
		//check for correct number of rounds
		if(rounds < 1 | rounds > 10) {
			//incorrect amount of rounds msg
			System.out.println("Incorrect number of rounds, ending match");
		}else {
			//correct number of rounds plays the game
			while(i<=rounds) {
				//user input for choice
				System.out.println("Enter a number for 1:Rock, 2:Paper, 3:Scissors: ");
				user = in.nextInt();
				System.out.println("\nUsers Choice: " + user);
				//random computer choice
				comp = rand.nextInt((3 - 1) + 1) + 1;
				System.out.println("Computers Choice: " + comp + "\n");
				
				//Check who won
				if(user == comp) {
					System.out.println("You Tied The Computer!\n");
					ties++;
				}
				if(user == 1 & comp == 3) {
					System.out.println("User has won this round! Rock Beats Scissors\n");
					userWins++;
				}
				if(comp == 3 & user == 1) {
					System.out.println("Computer has won this round! Rock Beats Scissors\n");
					computerWins++;
				}
				if(user == 2 & comp == 1) {
					System.out.println("User has won this round! Paper Beats Rock\n");
					userWins++;
				}
				if(comp == 2 & user == 1) {
					System.out.println("Computer has won this round! Paper Beats Rock\n");
					computerWins++;
				}
				if(user == 3 & comp == 2) {
					System.out.println("User has won this round! Scissors Beats Paper\n");
					userWins++;
				}
				if(comp == 3 & user == 2) {
					System.out.println("Computer has won this round! Scissors Beats Paper\n");
					computerWins++;
				}
				
				
					
				i++;
				
			}
			System.out.println("Total User Wins: " + userWins + "\nTotal Computer Wins: " + computerWins + "\nTotal Ties: " + ties);
			if(userWins > computerWins) {
				System.out.println("User Has Won The  Game");
			}else if(userWins < computerWins) {
				System.out.println("Computer Has Won The  Game");
			}else {
				System.out.println("Game has ended in a tie!");
			}
		}
	}
}
