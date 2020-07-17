package katas.strings;

import java.util.Arrays;

//The goal of this exercise is to convert a string to a new 
//string where each character in the new string is "(" if that 
//character appears only once in the original string, or ")" if 
//that character appears more than once in the original string. 
//Ignore capitalization when determining if a character is a duplicate.

public class DuplicateEncoder {

	public static void main(String[] args) {
		System.out.println(encode("*8Vej1/*5"));
		System.out.println(encode("abcdabbc"));
		System.out.println(encode("(()(("));
		System.out.println(encode("Prespecialized"));
		System.out.println(encode("X7gl("));
		System.out.println(encode(" ( ( )"));
		System.out.println(encode("Supralapsarian"));
	}

	public static String encode(String word) {
		word = word.toLowerCase();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < word.length(); i++) {
			boolean duplicateInFront = word.substring(i+1).contains(String.valueOf(word.charAt(i)));
			boolean duplicateInTail = word.substring(0,i).contains(String.valueOf(word.charAt(i)));
			boolean hasMultiple = duplicateInFront || duplicateInTail ? true : false;
			sb.append(hasMultiple ? ')' : '(');
		}
		return sb.toString();
	}
}
