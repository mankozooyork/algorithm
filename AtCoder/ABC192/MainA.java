package AtCoder.ABC192;
import java.util.*;
class MainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();

        int mod = x % 100;
        System.out.println(100-mod);
    }
}