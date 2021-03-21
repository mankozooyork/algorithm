package AtCoder.ABC190;
import java.util.*;
public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[m];
        int[] b = new int[m];
        for(int i=0; i<m; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int[] c = new int[k];
        int[] d = new int[k];
        for(int i=0; i<k; i++) {
            c[i] = sc.nextInt();
            d[i] = sc.nextInt();
        }
        sc.close();

        int ans = 0;
        // to k^2
        for(int i=0; i<(1<<k); i++) {
            int[] dish = new int[n+1];
            for(int j=0; j<k; j++) {
                // if 'j'th person picks dish D or not
                if((i>>j&1) == 1) dish[d[j]]++;
                else dish[c[j]]++;
            }
            int now = 0;
            for(int j=0; j<m; j++) {
                if(dish[a[j]] == 0) continue;
                if(dish[b[j]] == 0) continue;
                now++;
            }
            ans = Math.max(ans,now);
        }
        System.out.println(ans);
    }
}
