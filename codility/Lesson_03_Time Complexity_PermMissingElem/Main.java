import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean[] bucket = new boolean[100000+2];
        Arrays.fill(bucket, false);

        for(int i=0; i<A.length; i++) {
            bucket[A[i]] = true;
        }

        int ans = 0;
        for(int i=1; i<bucket.length; i++) {
            if(!bucket[i]) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}