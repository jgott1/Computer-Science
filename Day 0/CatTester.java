public class CatTester {
    public static void main(String[] args) {
        Cat rose = new Cat("Rose", "Jojo", 7, "1234");
        Cat mia = new Cat("Rose", "Jojo", 7, "1234");
        System.out.println(rose.toString());
        System.out.println(rose.equals(mia));
        System.out.println(rose.getName());
        System.out.println(mia.getName());
        rose.setName("Sophie");
        mia.setName("Sophie");
        System.out.println(rose.getName());
        System.out.println(mia.getName());
        PurrfectUtils.bootUp(rose);
    }

}