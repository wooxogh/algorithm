import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class AMinusB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split("\\s+");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        System.out.println(a - b);
    }
}
