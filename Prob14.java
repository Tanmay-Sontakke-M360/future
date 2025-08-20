import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks scored in 1st subject:");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks scored in 2nd subject:");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks scored in 3rd subject:");
        int marks3 = sc.nextInt();
        int totalMarks = marks1 + marks2 + marks3;
        double averageMarks = totalMarks / 3.0;
        if(averageMarks < 35){
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade: C");
        }
        else if(averageMarks < 60){
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade: B");
        }
        else {
            System.out.println("Total Marks: " + totalMarks);
            System.out.println("Average Marks: " + averageMarks);
            System.out.println("Grade: A");
        }
        sc.close();
    }
}
