//Quiz 30802

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WelcomeKit {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int people = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int tshirts = Integer.parseInt(st2.nextToken());
        int pencils = Integer.parseInt(st2.nextToken());

        int ts = 0;
        for (int i = 0; i < 6; i++) {
            int a = Integer.parseInt(st1.nextToken());
            ts += a / tshirts;
            if ((a % tshirts) > 0) {
                ts += 1;
            }
        }
        System.out.println(ts);
        System.out.println((people / pencils) + " " + (people % pencils));
    }
}

