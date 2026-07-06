package exercises.loops;
import java.util.Scanner;

public class BeeCrowd1116 {
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= N ; i++) {
            double a = sc.nextInt();
            double b = sc.nextInt();
            double divisao = a / b;

            if (b == 0){
                System.out.println("Divisão impossível");
            }
            else {
                System.out.printf("%.1f%n", divisao);
            }
        }


        sc.close();

    }
}
