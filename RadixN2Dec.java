import java.util.Scanner;

public class RadixN2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = sc.next();
        System.out.print("Enter radix (base): ");
        int base = sc.nextInt();
        int dec = Integer.parseInt(num, base);
        System.out.println("Decimal value: " + dec);
        sc.close();
    }
}
