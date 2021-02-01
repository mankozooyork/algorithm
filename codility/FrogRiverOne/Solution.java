import java.util.*;
class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        Set<Integer> s = new HashSet<>();
        for(int i=1; i<=X; i++) {
            s.add(i);
        }

        int ans = -1;
        Set<Integer> a = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            a.add(A[i]);
            if(a.size() < s.size()) {
                continue;
            }
            if(a.containsAll(s)) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}