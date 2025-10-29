import java.util.*;

public class Caprekar {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), sq = n * n, d = (int) Math.log10(n) + 1;
        int p = (int) Math.pow(10, d);
        int l = sq % p, r = sq / p;
        System.out.println(l + r == n ? "Caprekar" : "Not Caprekar");
    }
}
