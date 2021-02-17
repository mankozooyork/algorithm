import java.util.*;
public class Solution5 {
    public static void main(String[] args) {
        //System.out.println(solution(24));
        //System.out.println(solution(7));
        System.out.println(solution(2147483647));
    }
    public static int solution(int N) {
        ArrayList<Integer> ans = new ArrayList<>();
        // if you loop by i*i<=N, integer will be overflown when N is 2147483647
        // using sqrt at first is much easier to calculate
        int limit = (int)Math.sqrt(N);
        for(int i=1; i<=limit; i++) {
            if(N % i == 0) {
                ans.add(i);
                if(N / i != i) ans.add(N/i);
            }
        }

        return ans.size();
    }
}