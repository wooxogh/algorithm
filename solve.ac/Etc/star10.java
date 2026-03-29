//Quiz 2447

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class star10 {
    static char[][] arr;

    static void makeStar(int x, int y, int size, boolean blank) {
        if (blank) {
            for (int i = x; i < x + size; i++) {
                for (int j = y; j < y + size; j++) {
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        if (size == 1) {
            arr[x][y] = '*';
            return;
        }

        int step = size / 3;
        int count = 0;
        for (int i = x; i < x + size; i += step) {
            for (int j = y; j < y + size; j += step) {
                count++;
                if (count == 5) {
                    makeStar(i, j, step, true);
                } else {
                    makeStar(i, j, step, false);
                }
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        arr = new char[N][N];

        makeStar(0, 0, N, false);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
