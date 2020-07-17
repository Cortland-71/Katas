package katas.strings;

//Given a string, detect whether or not it is a pangram. 
//Return True if it is, False if not. Ignore numbers and punctuation.

public class DetectPangram {
	
	public static void main(String[] args) {
		
		System.out.println(check("the quick brown fox jumps over the lazy dog"));
		System.out.println(check("abcdefghijklmnopqrstuvwxyz"));
		System.out.println(check("123 456 789"));
		System.out.println(check("abcdef"));
	}
	
	public static boolean check(String sentence){
		for (char i = 'a'; i <= 'z'; i++) 
			if(!sentence.toLowerCase().contains(String.valueOf(i))) 
				return false;
		return true;
	}
}
