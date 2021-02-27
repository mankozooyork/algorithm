package AtCoder.ABC193;
import java.util.*;
public class MainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();

        double ratio = 0.0;
        ratio = b / a;
        ratio = 1 - ratio;
        System.out.println(ratio * 100);

    }
    
}
