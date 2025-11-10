import java.util.Scanner;

public class IntegerRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("Decimal: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal: " + Integer.toHexString(num));
        System.out.println("Octal: " + Integer.toOctalString(num));
        sc.close();
    }
}
