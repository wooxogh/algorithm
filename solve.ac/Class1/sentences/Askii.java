//Quiz 11654

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Askii {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch = br.readLine().charAt(0);

        System.out.println((int) ch);
    }
}
