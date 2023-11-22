/*

 QUESTÃO
 Leia um valor de ponto flutuante com duas casas decimais. Este valor
 representa um valor monetário. A seguir, calcule o menor número de notas
 e moedas possíveis no qual o valor pode ser decomposto. As notas
 consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são
 de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias.

 ENTRADA
 O arquivo de entrada contém um valor de ponto flutuante N (0 <= N <= 1000000.00).

 SAÍDA
 Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor
 inicial, conforme exemplo fornecido.

 Obs: Utilize ponto (.) para separar a parte decimal.

*/

import java.util.Locale;
import java.util.Scanner;

public class Exercicio1021 {
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
