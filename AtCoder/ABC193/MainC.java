package AtCoder.ABC193;
import java.util.*;
public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        Set<Long> nums = new HashSet<>();
        for(long i=2; i*i<=n; i++) {
            long tmp = i*i;
            while(tmp <= n) {
                nums.add(tmp);
                tmp *= i;
            }
        }
        System.out.println(n - nums.size());
    }
}
