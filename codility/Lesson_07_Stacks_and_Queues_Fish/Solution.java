package codility.Lesson_07_Stacks_and_Queues_Fish;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {4,3,2,1,5}, new int[] {0,1,0,0,0}));
    }
    public static int solution(int[] A, int[] B) {
        Stack<Integer> s = new Stack<>();
        int ans = A.length;
        for(int i=0; i<A.length; i++) {
            if(B[i] == 1) {
                s.push(A[i]);
            }
            if(B[i] == 0) {
                while(!s.empty()) {
                    // current fish can eat an opponent
                    if(s.peek() > A[i]) {
                        ans--;
                        break;
                    }
                    // current fish can be eaten by an opponent
                    if(s.peek() < A[i]) {
                        ans--;
                        s.pop();
                    }
                }
            }
        }
        return ans;
    }
}