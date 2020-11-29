import com.sun.jdi.ClassType;

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

	public String getName() {
		return name;
	}
	

	public void setName(String userInputName) {
		this.name = userInputName;
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

	public String backStory(String userInputClass) {

		if (userInputClass.equals("Paladin")) { 
			 System.out.println("\n " + this.name  + " lived without a permanent residence; "+ this.pronouns[0]  + "  moved around a lot.\r\n" + 
			 		 this.pronouns[0]  + " had several friends, and  "+ this.pronouns[2]  + " childhood was generally a happy one.\r\n" + 
			 		 this.pronouns[0] + " became a Noble because;  "+ this.pronouns[2]  + " family had a title, but none of  "+ this.pronouns[0]  +" ancestors have distinguished themselves since they gained it.\r\n" + 
			 		 this.pronouns[0] + " became a Paladin because; Becoming a paladin was a natural consequence of  "+ this.pronouns[0]  +"  unwavering faith. \r\n" + 
			 		"In taking " + this.pronouns[0]  + " vows, "+ this.pronouns[0] + " became the holy sword of " + this.pronouns[2] + " religion.");
			}

		
		if (userInputClass.equals("Rogue")) { 
			 System.out.println("\n " + this.name  +" lived on the streets. "+ this.pronouns[0]  +" had a few close friends and lived an ordinary childhood. \r\n" + 
					 this.pronouns[0]  + " became a Urchin because; One day "+ this.pronouns[0]  +" woke up on the streets, alone and hungry, with no memory of "+ this.pronouns[2]  +" early childhood.\r\n" + 
					 this.name  + " became a Rogue because; "+ this.pronouns[0]  +"  decided to turn "+ this.pronouns[2]  +" natural lucky streak into the basis of a career, though "+ this.name  +" still realize that improving "+ this.pronouns[2]  +" skills is essential.\r\n"); 
			}

		if (userInputClass.equals("Archer")) { 
			System.out.println("\nYou lived in a large house.\r\n" + 
					"You had a few close friends and lived an ordinary childhood.\r\n" + 
					"You became a Folk Hero because; You were always enamored by tales of heroes and wished you could be something more than ordinary.\r\n" + 
					"You became a Ranger because; You have seen what happens when the monsters come out from the dark. \"\r\n" + 
					"You took it upon yourself to become the first line of defense against the evils that lie beyond civilization's borders.");
			}

		return backStory;
	}


}
