//Quiz 1992

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QuadTree {
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;

    static void solve(int x, int y, int size) {
        int color = arr[x][y];
        boolean same = true;

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != color) {
                    same = false;
                    break;
                }
            }
            if (!same) break;
        }

        if (same) {
            sb.append(color);
            return;
        }
        
        int half = size / 2;
        sb.append('(');
        solve(x, y, half);
        solve(x, y + half, half);
        solve(x + half, y, half);
        solve(x + half, y + half, half);
        sb.append(')');
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        solve(0, 0, N);

        System.out.println(sb);
    }
}
