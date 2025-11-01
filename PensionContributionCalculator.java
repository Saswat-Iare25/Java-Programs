import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        double employeeRate, employerRate;
        if (age <= 55) {
            employeeRate = 0.2;
            employerRate = 0.17;
        } else if (age <= 60) {
            employeeRate = 0.13;
            employerRate = 0.13;
        } else if (age <= 65) {
            employeeRate = 0.075;
            employerRate = 0.09;
        } else {
            employeeRate = 0.05;
            employerRate = 0.075;
        }
        double employee = salary * employeeRate;
        double employer = salary * employerRate;
        double total = employee + employer;
        System.out.printf("Employee: %.2f, Employer: %.2f, Total: %.2f%n", employee, employer, total);
        sc.close();
    }
}
