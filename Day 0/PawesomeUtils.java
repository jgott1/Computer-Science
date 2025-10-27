public class PawesomeUtils {

    public static char generateDogChar(int dogId) {
        int last = dogId % 10;
        int middle = (dogId / 10) % 10;
        int first = (dogId / 10) % 10;
        int charCharacter = ('F' + ((last + middle + first) % 10) - 1);
        return (char) charCharacter;
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return (dogId + "" + dogChar);
    }

    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else { 
            return (100 + (int) (Math.random() * 899));
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int x = validateDogId(dog.getDogId());
        int y = generateDogChar(x);
        String newDogTag = "" + x + y;
        if (newDogTag.equals(dog.getDogTag())) { 
            return true;
        } else {
            return false;
        }
    }


    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            return (dog.getOwnerName() + " has been picked up by their owner " + personName + ".");
        } else {
            return ("There's not a match in the system, sorry.");
        }
    }

    public static String checkIn(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(true);
            dog.setOwnerName(personName);
            return ("Dog successfully checked in!");
        } else {
            return ("There's not a match in the system, sorry.");
        }
    }

    public static int convertAgeToHumanAge(Dog dog) {
        if (dog.getAge() == 1) {
            int ageOfDog = 15;
            return ageOfDog;
        }
        if (dog.getAge() == 2) {
            int ageOfDog = 24;
            return ageOfDog;
        } else {
            int ageOfDog = (24 + (dog.getAge() - 2) * 5);
            return ageOfDog;
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) { 
            return 1;
        }
        if (humanYears >= 15 && humanYears <= 24) { 
            return 2;
        } else {
            return ((humanYears - 24) / 5 + 2);
        }
    }

    
}
