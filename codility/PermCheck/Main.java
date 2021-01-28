import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,1,3,2}));
    }
    public static int solution(int[] A) {
        Set<Integer> s = new HashSet<>();

        for(int i=0; i<A.length; i++) {
            s.add(A[i]);
        }

        for(int i=1; i<=A.length; i++) {
            if(!s.contains(i)) {
                return 0;
            }
        }
        return 1;
    }
}