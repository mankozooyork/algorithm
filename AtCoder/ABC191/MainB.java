package AtCoder.ABC191;

import java.util.*;
public class MainB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int tmp = sc.nextInt();
            if(tmp != x) {
                a.add(tmp);
            }
        }
        sc.close();
        if(a.size() == 0) {
            System.out.println("");
        } else {
            for(int i=0; i<a.size()-1; i++) {
                System.out.print(a.get(i) + " ");
            }
            System.out.println(a.get(a.size()-1));
        }
    }
}