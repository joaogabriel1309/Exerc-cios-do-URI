import java.util.Scanner;

public class Exercicio1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fValue1 = sc.nextInt();
        int fValue2 = sc.nextInt();

        double result = 0;
        switch (fValue1) {
            case 1:
                result = fValue2 * 4.00;
                break;
            case 2:
                result = fValue2 * 4.50;
                break;
            case 3:
                result = fValue2 * 5.00;
                break;
            case 4:
                result = fValue2 * 2.00;
                break;
            case 5:
                result = fValue2 * 1.50;
                break;
            default:
                break;
        }
        System.out.printf("Total: R$ %.2f\n", result);

        sc.close();
    }
}
