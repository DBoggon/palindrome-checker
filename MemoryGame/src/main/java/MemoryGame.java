import java.util.Random;

public class MemoryGame {

	public static void main(String[] args) {

		CardGame cardGame = new CardGame();
								
		


		
		//cardGame.flippedCards();
		
		Random rand = new Random();
		String sym = "@!&$#";
		char randSym = sym.charAt(rand.nextInt(sym.length()));
		char[] cardFlipRand = {randSym};
		
		System.out.println(cardFlipRand[0]);
		
		
		
		

	}

}

