public class Cat {
    //1. Made 'public' lowercase.
    //2. Changed Cats to Cat.
	private String name;
	private String breed;
	private boolean isHungry;
	private int livesRemaining;
	
	// 2-Parameter Constructor
	public Cat(String name, String breed) {
        //3. Added String breed.
		this.name = name;
        //4. Added 'this.'
		this.breed = breed;
        //5. Added 'this.'
		this.isHungry = true;
        //6. Changed yes to true.
		livesRemaining = 9;
	}

	public String getName() {
        //7. Changed void to String.
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getIsHungry() {
        //8. Capitalized I and H.
        //9. Changed void to Boolean.
        //10. Added a space in between ) and {.
		return isHungry;
	}

	public void feed() {
        //11. Changed boolean to void.
		this.isHungry = false;
	}

	public boolean equals(Cat otherCat) {
        //12. Added Cat to other
		if (this.name == otherCat.name && this.breed.equals(otherCat.breed)
			&& this.livesRemaining == otherCat.livesRemaining) {
                return true;
            } else {
                return false;
            }
        //13. Added an equal sign after livesRemaining.
        //14. Changed it to an if else (instead of it returning a String).
	}

	public String toString() {
		return (name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.");
        //15. Changed System.out.println to return.
	}
}