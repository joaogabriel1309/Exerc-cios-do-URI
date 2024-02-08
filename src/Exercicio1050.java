import java.util.Scanner;

public class Exercicio1050 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int number[] = {61, 71, 11, 21, 32, 19, 27, 31};
        String city[] = {"Brasilia", "Salvador", "Sao Paulo", "Rio de Janeiro", "Juiz de Fora", "Campinas", "Vitoria", "Belo Horizonte"};
        int input = scr.nextInt();

        int controller = 0, i;
        for (i = 0; i < 8; i++) {
            if (input == number[i]) {
                System.out.println(city[i]);
            } else {
                controller++;
            }
        }
        if (i == controller) {
            System.out.printf("DDD nao cadastrado\n");
        }
    }
}
