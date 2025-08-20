import java.util.Scanner;

public class Prob43 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int res = 0, tmp = n;
        while(n > 0) {
            n = n/10;
            count++;
        }
        count--;
        while(count >= 0){
            res += Math.pow(10, count) * (tmp % 10);
            count--;
            tmp = tmp / 10;
        }
        System.out.println("Reversed Number: " + res);
        sc.close();

    }    
}
