public class Dog {
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar;
    private String dogTag;
    private boolean stillInFacility;

    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public Dog() {
        this.name = "Rose";
        this.ownerName = "Jojo";
        this.age = 15;
        this.dogId = 123;
        this.dogChar = generateDogChar();
        this.dogTag = generateDogTag();
        this.stillInFacility = true;
    }

    public String getName() {
        return name;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public int getAge() {
        return age;
    }
    public int getDogId() {
        return dogId;
    }
    public char getDogChar() {
        return dogChar;
    }
    public String getDogTag() {
        return dogTag;
    }
    public boolean isStillInFacility() {
        return stillInFacility;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }
    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }
    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    public String toString() {
        if(isStillInFacility()) {
            return name + " is a good dog. They are " + age
            + " years old and belong to " + ownerName
            + ". They are currently in our facility. For employee use only: "
            + "DogTag is " + dogTag;
        } else {
            return name + " is a good dog. They are " + age
            + " years old and belong to " + ownerName
            + ". They are currently not in our facility. For employee use only: "
            + "DogTag is " + dogTag;
        }
    }

    public boolean equals(Dog otherDog) {
        if(this.toString().equals(otherDog.toString())) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public String generateDogTag() {
        return new String("" + this.dogId + this.dogChar);
    }
    
    public char generateDogChar() {
        int thirdDigit = dogId % 10;
        int secondDigit = (dogId / 10) % 10;
        int firstDigit = (dogId / 10) % 10;
        return (char) ('F' + (firstDigit + secondDigit + thirdDigit) % 10);

    }

    


}
