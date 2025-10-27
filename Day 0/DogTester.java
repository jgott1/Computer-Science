public class DogTester {
    public static void main(String[] args) {

        Dog rose = new Dog("Rose", "Jojo", 14, 123);
        Dog rose2 = new Dog();
        Dog rose3 = new Dog("Jojo", "Rose", 15, 693);
        System.out.println(rose.getName());
        System.out.println(rose2.getName());
        System.out.println(rose3.getName());
        System.out.println(rose.getOwnerName());
        System.out.println(rose2.getOwnerName());
        System.out.println(rose3.getOwnerName());
        System.out.println(rose.getAge());
        System.out.println(rose2.getAge());
        System.out.println(rose3.getAge());
        System.out.println(rose.getDogId());
        System.out.println(rose2.getDogId());
        System.out.println(rose3.getDogId());
        rose.setAge(18);
        System.out.println(rose.getAge());
        rose2.setOwnerName("Rose10");
        System.out.println(rose2.getOwnerName());
        System.out.println(PawesomeUtils.generateDogTag(rose.getDogId(), PawesomeUtils.generateDogChar(rose.getDogId())));
        System.out.println(PawesomeUtils.generateDogTag(rose2.getDogId(), PawesomeUtils.generateDogChar(rose2.getDogId())));
        System.out.println(PawesomeUtils.generateDogTag(rose3.getDogId(), PawesomeUtils.generateDogChar(rose3.getDogId())));
        System.out.println(rose.toString());
        System.out.println(rose2.toString());
        System.out.println(rose3.toString());
        System.out.println(rose.equals(rose2));
        Dog rose4 = new Dog();
        System.out.println(rose2.equals(rose4));
        rose.setStillInFacility(false);
        System.out.println(rose.toString());
        System.out.println(PawesomeUtils.generateDogChar(123));
        System.out.println(PawesomeUtils.generateDogChar(456));
        System.out.println(PawesomeUtils.generateDogChar(789));
        Dog mia = new Dog("Mia", "Zoe", 14, 123);
        System.out.println(PawesomeUtils.pickup(mia, "Zoe"));
        System.out.println(PawesomeUtils.pickup(mia, "Sophie"));
        PawesomeUtils.checkIn(rose, "NewOwner");
        System.out.println(rose.toString());
        System.out.println(rose.getOwnerName());
        System.out.println(PawesomeUtils.validateDogId(87));
        System.out.println(PawesomeUtils.validateDogId(187));
        System.out.println(PawesomeUtils.validateDogTag(mia));
        System.out.println(PawesomeUtils.validateDogTag(rose));
        System.out.println(PawesomeUtils.validateDogTag(rose2));
        System.out.println(PawesomeUtils.convertAgeToDogYears(12));
        System.out.println(PawesomeUtils.convertAgeToDogYears(20));
        System.out.println(PawesomeUtils.convertAgeToDogYears(31));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(mia));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(rose));
        System.out.println(PawesomeUtils.convertAgeToHumanAge(rose2));
        



    }
}
