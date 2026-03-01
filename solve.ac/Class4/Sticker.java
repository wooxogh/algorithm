//Quiz 9465

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sticker {
    static int[][] arr, dp;
    static int N;

    static Integer dp() {
        if (N == 1) {
            return Math.max(arr[0][0], arr[1][0]);
        }

        dp[0][0] = arr[0][0];
        dp[1][0] = arr[1][0];
        dp[0][1] = dp[1][0] + arr[0][1];
        dp[1][1] = dp[0][0] + arr[1][1];

        for (int i = 2; i < N; i++) {
            dp[0][i] = Math.max(dp[1][i-1], dp[1][i-2]) + arr[0][i];
            dp[1][i] = Math.max(dp[0][i-1], dp[0][i-2]) + arr[1][i];
        }

        return Math.max(dp[0][N - 1], dp[1][N - 1]);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            N = Integer.parseInt(br.readLine());
            arr = new int[2][N];
            dp = new int[2][N];
            for (int row = 0; row < 2; row++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[row][j] = Integer.parseInt(st.nextToken());
                }
            }
            sb.append(dp()).append("\n");
        }

        System.out.println(sb);
    }
}
