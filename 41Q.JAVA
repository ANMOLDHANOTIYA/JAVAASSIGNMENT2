class Animal {
    static void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    static void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodHidingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();  // Static method hiding
    }
}
