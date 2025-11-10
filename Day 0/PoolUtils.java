public class PoolUtils {
    
    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            return 0;
        }
        if (cleanlinessLevel > 10) {
            return 10;
        } else {
            return cleanlinessLevel;
        }
    }

    public static String generateUsername(String name) {
        int randomNum = (int) (Math.random() * 1000 + 1950);
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == (' ')) {
                String firstName = name.substring(0, num);
                String lastName = name.substring(num + 1);
                String username = ("@" + firstName + "_" + lastName + "_" + randomNum);
                return username;
            }
        }
        return "";
    }

    public static void cleanPool(Pool pool) {
        pool.setCleanlinessLevel((pool.getCleanlinessLevel() + 2));
    }

    public static String fixName(String name) {
        for (int num = 0; num < name.length(); num++) {
            if (name.charAt(num) == (' ')) {
                String firstName = name.substring(0, num);
                num = (num + 1);
                while (num < name.length()) {
                    if (name.charAt(num) == (' ')) {
                        String lastName = name.substring(num);
                        return (firstName + " " + lastName);
                    }
                }
            } else {
                return "";
            }
        }
        return "";
    }

}
