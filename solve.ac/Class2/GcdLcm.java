//Quiz 2609

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GcdLcm {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int x = a;
        int y = b;

        while (y != 0) {
            int z = x % y;
            x = y;
            y = z;
        }

        int gcd = x;
        int lcm = a * b / gcd;

        System.out.println(gcd);
        System.out.println(lcm);
    }
}

