import java.util.Scanner;

public class Prob41 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n = sc.nextInt();
        while(n > 0) {
            n= n / 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
        sc.close();
    }
}
