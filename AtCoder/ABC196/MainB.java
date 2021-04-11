package AtCoder.ABC196;
import java.util.Scanner;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        sc.close();
        int idx = x.indexOf(".");
        if(idx != -1) System.out.println(x.substring(0,idx));
        else System.out.println(x);
    }
}
