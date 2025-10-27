public class TriangleLoops {

    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        int i = numberOfRows;
        while (i >= 1) {
            for (int j = 0; j < i; j++) {
                triangle += letter;
            }
            triangle += "\n";
            i = i - 1;

        }
        return triangle;
    }

    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += i;
                if (j < i) {
                    triangle += " "; 
                }
            }
            triangle += "\n";
        }

        return triangle;
    }

    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            for (int s = i; s < numberOfRows; s++) {
                triangle += " ";
            }

            for (int j = 1; j <= i; j++) {
                triangle += (char) ('A' + j - 1);
            }

            for (int j = i - 1; j >= 1; j--) {
                triangle += (char) ('A' + j - 1);
            }

            triangle += "\n";
        }
        return triangle;
    }

    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        int i = 1;
        String triangle = "";
        while (i <=  numberOfRows) {
            for (int j = 0; j < i; j++) {
                triangle += letter;
            }
        
            triangle += "\n";
            i++;
        }
        return triangle;
    }

}