//Quiz 7576

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Tomato {
    static int n, m;
    static int[][] map;
    static Queue<int[]> q = new LinkedList<>();

    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static void bfs(){

        while(!q.isEmpty()){
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m) continue;

                if(map[nx][ny] == 0){
                    map[nx][ny] = map[x][y] + 1;
                    q.offer(new int[]{nx,ny});
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if(map[i][j] == 1){
                    q.offer(new int[]{i,j});
                }
            }
        }

        bfs();

        int max = 0;

        // ⭐ 결과 검사
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(map[i][j] == 0){
                    System.out.println(-1);
                    return;
                }
                max = Math.max(max, map[i][j]);
            }
        }

        System.out.println(max - 1);
    }
}
