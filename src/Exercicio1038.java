import java.util.Scanner;

public class Exercicio1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        double r = 0;
        switch (a) {
            case 1:
                r = b * 4.00;
                break;
            case 2:
                r = b * 4.50;
                break;
            case 3:
                r = b * 5.00;
                break;
            case 4:
                r = b * 2.00;
                break;
            case 5:
                r = b * 1.50;
                break;
        }
        System.out.printf("Total: R$ %.2f\n", r);
    }
}
