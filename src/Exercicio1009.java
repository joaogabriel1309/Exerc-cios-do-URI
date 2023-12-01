import java.util.Scanner;

public class Exercicio1009 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String Name = scr.next();
        double FixedSalry = scr.nextDouble();
        double Sales = scr.nextDouble();
        double Bonus =  Sales * 0.15;
        double Total = FixedSalry + Bonus;
        System.out.println("TOTAL = R$ "+String.format("%2.2f", Total));
        scr.close();
    }
}
