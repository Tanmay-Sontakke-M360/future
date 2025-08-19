// This program reads two integers from the user and prints their sum.

import java.util.Scanner;

class Prob1{
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("The sum of " + n1 + " and " + n2 + " is: " + (n1 + n2));
        sc.close();
    }
}