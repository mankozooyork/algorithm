package AtCoder.ABC194;
import java.util.*;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sc.close();

        int res = Integer.MAX_VALUE;
        for(int i=0; i<a.length; i++) {
            for(int j=0; j<b.length; j++) {
                res = Math.min(res, i == j ? a[i] + b[j] : Math.max(a[i], b[j]));
            }
        }
        System.out.println(res);
    }
}
