import java.util.Scanner;

public class Bin2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String bin = sc.next();
        int dec = Integer.parseInt(bin, 2);
        System.out.println("Decimal value: " + dec);
        
        sc.close();
    }
}
