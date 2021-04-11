package codility.Lesson_07_Stacks_and_Queues_Nesting;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution("(()(())())"));
        System.out.println(solution("())"));
        // This case should be not "properly nested"
        System.out.println(solution("))(("));
    }
    public static int solution(String S) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '(') {
                s.push(S.charAt(i));
            } else {
                if(s.isEmpty()) {
                    return 0;
                } else {
                    if(s.peek() == '(') {
                        s.pop();
                    }
                }
            }
        }
        return s.isEmpty() ? 1 : 0;
    }
}