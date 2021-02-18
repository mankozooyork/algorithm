package codility.Lesson_11_Sieve_of_Eratosthenes;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[] {3,1,2,3,6})));
    }
    public static int[] solution(int[] A) {
        int[] count = new int[A.length*2+1];
        for(int i=0; i<A.length; i++) {
            count[A[i]]++;
        }

        int[] ans = new int[A.length];
        for(int i=0; i<A.length; i++) {
            int divisors = 0;
            // try to find the number that can be divided by the number from 1
            for(int j=1; j*j<=A[i]; j++) {
                if(A[i] % j == 0) {
                    // just add count[j] because it's already counted
                    divisors += count[j];
                    if(A[i] / j != j) {
                        // don't forget to put opposite number if it can
                        divisors += count[A[i] / j];
                    }
                }
            }
            // substract the divisotrs that will be an answer
            ans[i] = A.length - divisors;
        }
        return ans;
    }
}
