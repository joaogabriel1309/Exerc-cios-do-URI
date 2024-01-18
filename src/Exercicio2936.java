import java.util.Scanner;

public class Exercicio2936 {
    public static final int[] fPosition = { 300, 1500, 600, 1000, 150 };
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int result = 225;
        for (int i = 0; i < 5; i++) {
            result += scr.nextInt() * fPosition[i];
        }
        System.out.println(result);
    }
}
