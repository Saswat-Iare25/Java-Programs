import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int sum = a + b + c;
        int product = a * b * c;
        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        sc.close();
    }
}
