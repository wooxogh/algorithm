//Quiz 1978
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int comp = Integer.parseInt(st.nextToken());
        
            if (comp < 2) continue;
        
            boolean prime = true;
            for (int j = 2; j < comp; j++) {
                if (comp % j == 0) {
                    prime = false;
                    break;
                }
            }
        
            if (prime) result++;
        }
        System.out.println(result);
    }
}
