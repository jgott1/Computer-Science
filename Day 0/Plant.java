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


    // watered
    // dies
    // blossoms
    // flowers

    
    }