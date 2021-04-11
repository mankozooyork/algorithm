package AtCoder.ABC198;
import java.util.Scanner;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();

        for(int i=0; i<10; i++) {
            StringBuilder tmp = new StringBuilder(n);
            String rev = tmp.reverse().toString();
            if(rev.equals(n)) {
                System.out.println("Yes");
                return;
            }
            n = "0" + n;
        }
        System.out.println("No");
    }
}
