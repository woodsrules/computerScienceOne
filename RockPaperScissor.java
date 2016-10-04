
/*
 * (Game: scissor, rock, paper) Write a program that plays the popular 
 * scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a 
 * scissor, and a paper can wrap a rock.) The program randomly generates a 
 * number 0, 1, or 2 representing scissor, rock, and paper. The program prompts 
 * the user to enter a number 0, 1, or 2 and displays a message indicating 
 * whether the user or the computer wins, loses, or draws.
 */

import java.util.Random;

import java.util.Scanner;

public class RockPaperScissor {

public static void main(String[] args) {	
	
/* Two friends forced to do battle. 
* If we don't battle to the death, they will kill us both.
* - Cable Guy, at Medieval Times.
*/
	
// Game intro	
System.out.println("Player 1 and Frank are out on the town. They hear"
		+ " a noise coming from an \nalley they had just passed. "
		+ "Filled with curiosity, they decide to investigate. "
		+ "\nThey are ambushed by a wild group of Alphas Primitives,"
		+ " who throw them into the death ring!"
		+ "\nFrank: 'Two friends forced to do battle.'"
		+ "\nPlayer 1: 'I can't fight you, we're friends'"
		+ "\nFrank: 'If we don't battle to the death,"
		+ " they will kill us both...........'\n\n");	
	

// got the idea for a counter from Garet Crispin
int countPlayerOne = 0, countComputer = 0;
boolean repeat = false;

do { //loop causes game to continue until first to 3

	// Chooses random 0, 1, or 2 for computer.
	// http://stackoverflow.com/questions/11743267/get-random-numbers-
	// in-a-specific-range-in-java
	Random number = new Random();
	int computerSelector = 0 + number.nextInt(3);
	//System.out.println(computerSelector);

	String computerChoice = null, playerOneChoice = null;
	int playerInput;
	
	// ask for player to choose a weapon.
	Scanner input = new Scanner(System.in);
	System.out.println("Scissors [0]    Rock [1]    Paper [2] ");
	System.out.print("Player 1, choose your weapon: ");
	playerInput = input.nextInt();

	// The following group of statements cover all of the possible
	// outcomes for the computer vs. player. 
	if (computerSelector == 0 && playerInput == 0) {
		playerOneChoice = "scissors";
		computerChoice = "scissors";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " also grabs " + playerOneChoice
				+ "." + "\nIt's a tie!\n");
	}
	else if (computerSelector == 0 && playerInput == 1) {
		playerOneChoice = "rock";
		computerChoice = "scissors";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " grabs " + playerOneChoice + "."
				+ "\nPlayer one, you've taken the round!\n");
		countPlayerOne ++; // adds 1 to countPlayerOne
	}
	else if (computerSelector == 0 && playerInput == 2) {
		playerOneChoice = "paper";
		computerChoice = "scissors";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " grabs " + playerOneChoice + "."
				+ "\nPlayer one, you've lost the round!\n");
		countComputer ++; // adds 1 to countComputer
	}
	else if (computerSelector == 1 && playerInput == 0) {
		playerOneChoice = "scissors";
		computerChoice = "rock";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " grabs " + playerOneChoice + "."
				+ "\nPlayer one, you've lost the round!\n");
		countComputer ++; // adds 1 to countComputer
	}
	else if (computerSelector == 1 && playerInput == 1) {
		playerOneChoice = "rock";
		computerChoice = "rock";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " also grabs " + playerOneChoice
				+ "." + "\nIt's a tie!\n");
	}
	else if (computerSelector == 1 && playerInput == 2) {
		playerOneChoice = "paper";
		computerChoice = "rock";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " grabs " + playerOneChoice + "."
				+ "\nPlayer one, you've taken the round!\n");
		countPlayerOne ++; // adds 1 to countPlayerOne
	}
	else if (computerSelector == 2 && playerInput == 0) {
		playerOneChoice = "scissors";
		computerChoice = "paper";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " grabs " + playerOneChoice + "."
				+ "\nPlayer one, you've taken the round!\n");
		countPlayerOne ++; // adds 1 to countPlayerOne
	}
	else if (computerSelector == 2 && playerInput == 1) {
		playerOneChoice = "rock";
		computerChoice = "paper";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " grabs " + playerOneChoice + "."
				+ "\nPlayer one, you've lost the round!\n");
		countComputer ++; // adds 1 to countComputer
	}
	else if (computerSelector == 2 && playerInput == 2) {
		playerOneChoice = "paper";
		computerChoice = "paper";
		System.out.println("Frank grabs " + computerChoice + "." 
				+ " Player 1" + " also grabs " + playerOneChoice
				+ "." + "\nIt's a tie!\n");
	}
	
	// These statements control whether or not another round is played
	if (countComputer == 3) {
		repeat = true;
	}
	else if (countPlayerOne == 3) {
		repeat = true;
	}
	else {
		repeat = false;
	}
	
}while (!repeat);

if (countPlayerOne == 3){
	System.out.println("Winner, winner, chicken dinner! \nYou have"
			+ " conquered your foe." );
}
else {
	System.out.println("Better luck next time. Frank shall"
			+ " live long and prosper.");
}
}
}
