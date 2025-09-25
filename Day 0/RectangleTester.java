public class RectangleTester {
    
    public static void main(String[] args) {
        Rectangle joe = new Rectangle();
        Rectangle moe = new Rectangle();
        Rectangle olivia = new Rectangle(6, 7);

        System.out.println("Joe's width: " + joe.getWidth());
        System.out.println("Olivia's width: " + olivia.getLength());
        moe.setLength(12);
        Rectangle curly = new Rectangle();
        curly.setWidth(10);
        Rectangle stout = new Rectangle(8);
        stout.getArea();
        stout.getDiagonal();
        stout.getPerimeter();

    }

}
