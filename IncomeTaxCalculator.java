import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter taxable income: ");
        double income = sc.nextDouble();
        double tax;
        if (income <= 20000)
            tax = 0;
        else if (income <= 40000)
            tax = 0.1 * (income - 20000);
        else if (income <= 60000)
            tax = 2000 + 0.2 * (income - 40000);
        else
            tax = 6000 + 0.3 * (income - 60000);
        System.out.printf("Tax payable: %.2f%n", tax);
        sc.close();
    }
}
