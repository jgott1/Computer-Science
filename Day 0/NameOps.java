public class NameOps {

    public static String printMethodCall(String method, String name) {
        return (method + "(\"" + name + "\"): ");
    }

    public static String whoIsAwesome(String name) {
        return (name + " is awesome!");
    }

    public static int indexOfFirstSpace(String name) {
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == (' ')) {
                return num;
            }
        }
        return -1;
    }

    public static int indexOfSecondSpace(String name) {
        int spaces = 0;
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == (' ')) {
                spaces++;
                if (spaces == 2) {
                    return num;
                }
            }
        }
        return -1;
    }

    public static String findFirstName(String name) {
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == (' ')) {
                return name.substring(0, num);
            }
        }
        return name;
    }

    public static String findLastName(String name) {
        int lastSpace = -1;
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == ' ') {
                lastSpace = num;
            }
        }
        if (lastSpace != -1) {
            return name.substring(lastSpace + 1);
        }
        return "";
    }

    public static String findMiddleName(String name) {
        int spaceOne = -1;
        int spaceTwo = -1;
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == (' ')) {
                if (spaceOne == -1) {
                    spaceOne = num;
                } else {
                    spaceTwo = num;
                    break;
                }
            }
        }
        if (spaceOne != -1 && spaceTwo != -1) {
            return name.substring(spaceOne + 1, spaceTwo);
        } else {
            return "";
        }
    }

    public static String generateLastFirstMidInitial(String name) {
        int spaceOne = indexOfFirstSpace(name);
        if (spaceOne == -1) {
            return name;
        }
        int spaceTwo = indexOfSecondSpace(name);
        if (spaceTwo == -1) {
            String first = name.substring(0, spaceOne);
            String last = name.substring(spaceOne + 1);
            return last + ", " + first;
        } else {
            String first = name.substring(0, spaceOne);
            String middle = name.substring(spaceOne + 1, spaceOne + 2);
            String last = name.substring(spaceTwo + 1);
            return (last + ", " + first + " " + middle + ".");
        }
    }

}