import java.util.HashSet;
import java.util.Set;

public class leet202 {
    public static void main(String[] args) {
        int n = 29;
        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n) {
        Set<Integer> visited = new HashSet<>();

        while (n != 1 && !visited.contains(n)) {
            visited.add(n);
            int sum = 0;
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }
        return n == 1;
    }
}
