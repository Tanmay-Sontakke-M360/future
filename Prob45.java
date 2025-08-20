import java.util.Scanner;

public class Prob45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int tmp = n;
        sc.close();
        int sum = 0;
        while(tmp >= 10) {
            while(tmp > 0){
                sum += tmp % 10;
                tmp /= 10;
            }
            tmp = sum;
            sum = 0;
        }
        System.out.println("Single digit sum: " + tmp);
    }
}
