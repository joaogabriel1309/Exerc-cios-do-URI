import java.util.Scanner;

public class Exercicio1051 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();
        if (salario > 0 && salario <= 2000) {
            System.out.print("Isento\n");
        } else if (salario <= 3000) {
            salario = salario - 2000;
            System.out.printf("R$ %.2f\n", (salario / 100) * 8);
        } else if (salario <= 4500) {
            salario = salario - 3000;
            System.out.printf("R$ %.2f\n", 80 + ((salario / 100) * 18));
        } else {
            salario = salario - 4500;
            System.out.printf("R$ %.2f\n", 350 + ((salario / 100) * 28));
        }
    }
}

