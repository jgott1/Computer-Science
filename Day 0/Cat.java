public class Cat {
	private String name;
	private String ownerName;
	private int moodLevel;
	private int catId;
	private char catChar;
	private boolean isHungry;

	public Cat(String name, String ownerName, int moodLevel, String catId) {
		this.name = name;
		this.ownerName = ownerName;
		this.moodLevel = validateMoodLevel();
		this.catId = validateCatId();
		this.catChar = generateCatChar();
		this.isHungry = true;
	}

	public Cat() {
		this.name = "Jojo";
		this.ownerName = "Rose";
		this.moodLevel = 5;
		this.catId = 1234;
		this.catChar = generateCatChar();
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

	public int getCatId() {
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

	public void validateMoodLevel(int moodLevel) {
		if (moodLevel < 0) {
			moodLevel = 0;
			this.moodLevel = moodLevel;
		}
		if (moodLevel > 10) {
			moodLevel = 10;
			this.moodLevel = moodLevel;
		} else {
			this.moodLevel = moodLevel;
		}
	}

	public void validateCatId(int catId) {
		
		//ValidateThis using the random thing in perfectUtils
	}

	public void setCatChar(char catChar) {
		this.catChar = catChar;
	}

	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}

	

}