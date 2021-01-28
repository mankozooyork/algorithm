class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int[] sum = new int[A.length];
        int[] revSum = new int[A.length+1];
        for(int i=1; i<A.length; i++) {
            sum[i] = A[i-1] + sum[i-1];
        }
        for(int i=A.length-1; i>0; i--) {
            revSum[i] = A[i] + revSum[i+1];
        }
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<A.length; i++) {
            ans = Math.min(ans, Math.abs(sum[i]-revSum[i]));
        }
        return ans;
    }
}