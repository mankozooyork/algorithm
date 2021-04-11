package AtCoder.ABC196;
import java.util.Scanner;
public class MainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        sc.close();

        int x = Math.max(a,b);
        int y = Math.min(c,d);
        System.out.println(x-y);
    }
}
