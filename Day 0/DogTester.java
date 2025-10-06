public class DogTester {
    public static void main(String[] args) {

        Dog Rose = new Dog("Rose", "Jojo", 14, 123);
        Dog Rose2 = new Dog();
        Dog Rose3 = new Dog("Jojo", "Rose", 15, 693);
        System.out.println(Rose.getName());
        Rose.setName("Rose4");
        System.out.println(Rose.getName());
        System.out.println(Rose.toString());
        System.out.println(Rose.generateDogChar());


    }
}
