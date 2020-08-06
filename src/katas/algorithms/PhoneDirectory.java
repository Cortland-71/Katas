package katas.algorithms;

import java.util.Arrays;

//Write a function that accepts an array of 10 integers 
//(between 0 and 9), that returns a string of those numbers 
//in the form of a phone number.
//int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0} => returns "(123) 456-7890"

public class PhoneDirectory {

	public static void main(String[] args) {
		createPhoneNumber(new int[] {1,2,3,4,5,6,7,8,9,1});
	}
	
	public static String createPhoneNumber(int[] numbers) {
		StringBuilder sb = new StringBuilder(Arrays.toString(numbers).replaceAll("[\\[\\],\\s]", ""));
	    return sb.insert(0, "(").insert(4, ") ").insert(9, "-").toString();
	}
}
