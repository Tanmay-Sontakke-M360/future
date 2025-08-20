import java.util.Scanner;

public class Prob48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int count = 0;
        while(n > 0){
            System.out.print((n % 10)*Math.pow(10, count));
            System.out.println();
            n = n / 10;
            count++;
        }
        sc.close();
    }   
}
