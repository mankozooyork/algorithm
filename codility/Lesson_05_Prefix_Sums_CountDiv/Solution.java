package codility.Lesson_05_Prefix_Sums_CountDiv;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(6,11,2));
    }
    public static int solution(int A, int B, int K) {
        int b = B/K;
        int a = (A>0 ? (A-1)/K : 0);
        if(A == 0) {
            b++;
        }
        return b-a;
    }
}