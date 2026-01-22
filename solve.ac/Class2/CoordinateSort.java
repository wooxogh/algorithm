//Quiz 11650

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class CoordinateSort {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<String> strArr = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            String a = br.readLine();
            strArr.add(a);
        }

        Collections.sort(strArr, (a, b) -> {
            StringTokenizer st_a = new StringTokenizer(a);
            StringTokenizer st_b = new StringTokenizer(b);

            int x_a = Integer.parseInt(st_a.nextToken());
            int x_b = Integer.parseInt(st_b.nextToken());

            if (x_a != x_b) {
                return x_a - x_b;
            } else {
                int y_a = Integer.parseInt(st_a.nextToken());
                int y_b = Integer.parseInt(st_b.nextToken());
                return y_a - y_b;
            }
        });

        StringBuilder sb = new StringBuilder();
        for (String s : strArr) {
            sb.append(s).append('\n');
        }
        System.out.print(sb);
    }
}
