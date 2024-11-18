class A {
    void displayA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void displayB() {
        System.out.println("Class B");
    }
}

class C extends B {
    void displayC() {
        System.out.println("Class C");
    }
}

public class MultilevelInheritanceExample {
    public static void main(String[] args) {
        C obj = new C();
        obj.displayA(); // Inherited from A
        obj.displayB(); // Inherited from B
        obj.displayC(); // Defined in C
    }
}
