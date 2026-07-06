package exercises.loops;
import java.util.Scanner;

public class BeeCrowd1079 {
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            double total = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("%.1f%n", total);
        }



        sc.close();

    }
}
