package com.bridgelabz.tictactoesimulator;

import java.util.Scanner;

public class TicTacToeSimulator {
	
	static Scanner scanner = new Scanner(System.in);
	static char[] board = new char[9];
	
	public static void main(String[] args) {
		System.out.println("========= Welcome to Tic Tac Toe Simulator Game =======");
		
		char playerchoice = chooseLetter();
		char computerchoice = ( playerchoice == 'X' ) ? 'O' : 'X';
		
		System.out.println("Player choice is ::"+playerchoice);
		System.out.println("Computer choice is ::"+computerchoice);
		
		char[] board=createBoard();
		
		System.out.println("Your Blank Gamming Board is here");
		showBoard();
		
		playerPlace(board,playerchoice);
		
	}
	
	/* UC1 */
	private static char[] createBoard() {
		for(int i=0;i<board.length;i++) {
			board[i] = ' ';
		}
		return board;
	}
	/* UC2 */
	private static char chooseLetter() {
		
		System.out.println("Enter your choice X or O ::");
		char playerturn=scanner.next().toUpperCase().charAt(0);
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
	private static void playerPlace(char board[],char playerchoice)
	{
		
		boolean playerplay = true;
		
		while (playerplay) {
		
			System.out.println("Enter where player want to place his symbol :: ");
			int playerplace = scanner.nextInt()-1;
			
			if(board[playerplace] == ' ')
			{
				board[playerplace] = playerchoice;
				playerplay = false;
			}
			else
			{
				System.out.println("Opps !! You just Put the wrong Input");
			}
			
		}
		showBoard();
		
	}

}
