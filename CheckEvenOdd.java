import java.util.Scanner;
class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        if (number % 2 == 0) System.out.println("EVEN"); else System.out.println("ODD");
        System.out.println("BYE!");
        sc.close();
    }
}
