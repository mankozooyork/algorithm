package AtCoder.ABC192;
import java.util.*;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = sc.next().toCharArray();
        sc.close();

        boolean isUnreadable = false;
        for(int i=0; i<c.length; i++) {
            if(i % 2 == 0) {
                isUnreadable = Character.isLowerCase(c[i]);
            } else {
                isUnreadable = Character.isUpperCase(c[i]);
            }
            if(!isUnreadable) { 
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
