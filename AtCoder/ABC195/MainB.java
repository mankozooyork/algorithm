package AtCoder.ABC195;

import java.util.*;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int W = sc.nextInt()*1000;
        sc.close();

        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int n=1; n<=W; n++) {
            if(A*n <= W && W <= B*n) {
                int t1 = A*n;
                int t2 = B*n;
                max = Math.max(max,n);
                min = Math.min(min,n);
            }
        }
        if(max == 0) System.out.println("UNSATISFIABLE");
        else {
            System.out.print(min + " ");
            System.out.println(max);
        }
    }
}
