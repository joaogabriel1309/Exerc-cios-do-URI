import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio1010 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        int CodeSinsOne = sc.nextInt();
        int QuantityOne = sc.nextInt();
        double ValueSinsOne = sc.nextDouble();

        int CodeSinsTwo = sc.nextInt();
        int QuantityTwo = sc.nextInt();
        double ValueSinsTwo = sc.nextDouble();

        double Total = (QuantityOne*ValueSinsOne)+(QuantityTwo*ValueSinsTwo);

        System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", Total));
    }
}