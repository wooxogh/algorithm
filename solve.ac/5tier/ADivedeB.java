import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ADivedeB {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().trim().split("\\s+");
        double a = Double.parseDouble(input[0]);
        double b = Double.parseDouble(input[1]);

        System.out.println(a / b);
    }
}
