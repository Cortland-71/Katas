package katas.numbers;


//Write a method that takes an array of consecutive (increasing) 
//letters as input and that returns the missing letter in the array.

//You will always get an valid array. And it will be always 
//exactly one letter be missing. The length of the array will 
//always be at least 2.
//The array will always contain letters in only one case.

//Example:

//['a','b','c','d','f'] -> 'e' ['O','Q','R','S'] -> 'P'


public class Missing {
	public static void main(String[] args) {
		findMissingLetter(new char[] {'a','b','c','d','f'});
		System.out.println();
		findMissingLetter(new char[] {'Q','R','T','U','V'});
	}
	
	public static char findMissingLetter(char[] array) {
		for (int j = 0; j < array.length-1; j++) 
			if(array[j+1] - array[j] != 1) 
				return (char)(array[j+1]-1);
	    return ' ';
	}
}
