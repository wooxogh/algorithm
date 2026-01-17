//Quiz 2744

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Convert {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        char c;

        String st = br.readLine();
        for (int i = 0; i < st.length(); i++) {
            c = st.charAt(i);
            if ((c <= 90) && (c >= 65)) {
                result += String.valueOf(c).toLowerCase();
            } else if ((c <= 122) && (c >= 97)) {
                result += String.valueOf(c).toUpperCase();
            }
        }
        System.out.print(result);
    }
}
