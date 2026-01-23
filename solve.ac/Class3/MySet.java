//Quiz 11723

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MySet {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        boolean[] set = new boolean[21];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operator = st.nextToken();

            switch (operator) {
                case "add":
                    set[Integer.parseInt(st.nextToken())] = true;
                    break;
                case "remove":
                    set[Integer.parseInt(st.nextToken())] = false;
                    break;
                case "check":
                    sb.append(set[Integer.parseInt(st.nextToken())] ? 1 : 0).append('\n');
                    break;
                case "toggle":
                    int x = Integer.parseInt(st.nextToken());
                    set[x] = !set[x];
                    break;
                case "all": 
                    Arrays.fill(set, true);
                    break;
                case "empty":
                    Arrays.fill(set, false);
                    break;
                default:
                    break;
            }
        }
        System.out.print(sb);
    }
}
