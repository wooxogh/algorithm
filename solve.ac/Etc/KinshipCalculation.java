//Quiz 2644

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class KinshipCalculation {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int targetN, targetM, count;

    static int bfs(int start) {
        Queue<int[]> q = new LinkedList<>();
        visited[start] = true;
        q.offer(new int[]{start, 0});
    
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int node = cur[0];
            int depth = cur[1];
    
            if (node == targetN) return depth;
    
            for (int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    q.offer(new int[]{next, depth + 1});
                }
            }
        }
    
        return -1;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        graph = new ArrayList[people + 1];
        visited = new boolean[people + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        targetM = Integer.parseInt(st.nextToken());
        targetN = Integer.parseInt(st.nextToken());

        int K = Integer.parseInt(br.readLine());

        for (int i = 1; i <= people; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        System.out.println(bfs(targetM));
    }
}
