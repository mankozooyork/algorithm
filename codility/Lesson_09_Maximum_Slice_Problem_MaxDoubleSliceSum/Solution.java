package codility.Lesson_09_Maximum_Slice_Problem_MaxDoubleSliceSum;

class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {3,2,6,-1,4,5,-1,2}));
    }
    public static int solution(int[] A) {
        int[] maxLeft = new int[A.length];
        int[] maxRight = new int[A.length];

        for(int i=1; i<A.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i-1]+A[i],0);
        }

        for(int i=A.length-2; i>=0; i--) {
            maxRight[i] = Math.max(maxRight[i+1]+A[i], 0);
        }

        int ans = 0;
        for(int i=1; i<A.length-1; i++) {
            ans = Math.max(maxLeft[i-1] + maxRight[i+1], ans);
        }

        return ans;
    }
}