import java.util.Scanner;

public class ExchangeCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter plaintext: ");
        String text = sc.nextLine().toUpperCase();
        String result = "";
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c))
                result += (char) ('A' + ('Z' - c));
            else result += c;

            
        }
        System.out.println("Ciphertext: " + result);
        sc.close();
    }
}
