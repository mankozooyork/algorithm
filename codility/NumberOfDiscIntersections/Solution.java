import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {1,5,2,1,4,0}));
    }
    public static int solution(int[] A) {
        long[] left     = new long[A.length];
        long[] right    = new long[A.length];
        for(int i=0; i<A.length; i++) {
            left[i]     = i - (long)A[i];
            right[i]    = i + (long)A[i];
        }

        Arrays.sort(left);
        Arrays.sort(right);

        int total   = 0;
        int j       = 0;

        for(int i=0; i<A.length; i++) {
            while(j < A.length && right[i] >= left[j]) {
                total = total + j;
                total = total - i;
                j++;
            }
        }
        if(total > 10_000_000) {
            return -1;
        }
        return total;
    }
}