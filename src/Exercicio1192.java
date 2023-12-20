import java.util.Scanner;

public class Exercicio1192 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int fNumero = scr.nextInt();
        for (int i = 0; i < fNumero; i++) {
            String linha = scr.next();
            int fPosition1 = Character.getNumericValue(linha.charAt(0));
            char fPosition2 = linha.charAt(1);
            int fPosition3 = Character.getNumericValue(linha.charAt(2));
            if (fPosition1 == fPosition3) {
                System.out.println(fPosition1 * fPosition3);
            } else if (Character.isUpperCase(fPosition2)) {
                System.out.println(fPosition3 - fPosition1);
            } else {
                System.out.println(fPosition1 + fPosition3);
            }
        }
    }
}
