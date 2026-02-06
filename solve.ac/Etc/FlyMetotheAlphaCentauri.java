//Quiz 1011

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class FlyMetotheAlphaCentauri {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            long d = m - n;
            long k = (long)Math.sqrt(d);

            long ans;

            if (d == k * k) ans = 2 * k - 1;
            else if (d <= k * k + k) ans = 2 * k;
            else ans = 2 * k + 1;

            bw.write(ans + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
