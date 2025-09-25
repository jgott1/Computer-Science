public class StudentTester {
    
    public static void main(String[] args) {

        Student sophomore = new Student("phil", 12);
        Student junior = new Student("bill", 10);
        System.out.println(sophomore.toString());
        System.out.println(junior.equals(sophomore));



    }
}
