package com.bridgelabz.tictactoesimulator;

public class TicTacToeSimulator {

	public static void main(String[] args) {
		System.out.println("=========Welcome to Tic Tac Toe Simulator Game =======");
		char[] board=createBoard();
	}
	
	/* UC1 */
	private static char[] createBoard() {
		char[] board = new char[9];
		for(int i=0;i<board.length;i++) {
			board[i] = ' ';
		}
		return board;
	}
}
