import java.util.*;

public class Happy {
    static int sqsum(int n) {
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            s += r * r;
            n /= 10;
            
        }
        return s;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), t = n;
        while (t != 1 && t != 4)
            t = sqsum(t);
        System.out.println(t == 1 ? "Happy" : "Not Happy");
    }
}
