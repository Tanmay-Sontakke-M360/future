import java.util.Scanner;

public class Prob47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int factorial = 1;
        while(n > 1) {
            factorial *= n;
            n--;
        }
        System.out.println("Factorial: " + factorial);
        sc.close();
    }
}
