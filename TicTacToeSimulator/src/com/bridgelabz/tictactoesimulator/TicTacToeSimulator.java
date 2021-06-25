package com.bridgelabz.tictactoesimulator;

import java.util.Scanner;

public class TicTacToeSimulator {
	
	public static void main(String[] args) {
		System.out.println("========= Welcome to Tic Tac Toe Simulator Game =======");
		char[] board=createBoard();
		
		char playerchoice = chooseLetter();
		
		System.out.println("you choose ::"+playerchoice);
		if(playerchoice == 'X') {
			char computerchoice = 'O';
			System.out.println("Computer Will be :: "+computerchoice);
		}
		else {
			char computerchoice = 'Y';
			System.out.println("Computer Will be :: "+computerchoice);
		}
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
	
	

}
