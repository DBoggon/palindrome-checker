import java.awt.Choice;
import java.util.Arrays;
import java.util.Scanner;

public class Palindrome_Checker {

	public static void main(String[] args) {

		Boolean play = true;
		while (play) {

			Scanner scan = new Scanner(System.in);
			System.out.println("\n" + "Please enter a word to check if it's a palindrome: " + "\n");

			String userInput = scan.nextLine();
			System.out.println("\n" + palindromeCheck(userInput) + "\n");

			System.out.println("Would you like to try another word? Y/N" + "\n");
			play = scan.nextLine().trim().equalsIgnoreCase("y");

		}
		System.out.println("\n" + "Thanks for playing!");

	}

	public static String palindromeCheck(String str) {

		String result = null;

		String compareFirst = str.toLowerCase().substring(0, (str.length() / 2));
		String compareLast = null;
		int checkLength = str.length() % 2;

		if (checkLength == 0) {
			compareLast = str.toLowerCase().substring(compareFirst.length());

		} else {
			compareLast = str.toLowerCase().substring(compareFirst.length() + 1);
		}

		String[] firstChars = new String[compareFirst.length()];
		String[] lastChars = new String[compareLast.length()];

		for (int i = 0; i < compareFirst.length(); i++) {
			try {

				firstChars[i] = compareFirst.substring(i, i + 1);
				lastChars[i] = (compareLast.substring((compareLast.length() - 1) - i, (compareLast.length() - i)));

				if (Arrays.equals(firstChars, lastChars)) {
					result = str + "" + " is a palindrome!";
				}

				else {
					result = str + "" + " is not a palindrome.";
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("There was an error in your request. Please try again.");
			} catch (Exception e) {
				System.out.println("Something went wrong.");
			}
		}
		return result;
	}

}
