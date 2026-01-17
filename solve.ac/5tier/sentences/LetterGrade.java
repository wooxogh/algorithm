//Quiz 2754
package sentences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterGrade {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String letter = br.readLine();
        char grade = letter.charAt(0);
        if (grade == 'F') {
            System.out.println(0.0);
            return;
        }
        char detail = letter.charAt(1);
        double result = 0;

        switch (grade) {
            case 'A':
                result += 4.0;
                break;
            case 'B':
                result += 3.0;
                break;
            case 'C':
                result += 2.0; 
                break; 
            case 'D':
                result += 1.0; 
                break;     
            default:
                result = 0;
                break;
        }

        switch (detail) {
            case '+':
                result += 0.3;
                break;
            case '-':
                result += -0.3;
                break;
            default:
                result += 0;
                break;
        }
        System.out.println(result);
    }
}
