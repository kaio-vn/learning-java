package beecrowd;
import java.util.Scanner;

public class BeeCrowd1017 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int horas = sc.nextInt();
        int vMedia = sc.nextInt();

        double total = ((double) (horas * vMedia)) / 12;

        System.out.printf("%.3f%n" , total);

        sc.close();


    }
}
