package AtCoder.ABC191;

import java.util.*;
import java.io.*;

class MainC {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
        char[][] s = new char[h][w];
        for(int i=0; i<h; i++) {
            s[i] = br.readLine().toCharArray();
        }
        br.close();
        int ans = 0;
        for(int i=1; i<h; i++) {
            for(int j=1; j<w; j++) {
                int cnt = 0;
                if(s[i][j] == '#') cnt++;
                if(s[i-1][j] == '#') cnt++;
                if(s[i][j-1] == '#') cnt++;
                if(s[i-1][j-1] == '#') cnt++;
                if(cnt % 2 == 1) ans++;
            }
        }
        System.out.println(ans);
    }
}