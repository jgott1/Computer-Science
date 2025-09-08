public class Plant {

    private String theLeaves; // = "contains leaves";
    private double estimatedHeight; // = 3.1;
    private int estimatedWidth; // = 1;
    private char firstLetter; // = 'P';
    boolean ifGreen; // = true;

    public Plant() {
        theLeaves = "contains leaves";
        estimatedHeight = 3.1;
        estimatedWidth = 1;
        firstLetter = 'P';
        ifGreen = true;
    }

    public void watered() {
    
        theLeaves = "contains watered leaves";

    }

    public void dies() {
        System.out.println("false");
        ifGreen = false;
    }

    public void blossoms() {
        
    }

    public void flowers() {
        
    }

    public void grow(int estimatedHeight) {
        
        if (estimatedHeight != 10) {
            estimatedHeight = estimatedHeight + 1;
        }
        

    }


    // watered
    // dies
    // blossoms
    // flowers


    public boolean equals(Plant otherPlant) {
        if (
        this.estimatedHeight == otherPlant.estimatedHeight &&
        this.estimatedWidth == otherPlant.estimatedWidth &&
        this.firstLetter == otherPlant.firstLetter &&
        this.theLeaves == otherPlant.theLeaves &&
        this.ifGreen == otherPlant.ifGreen
        ) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "This plant has " + theLeaves
        + " number of leaves and is " + estimatedHeight
        + " feet tall and is " + estimatedWidth
        + "feet wide and its first letter is " + firstLetter
        + ". Is it green? " + ifGreen;
    }
    }