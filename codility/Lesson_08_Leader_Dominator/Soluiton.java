import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,4,3,2,3,-1,3,3}));
        System.out.println(solution(new int[] {0,1,2,3,4,5,6}));
        System.out.println(solution(new int[] {1}));
    }
    public static int solution(int[] A) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i=0; i<A.length; i++) {
            if(m.containsKey(A[i])) {
                m.put(A[i], m.get(A[i])+1);
            }else{
                m.put(A[i], 1);
            }
        }
        int maxValue = 0;
        int valueOfKey = 0;
        for(int key: m.keySet()) {
            if(m.get(key) > maxValue) {
                maxValue = m.get(key);
                valueOfKey = key;
            }
        }
        if(maxValue > A.length/2) {
            // nop
        } else {
            return -1;
        }
        for(int i=0; i<A.length; i++) {
            if(A[i] == valueOfKey) {
                return i;
            }
        }
        return -1;
    }

}