import java.util.Scanner;

public class ComputePI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        double pi = 0.0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) pi += 1.0 / (2 * i + 1);
            else pi -= 1.0 / (2 * i + 1);
        }
        pi *= 4;
        System.out.println("Approximation of PI = " + pi);
        
        sc.close();
    }
}
