import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {4,3,4,4,4,2}));
    }
    public static int solution(int[] A) {
        Map<Integer, Integer> m = new HashMap<>();

        for(int i=0; i<A.length; i++) {
            if(m.containsKey(A[i])) {
                m.put(A[i], m.get(A[i])+1);
            } else {
                m.put(A[i], 1);
            }
        }

        int maxCount = 1;
        int maxValue = A[0];
        for(int key: m.keySet()) {
            if(m.get(key) > maxValue) {
                maxCount = m.get(key);
                maxValue = key;
            }
        }

        int leaderValue = 0;
        int leaderCount = 0;
        if(maxCount > A.length/2) {
            leaderValue = maxValue;
            leaderCount = maxCount;
        } else {
            return 0;
        }

        int num = 0;
        int leftLeaderCount = 0;

        for(int i=0; i<A.length; i++) {
            if(A[i] == leaderValue) {
                leftLeaderCount++;
            }

            if(leftLeaderCount > (i+1)/2) {
                int rightLeaderCount = leaderCount - leftLeaderCount;
                if(rightLeaderCount > (A.length-i-1)/2) {
                    num++;
                }
            }
        }
        return num;
    }
}