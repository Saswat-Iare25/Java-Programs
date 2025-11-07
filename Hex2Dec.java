import java.util.Scanner;

public class Hex2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String hex = sc.next();
        int dec = Integer.parseInt(hex, 16);
        System.out.println("Decimal value: " + dec);
        sc.close();
    }
}

