//Quiz 1697

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class HideAndSeek {
    static int MAX = 100000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[MAX + 1];
        int[] dist = new int[MAX + 1];

        Queue<Integer> q = new LinkedList<>();
        q.offer(n);
        visited[n] = true;

        while (!q.isEmpty()) {
            int cur = q.poll();

            if (cur == k) {
                System.out.println(dist[cur]);
                return;
            }

            int[] next = {cur - 1, cur + 1, cur * 2};

            for (int nx : next) {
                if (nx >= 0 && nx <= MAX && !visited[nx]) {
                    visited[nx] = true;
                    dist[nx] = dist[cur] + 1;
                    q.offer(nx);
                }
            }
        }
    }
}
