import java.util.*;

public class Spy {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = 0, p = 1;
        while (n > 0) {
            int r = n % 10;
            s += r;
            p *= r;
            n /= 10;
        }
        System.out.println(s == p ? "Spy" : "Not Spy");
    }
}
