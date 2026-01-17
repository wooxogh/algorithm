package array;
//Quiz 2562

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int mark = 0;
        for (int i = 0; i < 9; i++) {
            int a = Integer.parseInt(br.readLine());
            if (a > max) {
                max = a;
                mark = i + 1;
            }
        }
        System.out.println(max);
        System.out.println(mark);
    }

}
