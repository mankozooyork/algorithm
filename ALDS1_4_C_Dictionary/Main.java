package ALDS1_4_C_Dictionary;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().run();
    }

    private void run() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = new String[2];
        String[] order = new String[n]; 
        String[] key = new String[n]; 
        HashSet set = new HashSet();
        for(int i=0; i<n; i++) {
            input = br.readLine().split(" ");
            order[i] = input[0];
            key[i] = input[1];
            if(order[i].equals("insert")) {
                set.insert(key[i]);
            } else {
                if(set.find(key[i])) {
                    System.out.println("yes");
                } else {
                    System.out.println("no");
                }
            }
        }
    }

    private class HashSet {
        final int M = 1046527;
        String[] H = new String[M];

        private void insert(String str) {
            int key = getKey(str);
            int i = 0;
            while(true) {
                int h = h(key, i) % M;
                if(H[h] == null) {
                    H[h] = str;
                    return;
                }
                if(H[h] != null && !H[h].equals(str)) {
                    i++;
                    continue;
                }
                if(H[h].equals(str)) return;
            }
        }
    
        private boolean find(String str) {
            int key = 0;
            int i = 0;
            key = getKey(str);
            while(true) {
                int h = h(key, i) % M;
                if(H[h] == null) return false;
                if(H[h].equals(str)) return true;
                if(H[h] != null && !H[h].equals(str)) {
                    i++;
                    continue;
                }
            }
        }
    
        private int getKey(String str) {
            int sum = 0;
            int p = 1;
            for(int i=0; i<str.length(); i++) {
                sum += p*(getChar(str.charAt(i)));
                p *= 5;
            }
            return sum;
        }
    
        private int getChar(char ch) {
            if(ch == 'A') return 1;
            else if(ch == 'C') return 2;
            else if(ch == 'G') return 3;
            else if(ch == 'T') return 4;
            else return 0;
        }
    
        private int h(int key, int i) {
            return (M % key) + i * (1 + key % (M - 1));
        }
    }
}
