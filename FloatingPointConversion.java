import java.util.Scanner;

public class FloatingPointConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a floating-point number: ");
        double num = sc.nextDouble();
        long bits = Double.doubleToLongBits(num);
        System.out.println("Binary representation: " + Long.toBinaryString(bits));
        System.out.println("Hexadecimal representation: " + Long.toHexString(bits));
        sc.close();
    }
}
