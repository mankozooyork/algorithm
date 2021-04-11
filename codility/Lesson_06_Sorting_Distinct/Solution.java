package codility.Lesson_06_Sorting_Distinct;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {2,1,1,2,3,1}));
        System.out.println(solution(new int[] {0}));
    }
    public static int solution(int[] A) {
        Set<Integer> m = new HashSet<>();
        for(int i=0; i<A.length; i++) {
            m.add(A[i]);
        }

        return m.size();
    }
}