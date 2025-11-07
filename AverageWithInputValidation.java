import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0, count = 0;
        while (true) {
            System.out.print("Enter a positive integer (-1 to end): ");
            int num = sc.nextInt();
            if (num == -1) break;
            
            if (num < 0) {
                System.out.println("Invalid input, try again.");
                continue;
            }
            total += num;
            count++;
        }
        if (count > 0)
            System.out.println("Average = " + (double) total / count);
        else
            System.out.println("No valid numbers entered.");
        sc.close();
    }
}
