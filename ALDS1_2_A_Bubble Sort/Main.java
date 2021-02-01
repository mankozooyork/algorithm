import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i=0; i<n; i++) {
        a[i] = sc.nextInt();
      }
      sc.close();

      // 何回交換したかを出力するためのカウント
      int swapCount = 0;
      // 内ループのカウント
      int loopCount = 0;
      boolean isNeededSwap = true;
      while(isNeededSwap) {
        isNeededSwap = false;
        // ループ最大回数は毎度-1とする
        for(int i=n-1; i>= loopCount+1; i--) {
          // 1つ前のindexの数字のほうが大きければswap
          if(a[i] < a[i-1]) {
            int tmp = a[i-1];
            a[i-1] = a[i];
            a[i] = tmp;
            isNeededSwap = true;
            swapCount++;
          }
        }
        loopCount++;
      }

      for(int i=0; i<n; i++) {
        if(i == n-1) System.out.println(a[i]);
        else System.out.print(a[i] + " ");
      }
      System.out.println(swapCount);
    }
}