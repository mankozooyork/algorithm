import java.util.*;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            if(m.containsKey(A[i])) {
                m.put(A[i], m.get(A[i])+1);
            } else {
                m.put(A[i], 1);
            }
        }
        int ans = 0;
        for(int i: m.keySet()) {
            if(m.get(i) % 2 != 0) {
                ans = i;
            }
        }
        return ans;
    }
}