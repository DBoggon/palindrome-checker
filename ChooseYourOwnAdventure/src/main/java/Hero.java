
public class Hero {
	private String name;
	private String backStory;
	private String gender;
	private String pronouns[];
	private int classType;

	public Hero(String name, String backStory, int classType, String gender, String[] pronouns) {
		super();
		this.name = name;
		this.backStory = backStory;
		this.classType = classType;
		this.gender = gender;

	}

	Main main = new Main();

	public String getName() {
		return name;
	}

	public String gender(String userInputGender) {

		this.pronouns = new String[3];

		if (userInputGender.equalsIgnoreCase("male") || userInputGender.equalsIgnoreCase("m")
				|| userInputGender.equals("1")) {
			userInputGender = "male";
			this.pronouns[0] = "he";
			this.pronouns[1] = "him";
			this.pronouns[2] = "his";
		}
		if (userInputGender.equalsIgnoreCase("female") || userInputGender.equalsIgnoreCase("f")
				|| userInputGender.equals("2")) {
			userInputGender = "female";
			this.pronouns[0] = "she";
			this.pronouns[1] = "her";
			this.pronouns[2] = "her";
		}
		if (userInputGender.equalsIgnoreCase("neutral") || userInputGender.equalsIgnoreCase("n")
				|| userInputGender.equals("3")) {
			userInputGender = "neutral";
			this.pronouns[0] = "they";
			this.pronouns[1] = "them";
			this.pronouns[2] = "their";
		}

		return userInputGender;
	}

	String userInputClass = " ";

	public String classType(String userInputClass) {

		if (userInputClass.equalsIgnoreCase("paladin") || userInputClass.equalsIgnoreCase("p")
				|| userInputClass.equals("1")) {
			userInputClass = "Paladin";

		}
		if (userInputClass.equalsIgnoreCase("rogue") || userInputClass.equalsIgnoreCase("r")
				|| userInputClass.equals("2")) {
			userInputClass = "Rogue";

		}
		if (userInputClass.equalsIgnoreCase("archer") || userInputClass.equalsIgnoreCase("a")
				|| userInputClass.equals("3")) {
			userInputClass = "Archer";

		}

		return userInputClass;
	}

	public String backStory() {

		if (userInputClass.equals("Paladin") { 
			String backStory = "You lived without a permanent residence; I moved around a lot."
					 "You had several friends, and your childhood was generally a happy one. "
					 "You became a Noble because; Your family has a title, but none of your ancestors have distinguished themselves since we gained it."
					 "You became a Paladin because; Becoming a paladin was a natural consequence of your unwavering faith. In taking your vows, you became the holy sword of your religion."
					};

		
		if (userInputClass.equals("Rogue") { 
			backStory = "You lived on the streets. You had a few close friends and lived an ordinary childhood. 
					 	"You became a Urchin because; One day you woke up on the streets, alone and hungry, with no memory of your early childhood."
						"You became a Rogue because; You decided to turn your natural lucky streak into the basis of a career, though you still realize that improving your skills is essential."
		};

		if (userInputClass.equals("Archer") { 
			backStory = "You lived in a large house.
						"You had a few close friends and lived an ordinary childhood.
						"You became a Folk Hero because; You were always enamored by tales of heroes and wished you could be something more than ordinary.
						"You became a Ranger because; You have seen what happens when the monsters come out from the dark. "
						"You took it upon yourself to become the first line of defense against the evils that lie beyond civilization's borders."
					};

		

return backStory;
	}

//	public String userName (String userInputName) {
//			
//		userInputName = 
//		
//		
//		return userInputName;
//		
//	}
//
////	public String getBackStory() {
////		
//		
//		if (userInputClass.equals("Knight")
//		String paladin = userName(" ")
//				+ "'s curious, determined, thoughtful and perhaps a little too lonely. This isn't surprising considering for someone with "
//				+ this.pronouns[2] + " position.\r\n" + "\r\n" + this.pronouns[0]
//						+ " was born in a successful family in an average town. " + this.pronouns[0]
//								+ " lived happily until " +  this.pronouns[0] + " was about 10 years old, but at that point life changed.\r\n" + "\r\n"
//								+ this.pronouns[0] + " moved to another country and was becoming more cultured. With a great companion, "
//								+ this.pronouns[0] + " is on top of the world in a wonderful world. But with " + this.pronouns[2]
//										+ " curiosity and bravery, there's nothing to stop " + this.pronouns[1]  + " from reaching full potential. "
//										+ this.pronouns[0] + " could quickly become somebody we can expect great things of.\r\n" + "\r\n"
//										+ "But there may be more to it than this; " + this.pronouns[0] + " is currently still studying. "
//										+ this.pronouns[0] + " feels like there's more to discover in this world. Luckily " + this.pronouns[0]
//												+ " has awesome friends to support " + this.pronouns[2] + ".\r\n";
//		
//		String rogue = this.pronouns[0]
//				+ "'s curious, determined, thoughtful and perhaps a little too lonely. This isn't surprising considering for someone with "
//				+ this.pronouns[2] + " position.\r\n" + "\r\n" + this.pronouns[0]
//						+ " was born in a successful family in an average town. " + this.pronouns[0]
//								+ " lived happily until " +  this.pronouns[0] + " was about 10 years old, but at that point life changed.\r\n" + "\r\n"
//								+ this.pronouns[0] + " moved to another country and was becoming more cultured. With a great companion, "
//								+ this.pronouns[0] + " is on top of the world in a wonderful world. But with " + this.pronouns[2]
//										+ " curiosity and bravery, there's nothing to stop " + this.pronouns[1]  + " from reaching full potential. "
//										+ this.pronouns[0] + " could quickly become somebody we can expect great things of.\r\n" + "\r\n"
//										+ "But there may be more to it than this; " + this.pronouns[0] + " is currently still studying. "
//										+ this.pronouns[0] + " feels like there's more to discover in this world. Luckily " + this.pronouns[0]
//												+ " has awesome friends to support " + this.pronouns[2] + ".\r\n";
//		
//		String archer = this.pronouns[0]
//				+ "'s curious, determined, thoughtful and perhaps a little too lonely. This isn't surprising considering for someone with "
//				+ this.pronouns[2] + " position.\r\n" + "\r\n" + this.pronouns[0]
//						+ " was born in a successful family in an average town. " + this.pronouns[0]
//								+ " lived happily until " +  this.pronouns[0] + " was about 10 years old, but at that point life changed.\r\n" + "\r\n"
//								+ this.pronouns[0] + " moved to another country and was becoming more cultured. With a great companion, "
//								+ this.pronouns[0] + " is on top of the world in a wonderful world. But with " + this.pronouns[2]
//										+ " curiosity and bravery, there's nothing to stop " + this.pronouns[1]  + " from reaching full potential. "
//										+ this.pronouns[0] + " could quickly become somebody we can expect great things of.\r\n" + "\r\n"
//										+ "But there may be more to it than this; " + this.pronouns[0] + " is currently still studying. "
//										+ this.pronouns[0] + " feels like there's more to discover in this world. Luckily " + this.pronouns[0]
//												+ " has awesome friends to support " + this.pronouns[2] + ".\r\n";
//		
//		return backStory;
//	}
}
