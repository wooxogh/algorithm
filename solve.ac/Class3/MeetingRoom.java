//Quiz 1931

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MeetingRoom {
    static int[][] term;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        term = new int[T][2];

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            term[i][0] = Integer.parseInt(st.nextToken());
            term[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(term, (a, b) -> {
            if (a[1] == b[1]) return a[0] - b[0];
            return a[1] - b[1];
        });

        int count = 0;
        int lastEnd = 0;

        for (int i = 0; i < T; i++) {
            if (term[i][0] >= lastEnd) {
                count++;
                lastEnd = term[i][1];
            }
        }

        System.out.println(count);
    }
}
