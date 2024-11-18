import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    double basicSalary, grossSalary;

    public Employee(int empId, String empName, double basicSalary) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.grossSalary = basicSalary + (basicSalary * 0.5); // Assuming 50% of basic as allowances
    }

    public void displayGrossSalary() {
        System.out.println("Gross Salary of " + empName + ": " + grossSalary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();

        Employee employee = new Employee(id, name, salary);
        employee.displayGrossSalary();
        sc.close();
    }
}
