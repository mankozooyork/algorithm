import java.util.*;
public class Solution10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(26, new int[] {1,4,16}, new int[] {26,10,20})));
       //System.out.println(Arrays.toString(solution(1, new int[] {1}, new int[] {1})));
    }
    public static int[] solution(int N, int[] P, int[] Q) {
        int M = P.length;
        int[] primes = new int[N+1];

        for(int i=2; i*i<=N; i++) {
            if(primes[i] == 0) {
                int num = i*i;
                while(num <= N) {
                    if(primes[num] == 0) {
                        primes[num] = i;
                    }
                    num += i;
                }
            }
        }

        System.out.println(Arrays.toString(primes));

        int[] semiPrimes = new int[primes.length];
        for(int i=0; i<primes.length; i++) {
            if(primes[i] == 0) continue;
            int num = primes[i];
            if(primes[i/num] == 0) semiPrimes[i] = 1;
        }

        System.out.println(Arrays.toString(semiPrimes));

        int[] semiPrimesCount = new int[semiPrimes.length];
        for(int i=1; i<N+1; i++) {
            semiPrimesCount[i] = semiPrimes[i];
            semiPrimesCount[i] = semiPrimesCount[i] + semiPrimesCount[i-1];
        }
        System.out.println(Arrays.toString(semiPrimesCount));

        int[] ans = new int[M];
        for(int i=0; i<M; i++) {
            ans[i] = semiPrimesCount[Q[i]] - semiPrimesCount[P[i]-1];
        }

        return ans;
    }
}