class Counter {
    static int count = 0; // Static variable

    Counter() {
        count++; // Increment static variable for each object
    }

    static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class StaticKeywordExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount(); // Access static method
    }
}
