import java.util.*;
class Solution {
    public static void main(String[] args) {
        //System.out.println(solution(new int[] {1,5,3,4,3,4,1,2,3,4,6,2}));
        System.out.println(solution(new int[] {0, 0, 0, 0, 0, 1, 0, 1, 0, 1}));
    }
    public static int solution(int[] A) {
        int[] peaks = new int[A.length];
        Arrays.fill(peaks, -1);
        for(int i=1; i<A.length-1; i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) {
                peaks[i] = i;
            }
        }

        int[] nextPeaks = new int[A.length];
        int peakIndex = -1;
        // need to be reversed cuz answer will be evaluated from the frist index
        for(int i=A.length-1; i>=0; i--) {
            if(peaks[i] != -1) {
                peakIndex = i;
            }
            nextPeaks[i] = peakIndex;
        }        

        int ans = 0; 
        // it usually loop though i*i, but we need iterate if flag=1, that's why (i-1)*i
        for(int flags=1; (flags-1)*flags<A.length; flags++) {
            int indexForPeak = 0;
            boolean success = true;
            for(int i=0; i<flags; i++) {
                if(indexForPeak >= nextPeaks.length || nextPeaks[indexForPeak] < 0) {
                    success = false;
                    break;
                }
                indexForPeak = nextPeaks[indexForPeak] + flags;
            }
            if(success) ans = Math.max(ans, flags);
        }

        return ans;
    }
}