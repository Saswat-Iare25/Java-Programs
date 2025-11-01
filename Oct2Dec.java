import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an octal string: ");
        String oct = sc.next();
        int dec = Integer.parseInt(oct, 8);
        System.out.println("Decimal value: " + dec);
        sc.close();
    }
}
