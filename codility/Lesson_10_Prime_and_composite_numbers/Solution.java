import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {}));
    }
    public static int solution(int[] A) {
        ArrayList<Integer> peaks = new ArrayList<>();
        for(int i=1; i<A.length-1; i++) {
            if(A[i] > A[i] && A[i] > A[i+1]) {
                peaks.add(i);
            }
        }

        int maxLoopCnt = (int)Math.ceil(Math.sqrt(peaks.get(peaks.size()-1)-peaks.get(0)));
        int lastFlagIndex = 0;
        for(int i=maxLoopCnt; i>0; i--) {
            int flags = 1;
            for(int j=1; j<i; j++) {
                flags++;
                lastFlagIndex = j;
            }
            if(flags == i) return flags;
        }
        return 0;
    }
}