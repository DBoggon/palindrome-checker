import java.util.Random;
import java.util.Scanner;

public class MatchingCardGame {

	public static void main(String[] args) {
		CardGame cardGame = new CardGame();
		System.out.println("\n" + "********************MATCHING************************");
		System.out.println("**********************CARD**************************");
		System.out.println("**********************GAME***************************" + "\n");
		
		System.out.println("Please select a card (1-12)");
		cardGame.deckOfCards();
		
		
		
		Scanner scan = new Scanner(System.in);
		Integer user = scan.nextInt();
		user = cardGame.choice;
		
		
		
		
								
		
		
				
		


	
		

	}

}

