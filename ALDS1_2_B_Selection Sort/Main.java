import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int swapCount = 0;
        // 外側のループはソート済みを意味する
        for(int i=0; i<n-1; i++) {
            int minimumValueIndex = i;
            // ソート済みでない対象arrayの中で最も小さい値のindexを発見する
            for(int j=i; j<n; j++) {
                if(a[j] < a[minimumValueIndex]) minimumValueIndex = j;
            }
            if(i != minimumValueIndex) {
                int tmp = a[i];
                a[i] = a[minimumValueIndex];
                a[minimumValueIndex] = tmp;
                swapCount++;
            }
        }

        System.out.println(Arrays.toString(a).replace("[", "").replace(",","").replace("]", ""));
        System.out.println(swapCount);
    }
}