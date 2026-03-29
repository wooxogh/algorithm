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

        // 시작 좌표로부터 size * size 크기의 색종이가 존재하지 않다면(!same) -> 사이즈를 절반으로 줄이고 공간을 4분할하여 탐색 (재귀)
        int half = size / 2;

        solve(x, y, half);
        solve(x, y + half, half);
        solve(x + half, y, half);
        solve(x + half, y + half, half);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 행렬 생성
        map = new int[T][T];
        for (int i = 0; i < T; i++) {
            //입력받은 string을 띄어쓰기 단위로 받기 위한 생성자
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < T; j++) {
                // 0 1 0 1 이라면 nextToken()을 통해여 0, 1, 0, 1 하나씩 인자로 받아 2차 행렬에 저장
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        solve(0, 0, T);
        System.out.println(white);
        System.out.println(blue);
        }
}
