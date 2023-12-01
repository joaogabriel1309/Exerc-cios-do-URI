import java.util.Scanner;

public class exercicio1047 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int StartHours = scr.nextInt();
        int StartMinute = scr.nextInt();
        int FinalHours = scr.nextInt();
        int FinalMinute = scr.nextInt();

        double result;

        if ((FinalMinute > StartMinute) && (StartHours == FinalHours)) {
            result = FinalMinute - StartMinute;
        }else{
            if ((StartMinute > FinalMinute) && (StartHours == FinalHours)){
                result = 1440 - (StartMinute - FinalMinute);
            }else{
                if (StartHours > FinalHours){
                    result = (long) (StartHours - FinalHours) * 60;
                    result = 1440 - result;
                    if (StartMinute > FinalMinute){
                        result = result - (StartMinute - FinalMinute);
                    }else{
                        result = result + (FinalMinute - StartMinute);
                    }
                }else{
                    result = (long) (FinalHours - StartHours) * 60;
                    if (StartMinute > FinalMinute){
                        result = result - (StartMinute - FinalMinute);
                    }else{
                        result = result + (FinalMinute - StartMinute);
                    }
                }
            }

            int resultHours = (int) (result / 60);
            int resultMinutes = (int) (result % 60);
            if ((StartHours == FinalHours) && (resultHours == 0)){
                resultHours = 24;
            }

            System.out.println("O JOGO DUROU "+ resultHours+ " HORA(S) E "+resultMinutes+" MINUTO(S)");
        }
    }
}
