import java.util.Scanner;

public class Prob11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();
        int res;
        if(n1 < n2) {
            res = n2 - n1;
        }
        else{
            res = n1 - n2;
        }
        System.out.println("The absolute difference is: " + res);
        sc.close();
    }
}
