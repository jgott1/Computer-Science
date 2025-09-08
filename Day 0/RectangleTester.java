public class RectangleTester {
    
    public static void main(String[] args) {
        Rectangle joe = new Rectangle();
        Rectangle moe = new Rectangle();
        Rectangle curly = new Rectangle();
        Rectangle olivia = new Rectangle(6, 7);
        Rectangle stout = new Rectangle(8);

        System.out.println("Joe's width: " + joe.getWidth());
        System.out.println("Olivia's width: " + olivia.getLength());
        moe.setLength(12);
        curly.setWidth(10);
        stout.calculateArea();

    }

}
