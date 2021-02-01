import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int sum = 0;
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        for(int i=0; i<q; i++) {
            int key = sc.nextInt();
            if(search(a, n, key)) {
                sum++;
            }
        }
        System.out.println(sum);
        sc.close();
    }

    public static boolean search(int[] a, int n, int key) {
        int i = 0;
        a[n] = key;
        while(a[i] != key) {
            i++;
        }
        return n != i;
    }

}
