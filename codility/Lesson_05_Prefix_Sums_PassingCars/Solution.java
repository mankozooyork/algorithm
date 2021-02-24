public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {0,1,0,1,1}));
    }
    public static int solution(int[] A) {
        int east = 0;
        int cnt = 0;
        for(int i=0; i<A.length; i++) {
            if(A[i] == 0) {
                east++;
            } else {
                cnt += east;
                if(cnt > 1000000000) {
                    return -1;
                }
            }
        }
        return cnt;
    }
}