package functions;
//Quiz 2475

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class VerifaicationNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;

        for (int i = 0; i < 5; i++) {
            long a = Long.parseLong(st.nextToken());
            result += a * a;
        }

        System.out.println(result % 10);

    }
}
