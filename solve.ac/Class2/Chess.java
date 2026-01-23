//Quiz 1018

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Chess {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int answer = Integer.MAX_VALUE;

        // 8x8 시작 좌표
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                answer = Math.min(answer, repaint(board, i, j));
            }
        }

        System.out.println(answer);
    }

    // (x, y)에서 시작하는 8x8에서 최소 칠하기 수
    static int repaint(char[][] board, int x, int y) {
        int countW = 0; // W로 시작
        int countB = 0; // B로 시작

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                char current = board[x + i][y + j];

                // W 시작 기준
                if ((i + j) % 2 == 0) {
                    if (current != 'W') countW++;
                    if (current != 'B') countB++;
                } else {
                    if (current != 'B') countW++;
                    if (current != 'W') countB++;
                }
            }
        }
        return Math.min(countW, countB);
    }
}
