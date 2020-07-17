package katas.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Given a string of words, you need to find the highest scoring word.
//Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
//You need to return the highest scoring word as a string.

public class HighestScoringWord {

	public static void main(String[] args) {
		System.out.println(high("a zz sdf"));
		System.out.println(high("a b c"));
		System.out.println(high("sdf qq ps"));
	}

	public static String high(String s) {

		int score = 0;
		List<Integer> scores = new ArrayList<>();

		for (String word : s.split(" ")) {
			for (char c : word.toCharArray()) {
				for (char i = 'a'; i <= 'z'; i++) {
					if (i == c) score += (int) i - (int) 'a' + 1;
				}
			}
			scores.add(score);
			score = 0;
		}

		System.out.println(scores);
		System.out.println(s.split(" ")[scores.indexOf(Collections.max(scores))]);
		return "";
	}
}
