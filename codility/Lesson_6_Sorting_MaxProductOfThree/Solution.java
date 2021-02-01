import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(solution(new int[] {-3,1,2,-2,5,6})); //-3,-2,1,2,5,6
        System.out.println(solution(new int[] {-5, 5, -5, 4}));
    }
    public static int solution(int[] A) {
        Arrays.sort(A);
        // マイナスの数字2つ、最大値と想定される値を掛け合わした場合
        int tmp1 = A[0] * A[1] * A[A.length-1];
        // 最大値と想定される値から3つを掛け合わせた場合
        int tmp2 = A[A.length-1] * A[A.length-2] * A[A.length-3];
        return Math.max(tmp1,tmp2);
    }
}