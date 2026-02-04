//Quiz 9095

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class Plus123 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] list = new int[11];
        list[0] = 1;
        list[1] = 2;
        list[2] = 4;

        for (int i = 3; i < 11; i++) {
            list[i] = Integer.valueOf(list[i - 1]) + Integer.valueOf(list[i - 2]) + Integer.valueOf(list[i - 3]);
        }

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(br.readLine());
            System.out.println(Integer.valueOf(list[m - 1]));
        }
    }
}
