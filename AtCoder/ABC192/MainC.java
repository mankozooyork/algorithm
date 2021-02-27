package AtCoder.ABC192;
import java.util.*;
public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] k = sc.next().toCharArray();
        int n = sc.nextInt();
        sc.close();

        for(int i=0; i<n; i++) {
            Arrays.sort(k);
            int idx = 0;
            char[] rk = new char[k.length];
            for(int j=k.length-1; j>=0; j--) {
                rk[idx] = k[j];
                idx++;
            }
            int g1 = Integer.parseInt(new String(k));
            int g2 = Integer.parseInt(new String(rk));
            int ik = Math.abs(g1 - g2);
            k = ("" + ik).toCharArray();
        }
        System.out.println(Integer.parseInt(new String(k)));
    }
}
