//Quiz 13549

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class HideAndSeek3 {
    static int max = 100000;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] dist = new int[max + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[N] = 0;

        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerFirst(N); // 시작점 삽입

        while (!dq.isEmpty()) {
            int cur = dq.pollFirst(); // 항상 앞에서 꺼냄

            if (cur == K) {
                System.out.println(dist[cur]);
                return;
            }

            int[] next = {cur - 1, cur + 1, cur * 2};

            for (int i = 0; i < 3; i++) {
                if (next[i] >= 0 && next[i] <= max) {
                    int newDist = (i == 2) ? dist[cur] : dist[cur] + 1;
                    if (newDist < dist[next[i]]) { // 더 짧으면 갱신
                        dist[next[i]] = newDist;
                        if (i == 2) {
                            dq.offerFirst(next[i]);
                        } else {
                            dq.offerLast(next[i]);
                        }
                    }
                }
            }
        }
    }
}
