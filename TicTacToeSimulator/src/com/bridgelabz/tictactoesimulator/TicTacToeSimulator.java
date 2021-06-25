package com.bridgelabz.tictactoesimulator;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToeSimulator {
	
	static Scanner scanner = new Scanner(System.in);
	static String[] board = new String[9];
	
	public static void main(String[] args) {
		System.out.println("========= Welcome to Tic Tac Toe Simulator Game =======");
		
		String playerChoice = chooseLetter();
		//String computerChoice = "X";
		String computerChoice = ( playerChoice.equalsIgnoreCase("X")) ? "O" : "X";
		
		
		System.out.println("Player choice is ::"+playerChoice);
		System.out.println("Computer choice is ::"+computerChoice);
		
		String[] board=createBoard();
		
		System.out.println("Your Blank Gamming Board is here");
		showBoard();
		
		System.out.println("checkwinner :: "+checkWinner());
		
			if(tossFirst())
			{	
				while(checkWinner() == null) {
					playerPlace(board,playerChoice);
			}
			if (checkWinner().equalsIgnoreCase("draw")) {
				System.out.println("It's a draw! Thanks for playing.");
			} else {
				System.out.println("Congratulations! " + checkWinner()  + "'s have won! Thanks for playing.");
			}
		}
	}
	
	/* UC1 */
	private static String[] createBoard() {
		for(int i=0;i<board.length;i++) {
			board[i] = String.valueOf(' ');
		}
		return board;
	}
	/* UC2 */
	private static String chooseLetter() {
		
		System.out.println("Enter your choice X or O ::");
		String playerturn=scanner.next().toUpperCase();
		return playerturn;
	
	}
	/* UC3 */
	private static void showBoard() {
		System.out.println("\t/---|---|---\\");
		System.out.println("\t| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("\t/---|---|---\\");
	}
	/* UC4 */
	private static void playerPlace(String[] board2,String playerchoice)
	{
		
		boolean playerplay = true;
		
		while (playerplay) {
		
			System.out.println("Enter where player want to place his symbol :: ");
			int playerplace = scanner.nextInt()-1;
			
			if(board2[playerplace].equalsIgnoreCase(" "))
			{
				board2[playerplace] = playerchoice;
				playerplay = false;
			}
			else
			{
				System.out.println("Opps !! You just tried to Cheat");
			}
			
		}
		showBoard();
		
	}
	
	/* UC5 */
	private static boolean checkspace(String[] board2) {
		
		boolean isSpaceOccupied = true;
		int numberOfFreeSpace = 0;
		
		for (int index = 1; index < board2.length; index++)
		{
			if(board2[index] == " ")
			{
				numberOfFreeSpace++;
			}
		}
		if(numberOfFreeSpace == 0)
		{
			isSpaceOccupied=false;
		}
		return isSpaceOccupied;
	}
	
	/* UC6 */
	private static boolean tossFirst() {
		int toss = (int)Math.floor(Math.random() *10) % 2 ;
		int playerOwn = 1;
		boolean playerPlay;
		if (toss == playerOwn ) 
		{
			playerPlay = true;
			System.out.println("You Will play First  ");
		} 
		else 
		{
			playerPlay = false;
			System.out.println("Computer Will play First ");
		}
		return playerPlay;
	}
	
	/* UC7 */

	static String checkWinner() 
	{
		String line = null;
		for (int a = 0; a < 8; a++) 
		{
			switch (a) 
			{
				case 0:
					line = board[0] + board[1] + board[2];
					break;
				case 1:
					line = board[3] + board[4] + board[5];
					break;
				case 2:
					line = board[6] + board[7] + board[8];
					break;
				case 3:
					line = board[0] + board[3] + board[6];
					break;
				case 4:
					line = board[1] + board[4] + board[7];
					break;
				case 5:
					line = board[2] + board[5] + board[8];
					break;
				case 6:
					line = board[0] + board[4] + board[8];
					break;
				case 7:
					line = board[2] + board[4] + board[6];
					break;
				}
				if (line.equals("XXX")) {
					return "X";
				} else if (line.equals("OOO")) {
					return "O";
				}
			}
		for (int a = 0; a < 9; a++) {
			if (Arrays.asList(board).contains(String.valueOf(" "))) {
				break;
			}
			else if (a == 8) return "draw";
		}
		return null;
	}
	
}
