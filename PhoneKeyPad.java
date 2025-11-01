import java.util.Scanner;

public class PhoneKeyPad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ("ABC".indexOf(ch) != -1) System.out.print(2);
            else if ("DEF".indexOf(ch) != -1) System.out.print(3);
            else if ("GHI".indexOf(ch) != -1) System.out.print(4);
            else if ("JKL".indexOf(ch) != -1) System.out.print(5);
            else if ("MNO".indexOf(ch) != -1) System.out.print(6);
            else if ("PQRS".indexOf(ch) != -1) System.out.print(7);
            else if ("TUV".indexOf(ch) != -1) System.out.print(8);
            else if ("WXYZ".indexOf(ch) != -1) System.out.print(9);
        }
        sc.close();
    }
}

