package katas.miniProjects.ticTacToe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
	
	private StringBuilder cols = new StringBuilder(" a b c");
	private StringBuilder row1 = new StringBuilder("1 | | ");
	private StringBuilder row2 = new StringBuilder("2 | | ");
	private StringBuilder row3 = new StringBuilder("3 | | ");
	private List<StringBuilder> allRows = new ArrayList<>(Arrays.asList(cols, row1, row2, row3));
	private Map<String, Integer> colMap = new HashMap<>();
	
	public Board() {
		colMap.put("a", 1);
		colMap.put("b", 3);
		colMap.put("c", 5);
	}
	
	public List<StringBuilder> getAllRows() {
		return this.allRows;
	}
	
	public boolean isValidInput(String input) {
		if(input.matches("[a-c][1-3]")) return true;
		return false;
	}
	
	public void setPlayerMove(String input) {
		int column = colMap.get(input.substring(0,1));
		int row = Integer.parseInt(input.substring(1));
		allRows.get(row).setCharAt(column, 'x');
	}
	
	public void checkWin() {
		char[] xo = {'x','o'};
		for(char c : xo) {
			for(StringBuilder sb : getAllRows()) {
				if(sb.toString().matches("[1-3]"+c+"\\|"+c+"\\|"+c))
					System.out.println("matched");
			}
		}
		
	}
	


}
