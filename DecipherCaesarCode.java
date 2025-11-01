import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ciphertext: ");
        String cipher = sc.nextLine().toUpperCase();
        String plain = "";
        for (char c : cipher.toCharArray()) {
            if (Character.isLetter(c))
                plain += (char) (((c - 'A' - 3 + 26) % 26) + 'A');
            else plain += c;
        }
        System.out.println("Plaintext: " + plain);
        sc.close();
    }
}
