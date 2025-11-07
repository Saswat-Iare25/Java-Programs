import java.util.Scanner;

public class CheckHexStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a hexadecimal string: ");
        String str = sc.next().toUpperCase();
        boolean valid = true;
        for (char c : str.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) valid = false;
        }
        
        System.out.println(valid ? "Valid hexadecimal string" : "Invalid hexadecimal string");
        sc.close();
    }
}
