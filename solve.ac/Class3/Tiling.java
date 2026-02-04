//Quiz 11726

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tiling {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] list = new int[n + 1];
        list[1] = 1;
        if (n >= 2) list[2] = 2;

        for (int i = 3; i <= n; i++) {
            list[i] = (list[i - 1] + list[i - 2]) % 10007;
        }

        System.out.println(list[n]);
    }
}
