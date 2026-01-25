//Quiz 1003

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int zero = 0;
            int one = 0;
            
            if (fibonacci(num) == 0) zero += 1;
            else if (fibonacci(num) == 1) one += 1;

            sb.append(zero + ' ' + one).append('\n');
        }
        
        System.out.println(sb);
    }

    public static Integer fibonacci(Integer i) {
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}
