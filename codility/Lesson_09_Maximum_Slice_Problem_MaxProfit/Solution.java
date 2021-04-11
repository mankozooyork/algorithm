package codility.Lesson_09_Maximum_Slice_Problem_MaxProfit;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {23171,21011,21123,21366,21013,21367}));
    }
    public static int solution(int[] A) {
        int maxEnding = 0;
        int ans = 0;
        for(int i=1; i<A.length; i++) {
            maxEnding = Math.max(A[i] - A[i-1] + maxEnding, 0);
            ans = Math.max(maxEnding, ans);
        }

        return ans;
    }
}


