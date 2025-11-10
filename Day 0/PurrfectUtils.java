public class PurrfectUtils {
    
    public static String determineCatMood(Cat cat) {
        if (cat.getMoodLevel() > 7 && cat.getMoodLevel() <= 10) {
            return "Currently, " + cat.getName() + " is in a great mood.\nPetting is appreciated.";
        } else if (cat.getMoodLevel() > 3 && cat.getMoodLevel() <= 7) {
            return "Currently, " + cat.getName() + " is reminiscing of a past life.\nPetting is acceptable.";
        } else {
            return "Currently, " + cat.getName() + " is plotting revengeance.\nPetting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            int digit = Integer.parseInt(catId.substring(i, i + 1));
            sum += digit;
        }
        int remainder = sum % 26;
        char letter = (char) ('A' + remainder);
        return letter;
    }

    public static int generateRandomNumber(int low, int high) {
        if (low >= high) {
            int temp = low;
            low = high;
            high = temp;
        }
        return (int)(Math.random() * (high - low)) + low;
    }

    public static String validateCatId(String catId) {
        int idNum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char c = catId.charAt(i);
            idNum = idNum * 10 + (c - '0');
        }
        if (idNum >= 1000 && idNum <= 9999) {
            return catId;
        } else {
            int randomId = generateRandomNumber(1000, 10000);
            return ("" + randomId);
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
    System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");
        int originalMood = cat.getMoodLevel();
        if (cat.getMoodLevel() >= 2) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
        } else if (cat.getMoodLevel() < 2 && cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() - 1);
        } else if (cat.getMoodLevel() < 2 && !cat.isHungry()) {
            cat.setMoodLevel(cat.getMoodLevel() + 1);
        }
        cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel()));
        if (cat.getMoodLevel() > originalMood) {
            System.out.println("Petting successful!");
        } else {
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int minus = generateRandomNumber(1, 3);
        cat.setMoodLevel(cat.getMoodLevel() - minus);
        cat.setMoodLevel(validateMoodLevel(cat.getMoodLevel()));
        if (minus == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else {
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        System.out.println("Cleaning the litter box...");
        cat.setMoodLevel(cat.getMoodLevel() + 1);
        cat.setHungry(true);
        System.out.println("Done!\n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        System.out.println("Filling up " + cat.getName() + "'s bowl...");
        cat.setMoodLevel(cat.getMoodLevel() + 2);
        System.out.println("Done!");
        System.out.println(cat.getName() + " is eating...");
        cat.setHungry(false);
        System.out.println(cat.getName() + " is full!");
    }

}
