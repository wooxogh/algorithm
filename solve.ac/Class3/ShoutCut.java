//Quiz 14940

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ShoutCut {
    static int n, m, target_x, target_y;
    static int[][] map, result;
    static boolean[][] visited;
    
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};

    static void bfs(int sx, int sy) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sx, sy});
        visited[sx][sy] = true;

        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int x = cur[0];
            int y = cur[1];

            for (int d=0; d<4; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx<0 || ny<0 || nx>=n || ny>=m) continue;
                if (visited[nx][ny]) continue;
                if (map[nx][ny]==0) continue;

                visited[nx][ny] = true;
                result[nx][ny] = result[x][y] + 1;
                q.offer(new int[]{nx, ny});
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        result = new int[n][m];
        visited = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());

                if (map[i][j] == 2) {
                    target_x = i;
                    target_y = j;
                }
            }
        }

        bfs(target_x, target_y);

        StringBuilder sb = new StringBuilder();

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if (map[i][j]==0) sb.append(0).append(" ");
                else if (!visited[i][j]) sb.append(-1).append(" ");
                else sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }

        System.out.print(sb);        
    }
}
