package codility.Lesson_01_Iterations_BinaryGap;

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String n = Integer.toBinaryString(N);
        char[] cn = n.toCharArray();
        int cnt = 0;
        int ans = 0;
        for(char c: cn) {
            if(c == '0') {
                cnt++;
            } else {
                if(ans < cnt) {
                    ans = cnt;
                } 
                cnt = 0;
            }
        }
        return ans;
    }
}