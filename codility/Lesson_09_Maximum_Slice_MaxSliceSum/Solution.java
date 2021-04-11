package codility.Lesson_09_Maximum_Slice_MaxSliceSum;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,2,-6,4,0}));
        System.out.println(solution(new int[] {10}));
    } 
    public static int solution(int[] A) {
        int maxEnding = A[0];
        int maxPrevious = A[0];
        int ans = A[0];
        for(int i=1; i<A.length; i++) {
            maxEnding = Math.max(A[i]+maxPrevious, A[i]);
            maxPrevious = maxEnding;
            ans = Math.max(maxEnding, ans);
        }

        return ans;        
    }
}