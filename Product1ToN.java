import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        long product = 1;
        for (int i = 1; i <= n; i++) product *= i;
        System.out.println("Product = " + product);
        sc.close();
    }
}
