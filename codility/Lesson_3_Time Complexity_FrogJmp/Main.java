class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        double cnt = ((double)Y - (double)X) / D;
        cnt = Math.ceil(cnt);
        return (int)cnt;
    }
}