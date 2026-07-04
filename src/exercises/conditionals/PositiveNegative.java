package exercises.conditionals;
import java.util.Scanner;

public class PositiveNegative {
    public static void main (String[] argsg){

        Scanner sc = new Scanner (System.in);

        int number = sc.nextInt();

        if (number < 0){
            System.out.println("NEGATIVO ");
        }
        else if (number == 0){
            System.out.println("NULO");
        }
        else {
            System.out.println("POSITIVO");
        }


        sc.close();

    }
}
