// Abstract Superclass
public abstract class Animal {
    private String name;

    // Constructor for the abstract class
    // Subclasses will call this using super()
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method: It has NO body {} and ends with a semicolon.
    // Every concrete class extending Animal MUST implement this method.
    public abstract void makeSound();

    // Concrete method: Abstract classes can have normal methods with code
    public String getName() {
        return name;
    }
}

// Subclass 1: Dog
class Dog extends Animal {
    // Constructor chaining to pass the name up to the Animal class
    public Dog(String name) {
        super(name);
    }

    // Fulfilling the requirement to implement the abstract method
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof! Woof!");
    }
}

// Subclass 2: Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}
