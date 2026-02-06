//Quiz 11724

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ConnectedComponent {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    static void dfs(int node) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        graph = new ArrayList[node + 1];
        visited = new boolean[node + 1];

        for (int i = 1; i <= node; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= node; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }
}
