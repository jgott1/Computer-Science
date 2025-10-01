public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby");
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        //1. Added new to both.
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName());
        //.2. Added the system.out.println
        System.out.println("Are the cat's equal? " + myCat.equals(otherCat));
        //.3. Added the system.out.println
        System.out.println("Is my cat hungry? " + myCat.getIsHungry());
        //4. changed print to System.out.println.

        String firstName = "Tiger";
        String lastName = "Beast";
        //5. deleted an equal sign.
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}