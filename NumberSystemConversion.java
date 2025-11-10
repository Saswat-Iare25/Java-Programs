import java.util.Scanner;

public class NumberSystemConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        
        System.out.println("Binary: " + Integer.toBinaryString(n));
        System.out.println("Octal: " + Integer.toOctalString(n));
        System.out.println("Hexadecimal: " + Integer.toHexString(n).toUpperCase());
        sc.close();
    }
}
