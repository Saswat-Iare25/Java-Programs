import java.util.Scanner;

public class CountVowelsDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine().toLowerCase();
        int vowels = 0, digits = 0;
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) vowels++;
            if (Character.isDigit(c)) digits++;
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
        sc.close();
    }
}
