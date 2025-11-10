public class Line {
    
    private int a; 
    private int b; 
    private int c; 
    private Point p1; 
    private Point p2; 

    Line(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.a = -(p2.getY() - p1.getY()); 
        this.b = p2.getX() - p1.getX(); 
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }
    
    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double calculateSlopeFromPoints() {
        return ((p1.getY() - p2.getY()) / (p1.getX() - p2.getX()));
    }

    public double calculateSlope() {
        double slope = - (double) (a) / (double) (b);
        return slope;
    }

    public boolean isCoordinateOnLine(Point p) {
        if ((a * p.getX() + b * p.getY() + c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return a + "x " + b + "y " + c + " = 0";
    }

    public boolean equals(Line otherLine) {
        if (
            this.a == otherLine.a
                &&
                this.b == otherLine.b
                &&
                this.c == otherLine.c
        ) {
            return true;
        } else {
            return false;
        }
    }

    public String generatePointSlopeFormula() {
        double slope = calculateSlopeFromPoints();
        return ("(y - " + p1.getY() + ") = " + slope + "(x - " + p1.getX() + ")");
    }

}