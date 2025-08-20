import java.util.Scanner;

public class Prob52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int n = sc.nextInt();
        System.out.print("Enter second Number: ");
        int m = sc.nextInt();
        System.out.print("1: addition\n2: subtraction\n3: multiplication\n4: division\nChoose an operation: ");
        int choice = sc.nextInt();
        int result = 0;
        switch (choice) {
            case 1:
                result = n + m;
                break;
            case 2:
                result = n - m;
                break;
            case 3:
                result = n * m;
                break;
            case 4:
                if (m != 0) {
                    result = n / m;
                } else {
                    System.out.println("Division by zero is not allowed.");
                    sc.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                sc.close();
                return;
        }
        System.out.println("Result: " + result);
        sc.close();
        
    }
}
