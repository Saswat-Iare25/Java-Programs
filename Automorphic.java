import java.util.*;

public class Automorphic {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((n * n + "").endsWith(n + "") ? "Automorphic" : "Not Automorphic");
    }
}
