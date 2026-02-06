//Quiz 1927

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;

public class LeastHeap {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0 && minHeap.isEmpty()) {
                bw.write(0 + "\n");
            } else if (n == 0 && !minHeap.isEmpty()) {
                int num = minHeap.poll();
                bw.write(String.valueOf(num) + "\n");
            } else {
                minHeap.offer(n);
            }
        }
        bw.flush();
        bw.close();
    }
}
