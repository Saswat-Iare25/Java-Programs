import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter purchase amount (-1 to end): ");
            double amount = sc.nextDouble();
            if (amount == -1) break;
            double tax = amount * 0.07;
            System.out.printf("Sales Tax: %.2f%n", tax);
        }
        sc.close();
    }
}
