package com.bridgelabz.tictactoesimulator;

import java.util.Scanner;

public class TicTacToeSimulator {
	
	
	public static void main(String[] args) {
		System.out.println("========= Welcome to Tic Tac Toe Simulator Game =======");
		
		
		char playerchoice = chooseLetter();
		char computerchoice = ( playerchoice == 'X' ) ? 'O' : 'X';
		
		System.out.println(playerchoice);
		System.out.println(computerchoice);
		
		System.out.println("Your Blank Gamming Board is here");
		showBoard();
	}
	
	/* UC1 */
	private static char[] createBoard() {
		char[] board = new char[9];
		for(int i=0;i<board.length;i++) {
			board[i] = ' ';
		}
		return board;
	}
	/* UC2 */
	private static char chooseLetter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice X or O ::");
		char playerturn=scanner.next().toUpperCase().charAt(0);
		return playerturn;
	
	}
	/* UC# */
	
	static void showBoard() {
		char[] board=createBoard();
		System.out.println("\t/---|---|---\\");
		System.out.println("\t| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("\t|-----------|");
		System.out.println("\t| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("\t/---|---|---\\");
	}

}
