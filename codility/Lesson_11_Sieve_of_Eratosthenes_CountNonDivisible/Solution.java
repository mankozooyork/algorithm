package codility.Lesson_11_Sieve_of_Eratosthenes_CountNonDivisible;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {3,1,2,3,6})));
    }
    public static int[] solution(int[] A) {
        int[] counts = new int[A.length*2+1];
        for(int i=0; i<A.length; i++) {
            counts[A[i]]++;
        }

        int[] ans = new int[A.length];
        for(int i=0; i<A.length; i++) {
            int divisibleCount = 0;
            // try to divide A[i] by the number from 1 to sqrt(A[i])
            for(int j=1; j*j<=A[i]; j++) {
                if(A[i] % j == 0) {
                    // just add count[j] because it's already counted
                    divisibleCount += counts[j];
                    if(A[i] / j != j) {
                        // don't forget to put opposite number if it can
                        divisibleCount += counts[A[i] / j];
                    }
                }
            }
            // substract the divisors that will be an answer
            // answer is list all the number that non-divisible number for A[i]
            ans[i] = A.length - divisibleCount;
        }
        return ans;
    }
}
