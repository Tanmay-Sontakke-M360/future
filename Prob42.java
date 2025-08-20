import java.util.Scanner;

public class Prob42 {
    public static void main(String[] args) {
        int sum  = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        while(n > 0) {
            sum = sum + (n % 10);
            n = n / 10;
        } 
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
