import java.util.Scanner;

public class CaesarCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String text = sc.nextLine().toUpperCase();
        String result = "";
        
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c))
                result += (char) (((c - 'A' + 3) % 26) + 'A');
                
            else result += c;
        }
        System.out.println("Ciphertext: " + result);
        sc.close();
    }
}
