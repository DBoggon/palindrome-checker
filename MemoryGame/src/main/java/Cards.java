import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Cards {

	private String card[];

	public void deckOfCards() {

		String[] card = { "   ___", "  |  |", "  |__|" };
		String[] firstRow;
		String[] midRow;
		String[] botRow;

		for (String a : card) {
			firstRow = new String[] { a, a, a };
			System.out.println(firstRow[0] + firstRow[1] + firstRow[2]);
		}
		for (String b : card) {
			midRow = new String[] { b, b, b };
			System.out.println(midRow[0] + midRow[1] + midRow[2]);
		}
		for (String c : card) {
			botRow = new String[] { c, c, c };
			System.out.println(botRow[0] + botRow[1] + botRow[2]);
		}

//		String[][] deckArr = { firstRow, midRow, botRow };
//		// String line = scanner.nextLine();
//
//		if (deckArr[3].equals("Chip")) {
//			Sellables chips = new Chips(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3],
//					"Crunch Crunch, Yum!");
//			sellablesList.add(chips);
//		}
//		if (snackArr[3].equals("Candy")) {
//			Sellables candy = new Candy(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3],
//					"Munch Munch, Yum!");
//			sellablesList.add(candy);
//		}
//		if (snackArr[3].equals("Gum")) {
//			Sellables gum = new Gum(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3],
//					"Chew Chew, Yum!");
//			sellablesList.add(gum);
//		}
//		if (snackArr[3].equals("Drink")) {
//			Sellables drink = new Drink(snackArr[1], Double.parseDouble(snackArr[2]), snackArr[0], 5, snackArr[3],
//					"Glug Glug, Yum!");
//			sellablesList.add(drink);
//		}

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
