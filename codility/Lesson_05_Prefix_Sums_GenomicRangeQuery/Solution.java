package codility.Lesson_05_Prefix_Sums_GenomicRangeQuery;

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        //System.out.println(Arrays.toString(solution("CAGCCTA", new int[] {2,5,0}, new int[] {4,5,6})));
        System.out.println(Arrays.toString(solution("AC", new int[] {0,0,1}, new int[] {0,1,1})));
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] A = new int[S.length()+1];
        int[] C = new int[S.length()+1];
        int[] G = new int[S.length()+1];

        for(int i=0; i<S.length(); i++) {
            int a,c,g;
            a = c = g = 0;
            if(S.charAt(i) == 'A') {
                a = 1;
            }
            if(S.charAt(i) == 'C') {
                c = 1;
            }
            if(S.charAt(i) == 'G') {
                g = 1;
            }
            A[i+1] = A[i] + a;
            C[i+1] = C[i] + c;
            G[i+1] = G[i] + g;
        }

        int[] ans = new int[P.length];
        for(int i=0; i<P.length; i++) {
            if(A[Q[i]+1] - A[P[i]] > 0) {
                ans[i] = 1;
            } else if(C[Q[i]+1] - C[P[i]] > 0) {
                ans[i] = 2;
            } else if(G[Q[i]+1] - G[P[i]] > 0) {
                ans[i] = 3;
            } else {
                ans[i] = 4;
            }
        }
        return ans;
    }
}