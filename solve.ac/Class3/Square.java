//Quiz 2630

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Square {
    static int white;
    static int blue;
    static int[][] map;
    
    static void solve(int x, int y, int size) {
        int color = map [x][y];
        boolean same = true;

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (map[i][j] != color) {
                    same = false;
                    break;
                }
            }
            if (!same) break;
        }

        if (same) {
            if (color == 0) white++;
            else blue++;
            return;
        }

        int half = size / 2;

        solve(x, y, half);
        solve(x, y + half, half);
        solve(x + half, y, half);
        solve(x + half, y + half, half);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 행렬 완성하기
        map = new int[T][T];
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < T; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0, T);
        System.out.println(white);
        System.out.println(blue);
        }
}
