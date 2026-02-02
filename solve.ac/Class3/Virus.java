//Quiz 2606

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Virus {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    static void dfs(int node) {
        visited[node] = true;

        for (int next : graph[node]) {
            if (!visited[next]) {
                count++;
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computers = Integer.parseInt(br.readLine());
        int links = Integer.parseInt(br.readLine());

        graph = new ArrayList[computers + 1];
        visited = new boolean[computers + 1];

        for (int i = 1; i <= computers; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < links; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);

        System.out.println(count);
    }
}
