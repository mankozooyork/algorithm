import java.util.*;
public class Solution {
    static int[] solution(int N, int[] A) {
        int[] ans = new int[N];
        int max = 0;
        int lastMax = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] >= 1 && A[i] <= N) {
                ans[A[i]-1] = Math.max(ans[A[i]-1], lastMax);
                ans[A[i]-1]++;
                max = Math.max(max, ans[A[i]-1]);
            }
            if(A[i] == N+1) {
                lastMax = max;
            }
        }
        for(int i=0; i<ans.length; i++) {
            ans[i] = Math.max(ans[i], lastMax);
        }
        return ans;
    }
}