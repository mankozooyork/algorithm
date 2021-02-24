package codility.Lesson_10_MinPerimeterRectangle;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(30));
    }

    public static int solution(int N) {
        int loopCnt = (int)Math.sqrt(N);
        int ans = Integer.MAX_VALUE;
        for(int i=1; i<=loopCnt; i++) {
            if(N % i == 0) {
                int tmp = N / i;
                ans = Math.min(ans, (tmp+i)*2);
            }
        }
        return ans;
    }
}