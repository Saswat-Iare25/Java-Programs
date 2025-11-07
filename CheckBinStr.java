import java.util.Scanner;

public class CheckBinStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary string: ");
        String str = sc.next();
        boolean valid = true;
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') valid = false;
        }
        System.out.println(valid ? "Valid binary string" : "Invalid binary string");
        sc.close();
    }
}

