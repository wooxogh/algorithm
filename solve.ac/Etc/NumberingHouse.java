//Quiz 2667

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberingHouse {
    static int[][] arr;
    static boolean[][] visited;
    static int N;

    static void dfs(int x) {

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

        dfs(0);

        
    }
}
