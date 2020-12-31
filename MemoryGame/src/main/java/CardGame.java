import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CardGame {

	private String card[];
	Integer choice;

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

			String[][] deckArr = { firstRow, midRow, midRow2, botRow };
		}
		
		for (int i = 0; i < deckArr.length; i++) {
			if (choice.equals(deckArr[i])) {
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

