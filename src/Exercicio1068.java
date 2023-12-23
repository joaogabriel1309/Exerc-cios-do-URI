import java.util.Scanner;

public class Exercicio1068 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        while (scr.hasNext()) {
            String fExpression = scr.nextLine();
            boolean fError = false;
            int fController = 0;
            for (int i = 0; i < fExpression.length(); i++) {
                char fCharacter = fExpression.charAt(i);
                if (fCharacter == ')') {
                    if (fController == 0) {
                        fError = true;
                        break;
                    }
                    fController--;
                } else if (fCharacter == '(') {
                    fController++;
                }
            }
            if (fError || fController > 0) {
                System.out.println("incorrect");
            } else {
                System.out.println("correct");
            }
        }
    }
}
