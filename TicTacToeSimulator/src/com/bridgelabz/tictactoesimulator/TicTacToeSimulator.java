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
		
		while(checkspace(board))
		{
			playerPlace(board,playerChoice);
		}
	}
	
	/* UC1 */
	private static String[] createBoard() {
		for(int i=0;i<board.length;i++) {
			board[i] = " ";
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
			
			if(board2[playerplace] == " ")
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
			System.out.println("Board is full.");
			isSpaceOccupied=false;
		}
		return isSpaceOccupied;
	}

	
}
