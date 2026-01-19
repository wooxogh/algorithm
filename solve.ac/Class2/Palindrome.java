//Quiz 1259

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String a = br.readLine();

            if (a == null) break;
            if (a.equals("0")) break;

            boolean isPalindrome = true;
            int len = a.length();

            for (int i = 0; i < len / 2; i++) {
                if (a.charAt(i) != a.charAt(len - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
