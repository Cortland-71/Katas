package katas.numbers;

import java.math.BigInteger;

public class W_TrailingZerosOfN {
	
	public static void main(String[] args) {
		
		int num = 100;
		int numZeros = -1;
		
		for (int i = 0; i <=num; i++) {
			System.out.println(i+1 + " " + fact(new BigInteger(String.valueOf(i))));
		}
		System.out.println("".length());

		
		int counter = 0;
		for (int i = 0; i <= num; i+=5) {
			counter++;
			if(counter == 6) {
				counter = 0;
				numZeros++;
			}
			
			numZeros++;
//			System.out.println("group: " + i);
//			System.out.println("NumZeros: " + numZeros);
		}

		
	System.out.println(numZeros);	
	}
	
	
	public static BigInteger fact(BigInteger bi) {
		if(bi.compareTo(new BigInteger("2")) == -1) return new BigInteger("1");
		return bi = bi.multiply(fact(bi.subtract(new BigInteger("1"))));
		
		
	}
	  

}
