
import java.util.*;

public class CircularPrime {
    static boolean prime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0) return false;
        return true;
    }

    static boolean circ(int n) {
        String s = "" + n;
        for (int i = 0; i < s.length(); i++) {
            
            int num = Integer.parseInt(s); 
            
            if (!prime(num)) return false;
            s = s.substring(1) + s.charAt(0);
        }
        return true;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(circ(n) ? "Circular Prime" : "Not Circular Prime");
    }
}
