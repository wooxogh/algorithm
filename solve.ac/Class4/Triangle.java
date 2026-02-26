//Quiz 1932

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Triangle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        int[][] cost = new int[T][T];
        int[][] dp = new int[T][T];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                cost[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = cost[0][0];

        for (int i = 1; i < T; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i-1][j] + cost[i][j];
                } 
                else if (j == i) {
                    dp[i][j] = dp[i-1][j-1] + cost[i][j];
                } 
                else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + cost[i][j];
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < T; i++) {
            answer = Math.max(answer, dp[T-1][i]);
        }

        System.out.println(answer);

    }
}
