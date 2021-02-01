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

        printAnswer(a, n);

        for(int i=1; i<n; i++) {
            int currentNumber = a[i];
            // 現在の1つ前のindexをソート済とする
            int sortedTargetIndex = i-1;
            // ソート済indexの数字より現在の数が小さい場合
            while(sortedTargetIndex >= 0 && a[sortedTargetIndex] > currentNumber) {
                // sort済indexからひとつ後ろにずらした位置に現状での最大値をセット
                a[sortedTargetIndex+1] = a[sortedTargetIndex];
                // 一つ前のindexにも戻って再度チェック
                sortedTargetIndex--;
            }
            // ソート済みindex(これは上部で変動する)より+1したindex(currentNumberより小さい値が存在するindex)に代入
            a[sortedTargetIndex+1] = currentNumber;
            printAnswer(a, n);
        }
    }
    public static void printAnswer(int[] a, int n) {
        for(int i=0; i<n; i++) {
            if(i == n-1) System.out.println(a[i]);
            else System.out.print(a[i] + " ");
        }
    }
}
