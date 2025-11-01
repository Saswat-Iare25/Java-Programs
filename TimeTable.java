import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        System.out.print("   |");
        for (int i = 1; i <= n; i++) System.out.printf("%4d", i);
        System.out.println();
        System.out.println("-----------------------------------------");
        for (int i = 1; i <= n; i++) {
            System.out.printf("%2d |", i);
            for (int j = 1; j <= n; j++) System.out.printf("%4d", i * j);
            System.out.println();
        }
        sc.close();
    }
}
