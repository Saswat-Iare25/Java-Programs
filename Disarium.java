
import java.util.*;

public class Disarium {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = n, s = 0, d = (int) Math.log10(n) + 1;
        while (t > 0) {
            
            int r = t % 10;
            s += Math.pow(r, d--);
            t /= 10;
        }
        System.out.println(s == n ? "Disarium" : "Not Disarium");
    }
}
