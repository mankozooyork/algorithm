package codility.Lesson_02_Arrays_CyclicRotation;

import java.util.*;

class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        List<Integer> na = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            na.add(A[i]);
        }
        for(int i=0; i<K; i++) {
            Collections.rotate(na,1);
        }
        int[] ans = new int[na.size()];
        for(int i=0; i<na.size(); i++) {
            ans[i] = na.get(i);
        }
        return ans;
    }
}