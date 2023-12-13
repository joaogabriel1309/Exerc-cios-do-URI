import java.io.IOException;
import java.util.Scanner;

public class Exercicio1029 {
    
    private static int num_calls = 0;
    
    public static void main(String[] args) throws IOException {

        Scanner scr = new Scanner(System.in);

        int CaseTest = scr.nextInt();

        for(int i=0 ; i < CaseTest; i++)
        {
            int num = scr.nextInt();
            fibonacci(num);
            System.out.println("fib(" + num + ") = " + (num_calls - 1) + " calls = "+ fibonacci(num-1));
            num_calls = 0;
        }
    }

    public static int fibonacci(int num)
    {
        num_calls++;
        if (num < 2 )
        {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);

    }

}