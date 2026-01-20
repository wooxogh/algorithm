//Quiz 11050

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class nCr {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int a = 1;
        int b = 1;

        for (int i = 0; i < r; i++) {
            a *= (n - i);
            b *= (i + 1);
        }

        System.out.println(a / b);
    }
}
