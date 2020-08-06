package katas.algorithms;

import java.util.*;

public class Permutations {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		singlePermutations("", "abcd", list);
		Set<String> list2 = new HashSet<>(list);
		list = new ArrayList<>(list2);
		System.out.println(list);
	}
	
	public static void singlePermutations(String f, String r, List<String> list) {
		if(r.length() == 0) { list.add(f); return; }
		for (int i = 0; i < r.length(); i++) {
			singlePermutations(f + r.charAt(i), r.substring(0, i) + r.substring(i+1), list);
		}
	}
}
