//Quiz 2667

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class NumberingHouse {
    static int[][] arr;
    static boolean[][] visited;
    static int N, house;

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static void dfs(int x, int y) {
        visited[x][y] = true;
        house++;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 경계 검사 및 조건 확인
            if (nx >= 0 && ny >= 0 && nx < N && ny < N) {
                if (arr[nx][ny] == 1 && !visited[nx][ny]) {
                    dfs(nx, ny); // 재귀적으로 다음 집 방문
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        visited = new boolean[N][N];

        for(int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1 && !visited[i][j]) {
                    house = 0; // 단지 시작 전 초기화
                    dfs(i, j);
                    result.add(house); // 탐색 완료 후 집 개수 저장
                }


            }
        }

        System.out.println(result.size());

        Collections.sort(result);
        for (int count : result) {
            System.out.println(count);
        }
    }
}
