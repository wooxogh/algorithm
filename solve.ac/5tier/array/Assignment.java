//Quiz 5597
package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Assignment {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int x = Integer.parseInt(br.readLine());
            submitted[x] = true;
        }

        for (int i = 1; i <= 30; i++) {
            if (!submitted[i]) {
                System.out.println(i);
            }
        }
    }
}
