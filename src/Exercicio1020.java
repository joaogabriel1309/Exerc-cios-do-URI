import java.io.IOException;import java.util.Locale;
import java.util.Scanner;

public class Exercicio1020 {

    public static void main(String[] args)  throws IOException {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        int Age,Year,Month;
        Age = sc.nextInt();

        if (Age >= 365){
            Year = Age / 365;
            Age = Age % 365;
            System.out.printf("%d ano(s)\n", Year);
        }
        else{
            System.out.printf("0 ano(s)\n");
        }

        if (Age >= 30){
            Month = Age / 30;
            Age = Age % 30;
            System.out.printf("%d mes(es)\n", Month);
        }
        else{
            System.out.printf("0 mes(es)\n");
        }

        System.out.printf("%d dia(s)\n", Age);

        sc.close();
    }
}