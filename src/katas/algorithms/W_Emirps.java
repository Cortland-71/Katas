package katas.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class W_Emirps {
	public static void main(String[] args) {
		findEmirp(200);

	}

	public static long[] findEmirp(long n) {
		System.out.println(n);
		List<Long> primeList = new ArrayList<>();
		List<Long> emirpList = new ArrayList<>();
		List<Long> finalAnswers = new ArrayList<>();

		for (long i = 10; i < n; i++) {
			if (isPrime(i)) {
				primeList.add(i);
				if(isEmirp(i)) {
					emirpList.add(i);
				}
			}
		}

		System.out.println();
		System.out.println("Primes: " + primeList);
	    System.out.println();
		System.out.println("Emirps: " + emirpList);
		
		finalAnswers.add((long)emirpList.size());
		finalAnswers.add(Collections.max(emirpList));
		finalAnswers.add(emirpList.stream().mapToLong(i->i).sum());
		
		System.out.println("Output: " + finalAnswers);
		return finalAnswers.stream().mapToLong(e->(long)e).toArray();
	}

	private static boolean isPrime(long i) {
		for (int j = 2; j < i; j++)
			if (i % j == 0) return false;
		return true;
	}

	private static boolean isEmirp(long i) {
		StringBuilder reversed = new StringBuilder(String.valueOf(i)).reverse();
		if(i != Long.parseLong(reversed.toString())) {
			if(isPrime(Long.parseLong(reversed.toString()))) {
				return true;
			}
		}
		return false;
	}
	

}
