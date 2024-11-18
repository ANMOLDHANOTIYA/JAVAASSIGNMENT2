class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id; // 'this' keyword refers to current object's id
        this.name = name; // 'this' refers to current object's name
    }

    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

public class ThisKeywordExample {
    public static void main(String[] args) {
        Student student = new Student(1, "John");
        student.display();
    }
}
