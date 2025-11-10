public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;

    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);
        this.username = PoolUtils.generateUsername(name);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsChemicalCheck = false;
    }

    public Pool() {
        this.name = "Rose Gott";
        this.ownerName = "Jojo Gott";
        this.username = PoolUtils.generateUsername(name);
        this.cleanlinessLevel = 9;
        this.needsChemicalCheck = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }

    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public String toString() {
		String lineOne = "== ABOUT " + getName() + " ==\n";
		String lineTwo = "Name: " + getName() + "\n";
		String lineThree = "Owner: " + getOwnerName() + "\n";
		String lineFour = "Username: " + getUsername() + "\n";
        String lineFive = "Cleanliness Level: " + getCleanlinessLevel();
        if (isNeedsChemicalCheck() == false) {
            String lineSix = "Does pool need chemical check? No";
        } else {
            String lineSix = "Does pool need chemical check? Yes";
        }
		return (lineOne + lineTwo + lineThree + lineFour + lineFive + lineSix);
	}

    public boolean equals(Pool other) {
        if (this.toString().equals(other.toString())) {
            return true;
        } else {
            return false;
        }
    }

    


}
