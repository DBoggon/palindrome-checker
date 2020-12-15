import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CardGame {

	private String card[];

	public void deckOfCards() {

		String[] card = { "   ___", "  |  |", "  |__|" };
		String[] firstRow = null;
		String[] midRow = null;
		String[] midRow2 = null;
		String[] botRow = null;
		
		for (String a : card) {
			firstRow = new String[] { a, a, a };
			System.out.println(firstRow[0] + firstRow[1] + firstRow[2]);
		}
		for (String b : card) {
			midRow = new String[] { b, b, b };
			System.out.println(midRow[0] + midRow[1] + midRow[2]);
		}
		for (String c : card) {
			midRow2 = new String[] { c, c, c };
			System.out.println(midRow2[0] + midRow2[1] + midRow2[2]);
		}
		for (String d : card) {
			botRow = new String[] { d, d, d };
			System.out.println(botRow[0] + botRow[1] + botRow[2]);
		}
		String[][] deckArr = { firstRow, midRow, midRow2, botRow };

	}
	
	public void flippedCards() {
//		String[] cardFlipped = { "@", "!", "&", "%", "$", "#"};
//		int idx = new Random().nextInt((cardFlipped.length));
//		String randomSyms = (cardFlipped[idx]);
		
		Random rand = new Random();
		String sym = "@!&$#";
		char randSym = sym.charAt(rand.nextInt(sym.length()));
		char[] cardFlipRand = {randSym};
		
		
		char[][] firstRowFlip = null;
		char[] midRowFlip = null;
		char[] midRowFlip2 = null;
		char[] botRowFlip = null;

		for (char a : cardFlipRand) {
			firstRowFlip = new String [][] { a[a], a[a], a[a] };
			System.out.println(firstRowFlip[0][0] + firstRowFlip[0][1] + firstRowFlip[0][2]);
		}
		for (char b : cardFlipRand) {
			midRowFlip = new char[] { b, b, b };
			System.out.println(midRowFlip[0] + midRowFlip[1] + midRowFlip[2]);
		}
		for (char c : cardFlipRand) {
			midRowFlip2 = new char[] { c, c, c };
			System.out.println(midRowFlip2[0] + midRowFlip2[1] + midRowFlip2[2]);
		}
		for (char d : cardFlipRand) {
			botRowFlip = new char[] { d, d, d };
			System.out.println(botRowFlip[0] + botRowFlip[1] + botRowFlip[2]);
		}
		char[][] deckFlippedArr = { firstRowFlip, midRowFlip, midRowFlip2, botRowFlip };
	
	}
	

	// logic to filp card users selects
	public void flipCard() {
		int choice = 0;
		int secondChoice = 0;

		if (deckOfCards.containsKey(choice)) {
			for (int i = 0; i < choice; i++) {
				if (choice == i) {
					System.out.println("You've selected " + choice + ". \n");
					System.out.println("Please pick another card.");
				} else {
					System.out.println("Invalid Selection. Please pick a card betweem 1-12.");
				}
				if (secondChoice <= 12 && secondChoice > 0 && secondChoice != choice) {
					for (int j = 0; j < secondChoice; j++) {
						if (secondChoice == j) {
							System.out.println("Need logic if cards match/don't match");
						} else {
							System.out.println("Invalid Selection. Please pick a card betweem 1-12.");
						}
					}
				}
			}
		}
	}

//	@Override
//	public String toString() {
//		return "Cards [memoryCards=" + Arrays.toString(memoryCards) + ", card=" + card + "]";
//	}
}
