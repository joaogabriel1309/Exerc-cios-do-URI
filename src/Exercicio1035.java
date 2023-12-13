import java.util.Scanner;

public class Exercicio1035 {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int ValorA = scr.nextInt();
        int ValorB = scr.nextInt();
        int ValorC = scr.nextInt();
        int ValorD = scr.nextInt();
        if (ValorB > ValorC && ValorD > ValorA && (ValorC + ValorD) > (ValorA + ValorB) && ValorC > 0 && ValorD > 0 && ValorA % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
