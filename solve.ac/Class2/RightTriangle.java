//Quiz 4153

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RightTriangle {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if ((a == 0) && (b == 0) && (c ==0)) {
                return;
            }
            boolean flag = false;
            if ((a * a + b * b) == c * c) flag = true;
            if ((a * a + c * c) == b * b) flag = true;
            if ((c * c + b * b) == a * a) flag = true;
 
            if (flag == true) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }
    }
}
