//Quiz 1074

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;

        int size = 1;
        for (int i = 0; i < N; i++) {
            size *= 2;
        }

        while (size > 1) {
            size /= 2;
            if (r > (size - 1) && c > (size - 1)) {
                result += size * size * 3;
                r -= size;
                c -= size;
            }
            else if (r > (size - 1) && c <= (size - 1)) {
                result += size * size * 2;
                r -= size;
            }
            else if (r <= (size - 1) && c > (size - 1)) {
                result += size * size * 1;
                c -= size;
            }
            else result += size * size * 0;
        }

        System.out.println(result);
    }
}
