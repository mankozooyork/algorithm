package codility.Lesson_12_Euclidean_algorithm_ChocolatesByNumbers;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(10,4));
    }    
    public static int solution(int N, int M) {
        return N / GCD(N,M);
        
    }
    public static int GCD(int a, int b) {
        if(a % b == 0) return b;
        return GCD(b, a%b);
    }
}
