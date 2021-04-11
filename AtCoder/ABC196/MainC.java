package AtCoder.ABC196;
import java.util.Scanner;
public class MainC {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Long n = sc.nextLong();
        sc.close();
        for(int i = 0; ; i++) {
            if(Long.parseLong(String.valueOf(i) + String.valueOf(i)) > n) {
            	System.out.println(i-1);
            	return;
            }
        }
	}
}
