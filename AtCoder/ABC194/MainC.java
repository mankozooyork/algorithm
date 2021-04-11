package AtCoder.ABC194;
import java.util.*;
public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int maxA = 200;
        int N = sc.nextInt();
        int[] A = new int[N];
    
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
    
        // +200 because A[i] may start with -200
        // index will be 0 when -200 is coming
        int[] d = new int[maxA*2+1];
        for(int i=0; i<N; i++) {
            d[A[i]+maxA]++;
        }
    
        long ans = 0;
        for(int i=-maxA; i<=maxA; i++) {
            for(int j=-maxA; j<i; j++) {
                long diff = (i-j)*(i-j);
                ans += diff*d[maxA+i]*d[maxA+j];
            }
        }
        System.out.println(ans);
    }
}
