import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {10,2,5,1,8,20}));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        for(int i=2; i<A.length; i++) {
            if((long)A[i] < (long)A[i-2] + (long)A[i-1]) {
                return 1;
            }
        }
        return 0;
    }
}