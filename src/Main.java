import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Constantes para notas e moedas
        final double[] NOTAS_E_MOEDAS = {100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.50, 0.25, 0.10, 0.05, 0.01};

        int[] quantidade = new int[NOTAS_E_MOEDAS.length];

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double fEntrada = scanner.nextDouble();

        for (int i = 0; i < NOTAS_E_MOEDAS.length; i++) {
            while (fEntrada >= NOTAS_E_MOEDAS[i]) {
                fEntrada -= NOTAS_E_MOEDAS[i];
                quantidade[i]++;
                fEntrada = Math.round(fEntrada * 100.0) / 100.0;
            }
        }

        for (int i = 0; i < NOTAS_E_MOEDAS.length; i++) {
            if (i < 6) {
                if (i == 0)
                    System.out.println("NOTAS:");
                System.out.printf("%d nota(s) de R$ %.2f\n", quantidade[i], NOTAS_E_MOEDAS[i]);
            } else {
                if (i == 6)
                    System.out.println("MOEDAS:");
                System.out.printf("%d moeda(s) de R$ %.2f\n", quantidade[i], NOTAS_E_MOEDAS[i]);
            }
        }
        scanner.close();
    }
}