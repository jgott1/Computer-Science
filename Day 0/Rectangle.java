public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 5;
        width = 8;
    }

    public Rectangle (int desiredLength, int desiredWidth) {
        length = desiredLength;
        width = desiredWidth;
        }
    
    public Rectangle (int squaredSideLength) {
        length = squaredSideLength;
        width = squaredSideLength;
    }


    // getters

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setters
    public void setLength(int newLength) {
        length = newLength;
    }

    public void setWidth(int newWidth) {
        width = newWidth;
    }

    // methods

    public int calculateArea() {
        int area = length * width;
        return area;
    }

    public int calculatePerimiter() {
        int perimiter = 2 * length + 2 * width;
        return perimiter;
    }

    public double calculateDiagonal() {
        double diagonal = Math.sqrt(length^2 + width^2);
        return diagonal;
    }


}
