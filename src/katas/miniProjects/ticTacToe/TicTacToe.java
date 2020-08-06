package katas.miniProjects.ticTacToe;

import java.util.Scanner;

public class TicTacToe {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Board board = new Board();
		boolean running = true;
		
		while(running) {
			board.getAllRows().forEach(System.out::println);
			System.out.print("\nEnter column followed by row:");
			String input = sc.nextLine().toLowerCase().trim();
			
			if(!board.isValidInput(input)) {
				System.out.println("Invalid input, try again.");
				continue;
			}
			board.setPlayerMove(input);
			board.checkWin();
		}
		
		sc.close();
		
	}
	
	
	
	

}
