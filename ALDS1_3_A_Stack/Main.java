import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack();
        Util ut = new Util();
        
        String input = sc.nextLine();
        sc.close();

        String[] words = input.split(" ");
        for(String s: words) {
            if(ut.isNumeric(s)) {
                st.push(Integer.parseInt(s));
            } else {
                if(s.equals("+")) {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a+b);
                } else if(s.equals("-")) {
                    int c = st.pop();
                    int d = st.pop();
                    st.push(d-c);
                } else if(s.equals("*")) {
                    int e = st.pop();
                    int f = st.pop();
                    st.push(e*f);
                }
            }
        }
        System.out.println(st.pop());
    }
}

class Stack {
    int top;
    int[] stack;
    Stack() {
        this.top = 0;
        this.stack = new int[1000];
    }
    
    void push(int num) {
        stack[++top] = num;
    }

    int pop() {
        top--;
        return stack[top+1];
    }
}

class Util {
    boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int tmp = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}