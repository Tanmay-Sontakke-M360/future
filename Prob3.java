import java.util.Scanner;

public class Prob3 {
    public class Employee {
        private String name;
        private int salary;
        private int eno;

        public Employee(String name, int salary, int eno) {
            this.name = name;
            this.salary = salary;
            this.eno = eno;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the eno:");
        int eno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name:");
        String name = sc.nextLine();
        System.out.println("Enter the salary:");
        int salary = sc.nextInt();
        Employee emp = new Prob3().new Employee(name, salary, eno);
        System.out.println("Employee Yearly Salary: " + (emp.salary * 12));
        sc.close();
    }
}
