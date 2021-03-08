package AtCoder.ABC194;
import java.util.*;
public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
    
        for(int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        sc.close();
    
        // +200 because A[i] may start with -200
        // index will be 0 when -200 is coming
        int[] d = new int[200*2+1];
        for(int i=0; i<N; i++) {
            d[A[i]+200]++;
        }
    
        long ans = 0;
        for(int i=-200; i<=200; i++) {
            for(int j=-200; j<i; j++) {
                long diff = (i-j)*(i-j);
                ans += diff*d[200+i]*d[200+j];
            }
        }
        System.out.println(ans);
    }
}
