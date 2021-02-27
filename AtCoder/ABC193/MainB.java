package AtCoder.ABC193;
import java.util.*;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] apx = new int[n][3];
        for(int i=0; i<n; i++) {
            apx[i][0] = sc.nextInt();
            apx[i][1] = sc.nextInt();
            apx[i][2] = sc.nextInt();
        }
        sc.close();
        int left = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            left = apx[i][2] - apx[i][0];
            if(left > 0) ans = Math.min(ans, apx[i][1]);
        }
        if(ans == Integer.MAX_VALUE) ans = -1;
        System.out.println(ans);
    }
}
