//Quiz 2839

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sugar {
        public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int ans = Integer.MAX_VALUE;

        for (int five = n / 5; five >= 0; five--) {
            int remain = n - 5 * five;
            if (remain % 3 == 0) {
                ans = Math.min(ans, five + remain / 3);
            }
        }

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }
}
