// This program reads the weights of three persons and calculates their average weight.
import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the weight of three persons:");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        System.out.println("The average weight of the three persons is: " + ((n1 + n2 + n3) / 3));
        sc.close();
    }
    
}
