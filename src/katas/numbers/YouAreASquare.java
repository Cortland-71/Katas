package katas.numbers;

//Given an integral number, determine if it's a square number

public class YouAreASquare {
	public static boolean isSquare(int n) { 
		long a = (long)Math.sqrt(n);
		return (a * a == n) ? true : false;
	}
}
