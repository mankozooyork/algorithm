package ALDS1_4_B_Binary_Search;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i=0; i<n; i++) {
            s[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] t = new int[q];
        for(int i=0; i<q; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
        
        int sum = 0;
        for(int i=0; i<q; i++) {
            sum += binarySearch(s, t[i]);
        }

        System.out.println(sum);
    }
    public static int binarySearch(int[] s, int key) {
        int left = 0;
        // DO NOT substract -1 from length!
        int right = s.length;
        int mid = 0;

        while(left < right) {
            mid = (left+right)/2;
            if(key == s[mid]) return 1;
            if(key > s[mid]) left = mid+1;
            else right = mid;
        }
        return 0;
    }
}
