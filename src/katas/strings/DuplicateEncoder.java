package katas.strings;

//The goal of this exercise is to convert a string to a new 
//string where each character in the new string is "(" if that 
//character appears only once in the original string, or ")" if 
//that character appears more than once in the original string. 
//Ignore capitalization when determining if a character is a duplicate.

public class DuplicateEncoder {
	
	public static void main(String[] args) {
		System.out.println(encode("abcc"));
	}
	
	public static String encode(String word){
	    
		StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0; i < word.length(); i++) {
	    	
			for (int j = i+1; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) sb.append(")");
				else sb.append("(");
			}
		}
	    System.out.println(sb.toString());
	    return "";
	  }

}
