package codility.Lesson_05_Prefix_Sums_MinAvgTwoSlice;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {4,2,2,5,1,5,8}));
    }
    public static int solution(int[] A) {
        int ans = 0;
        double minAvg = Double.MAX_VALUE;
        int sumFor2Values, sumFor3Values = 0;
        for(int i=0; i<A.length-2; i++) {
            sumFor2Values = A[i] + A[i+1];
            if(sumFor2Values/2.0 < minAvg) {
                minAvg = sumFor2Values/2.0;
                ans = i;
            }

            sumFor3Values = sumFor2Values + A[i+2];
            if(sumFor3Values/3.0 < minAvg) {
                minAvg = sumFor3Values/3.0;
                ans = i;
            }
        }

        if((A[A.length-2] + A[A.length-1]) / 2.0 < minAvg) {
            ans = A.length-2;
        }

        return ans;
    }
}