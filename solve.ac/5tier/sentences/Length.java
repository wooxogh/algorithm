package sentences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Length {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ch = br.readLine().length();

        System.out.println(ch);
    }
}
