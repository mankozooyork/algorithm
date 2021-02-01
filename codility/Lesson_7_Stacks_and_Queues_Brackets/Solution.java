import java.util.Stack;
public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(new String("{[()()]}")));
    }
    public static int solution(String S) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<S.length(); i++) {
            if(S.charAt(i) == '{') {
                stack.push('}');
            }
            if(S.charAt(i) == '[') {
                stack.push(']');
            }
            if(S.charAt(i) == '(') {
                stack.push(')');
            }
            if(stack.size() == 0) {
                return 0;
            }
            else {
                if(S.charAt(i) == ')' || S.charAt(i) == '}' || S.charAt(i) == ']') {
                    if(stack.pop() != S.charAt(i)) {
                        return 0;
                    }
                }
            }                
        }
        if(stack.empty()) {
            return 1;
        } else {
            return 0;
        }
    }
}