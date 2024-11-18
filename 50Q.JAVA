import java.util.Scanner;

public class SumOfConsecutiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();
        
        int sum = 0;
        for (int i = 0; i < num.length() - 1; i++) {
            String pair = num.substring(i, i + 2);
            sum += Integer.parseInt(pair);
        }
        
        System.out.println("Sum of consecutive numbers: " + sum);
        sc.close();
    }
}
