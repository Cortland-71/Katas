package katas.numbers;

import java.math.BigInteger;

public class TrailingZerosOfN {
	
	public static void main(String[] args) {
		
		int num = 27;
		int numZeros = 0;
		
		for (int i = 0; i <=num; i++) {
			System.out.println(i + " " + fact(new BigInteger(String.valueOf(i))));
		}
//		
		
		for (int i = 0; i < num; i+=5) {
			if(numZeros / 5 > 0) {
				numZeros++;
				continue;
			}
			numZeros++;
			
			
			
			
			
			
			System.out.println("group: " + i);
			System.out.println("NumZeros: " + numZeros);
		}

		
	System.out.println(numZeros);	
	}
	
	public static int zeros(int original) {
	     
		int counter = 0;
		int quant = 1;
	    for (int i = 5; i < original; i+=5) {
	    	counter++;
	    	if(counter % 25 == 0) counter++;
			
		}
	    return counter;
	  }
	
	public static BigInteger fact(BigInteger bi) {
		if(bi.compareTo(new BigInteger("2")) == -1) return new BigInteger("1");
		return bi = bi.multiply(fact(bi.subtract(new BigInteger("1"))));
		
		
	}
	  

}
