import java.util.Scanner;

public class CircleComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        
        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        double circumference = 2 * Math.PI * r;
        System.out.printf("Area = %.2f%n", area);
        
        System.out.printf("Circumference = %.2f%n", circumference);
        sc.close();
    }
}
