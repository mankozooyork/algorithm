package AtCoder.ABC194;
import java.util.*;
public class MainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int percent = a+b;

        if(percent >= 15 && b >= 8) System.out.println("1");
        else if(percent >= 10 && b >= 3) System.out.println("2");
        else if(percent >= 3) System.out.println("3");
        else System.out.println("4");
    }
}
