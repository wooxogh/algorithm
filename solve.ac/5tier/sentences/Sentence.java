package sentences;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sentence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String sen = br.readLine();
        int a = Integer.parseInt(br.readLine());

        System.out.println(sen.charAt(a-1));
    }
}
