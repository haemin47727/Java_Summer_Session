package week_3;

// this is the blueprint
// when you use the "new" keyword, that is when an object is created
// for instance, "Dog annie = new Dog();"
public class Dog {

    // these are called instance variables
    private String name;
    private int age;

    public Dog(String newName) {
        // this is a constructor
        // it gets called automatically when the object is created
        // which is when the "new" keyword is used
        this.name = newName;
    }

    public void bark() {
        System.out.println(name + " says: Woof!");
    }

    public void print() {
        System.out.println(name + " is " + age + " years old");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}