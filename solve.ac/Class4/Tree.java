//Quiz 11725

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Tree {
    static ArrayList<Integer>[] graph;
    static int[] parent;
    static boolean[] visited;

    static void dfs(int x) {
        visited[x] = true;

        for(int next : graph[x]){
            if(!visited[next]) {
                parent[next] = x;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        graph = new ArrayList[T + 1];
        parent = new int[T + 1];
        visited = new boolean[T + 1];

        for(int i = 1; i <= T; i++){
            graph[i] = new ArrayList<>();
        }
        
        for (int i = 1; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= T; i++) {
            sb.append(parent[i]).append("\n");
        }

        System.out.println(sb);
    }
}
