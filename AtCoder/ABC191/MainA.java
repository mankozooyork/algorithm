package AtCoder.ABC191;

import java.util.Scanner;
public class MainA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int t = sc.nextInt();
        int s = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        double seconds = (double)d/(double)v;
        if((double)t <= seconds && seconds <= (double)s) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}