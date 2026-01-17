package operations;
//Quiz 11720

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        int result = 0;

        for (int i = 0; i < a; i++) {
            int digit = Integer.valueOf(nums.charAt(i)) - '0';
            result += digit;
        }
        System.out.println(result);
    }
}
