package katas.strings;

//Your task is to convert strings to how they would be written by Jaden Smith.
// The strings are actual quotes from Jaden Smith, but they are not capitalized
// in the same way he originally typed them

// Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
// Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"

public class JadinCasingStrings {
	
	
	public static void main(String[] args) {
		System.out.println(toJadenCase("a zz sdf"));
		System.out.println(toJadenCase("a b c"));
		System.out.println(toJadenCase("Hello world my name is cortland!"));
	}

	public static String toJadenCase(String phrase) {
		if (phrase == null || phrase.equals("")) return null;
		
		StringBuilder sb = new StringBuilder();

		for (String s : phrase.split(" ")) 
			sb.append(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");		
		
		return sb.toString().trim();
	}
}
