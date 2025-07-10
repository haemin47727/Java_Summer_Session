package week_3;

public class ClassObjectDemo {

    public static void main(String[] args) {

        // creating an "object" aka "instance" of the Dog class
        Dog dog1 = new Dog("Annie");
        dog1.setAge(10);
        dog1.bark();
        //dog1.print();

        // creating another object (aka instance) of Dog class
        Dog dog2 = new Dog("Puppy");
        dog2.setAge(15);
        dog2.bark();
        //dog2.print();

        // creating another object (aka instance) of Dog class
        Dog dog3 = new Dog("Curly");
        dog3.setAge(5);
        dog3.bark();
        //dog3.print();

        DogPack pack = new DogPack();

        pack.getDogs().add(dog1);
        pack.getDogs().add(dog2);
        pack.getDogs().add(dog3);

        System.out.println(pack.toString());
    }

    private static void demonstrateDogPack() {

    }

}
