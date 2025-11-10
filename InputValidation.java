import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        boolean valid = false;
        do {
            System.out.print("Enter a number between 0 and 10: ");
            number = sc.nextInt();
            
            if (number >= 0 && number <= 10) valid = true;
            else System.out.println("Invalid input, try again.");
        } while (!valid);
        System.out.println("You entered: " + number);
        sc.close();
    }
}
