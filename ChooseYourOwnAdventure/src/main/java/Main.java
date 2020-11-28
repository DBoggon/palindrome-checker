import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Hero hero = new Hero(null, null, 0, null, args);
		
		System.out.println("Welcome traveler...\n");
		Scanner UserInput = new Scanner(System.in);
		System.out.println("What is your name? \n");
		String userInputName = UserInput.nextLine();
		hero.userName(userInputName);
		
		System.out.println("\nWhat gender do you identity as " + hero.userName(userInputName) + "? \n" + "\n 1. (M)ale \n 2. (F)emale \n 3. Gender (N)eutral \n");
		String userInputGender = UserInput.nextLine();
		hero.gender(userInputGender);
		
		
		System.out.println("\nAre you more of a stabby fronty, stabby backy or stabby from a distancey kinda player?\n\n 1. I like to get up close and personal! (Knight) \n 2. Straight up backstabber. I have no shame. (Rogue) \n 3. I'd rather not get too close to my victim. (Archer)\n");
		String userInputClass = UserInput.nextLine();
		hero.classType(userInputClass);
		
		System.out.println(hero.getBackStory());
		 
		
		
		
	}

	
}
