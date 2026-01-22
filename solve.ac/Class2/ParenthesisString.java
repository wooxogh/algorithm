//Quiz 9012

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class ParenthesisString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Number> stack = new Stack<>();
            String str = br.readLine();
            String result = "YES";
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '(') {
                    stack.push(1);
                } else {
                    if (stack.size() == 0) {
                        result = "NO";
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.size() != 0) {
                result = "NO";
            }

            bw.write(result);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
