public class Cat {
	private String name;
	private String ownerName;
	private int moodLevel;
	private String catId;
	private char catChar;
	private boolean isHungry;

	public Cat(String name, String ownerName, int moodLevel, String catId) {
		this.name = name;
		this.ownerName = ownerName;
		this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
		this.catId = PurrfectUtils.validateCatId(catId);
		this.catChar = PurrfectUtils.generateCatChar(catId);
		this.isHungry = true;
	}

	public Cat() {
		this.name = "Jojo";
		this.ownerName = "Rose";
		this.moodLevel = 5;
		this.catId = "1234";
		this.catChar = PurrfectUtils.generateCatChar(catId);
		this.isHungry = true;
	}

	public String getName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public int getMoodLevel() {
		return moodLevel;
	}

	public String getCatId() {
		return catId;
	}

	public char getCatChar() {
		return catChar;
	}

	public boolean isHungry() {
		return isHungry;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setMoodLevel(int moodLevel) {
		this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
	}

	public void setCatId(String catId) {
		this.catId = PurrfectUtils.validateCatId(catId);
	
	}

	public void setCatChar(char catChar) {
		this.catChar = catChar;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	public String generateCatTag() {
		return (catId + catChar);
	}

	public String toString() {
		String lineOne = "== ABOUT " + getName() + " ==\n";
		String lineTwo = getName() + " is a cat.\n";
		String lineThree = "Their tag is " + generateCatTag() + ".\n";
		String lineFour = PurrfectUtils.determineCatMood(this) + ".";
		return (lineOne + lineTwo + lineThree + lineFour);
	}

	public boolean equals(Cat other) {
		if (this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
			&& this.moodLevel == other.moodLevel
			&& this.generateCatTag().equals(other.generateCatTag())
			&& this.isHungry == other.isHungry){
			return true;
		} else {
			return false;
		}
	}

	

}