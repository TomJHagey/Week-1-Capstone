import java.util.Scanner;

public class CapstoneOne {

	public static void main(String[] args) {

		translate(4);

	}

	public static void translate(int pigLatin) {

		Scanner scnr = new Scanner(System.in);

		// I think this technically meets expectations, despite the odd prompt

		String userWantsToPlay = "y";
		while (userWantsToPlay.startsWith("y")) {

			System.out.println(
					"Please, type in a word, then press enter. Afterwards, enter in the same word (it must be typed identically, including all case changes) and press enter and the word entered (twice) will be converted to pig latin: ");

			String word1 = scnr.next();
			String word2 = scnr.next();

			char a = 'a';
			char e = 'e';
			char i = 'i';
			char o = 'o';
			char u = 'u';

			int pigTwo = 0;
			int firstVowel = 0;
			int end = word1.length();

			for (int j = 0; j < end; j++) {
				char c = word1.charAt(j);
				if (c == a || c == e || c == i || c == o || c == u) {
					firstVowel = j;

					break;
				}

			}
			if (pigTwo != firstVowel) {
				String startString = word1.substring(firstVowel, end);
				String endString = word1.substring(pigTwo, firstVowel) + "ay";
				System.out.println(startString.toLowerCase() + endString.toLowerCase());

			} else {
				System.out.println(word2.toLowerCase() + "way");

			}
			System.out.println("Type another word? (y/n)");
			userWantsToPlay = scnr.next();
		}
	}
}