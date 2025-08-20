import java.util.Scanner;

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Billing amount:");
        int ba = sc.nextInt();
        int discount = 10;
        if(ba > 6000){
            ba = ba - (ba * discount / 100);
            
        }
        System.out.println("The amount after discount is: " + ba);
        sc.close();
    }
}
