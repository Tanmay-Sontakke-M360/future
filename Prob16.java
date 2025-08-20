import java.util.Scanner;

public class Prob16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        for(int i = 2; i*i <= num; i++) {
            if(num % i == 0) {
                System.out.println("The number " + num + " is not prime.");
                sc.close();
                return;
            }
        }
        System.out.println("The number " + num + " is prime.");
        sc.close();
    }   
}
