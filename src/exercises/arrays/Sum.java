package exercises.arrays;
import java.util.Scanner;

public class Sum {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar? ");

        int n = sc.nextInt();
        double [] vetor = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMERSOS NEGATIVOS: ");

        for (int i = 0; i <n; i++) {
            if (vetor[i] < 0){
                System.out.printf("%.1f%n", vetor[i]);
            }
        }



        sc.close();

    }
}
