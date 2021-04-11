package codility.Lesson_04_Counting_Elements_MissingInteger;

import java.util.*;

class Solution {
    static int solution(int[] A) {
        Arrays.sort(A);
        HashSet<Integer> s = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            if(A[i] > 0) s.add(A[i]);
        }
        
        if(s.size() != 0) {
            for(int i=1; i<=Integer.MAX_VALUE; i++) {
                if(!s.contains(i)) {
                    return i;
                }
            }
        }

        return 1;
    }
    public static void main(String[] args) {
        //int[] A = {1, 3, 6, 4, 1, 2};
        //int[] A = {-1, -3};
        int[] A = {1,2,3};
        System.out.println(solution(A));
    }
}