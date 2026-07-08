package exercises.arrays;
import java.util.Scanner;

public class Heights {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você quer digitar? ");

        int n = sc.nextInt();
        double soma = 0;
        double[] vetor = new double[n];

        for (int i=0; i<n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            soma = soma + vetor[i];
        }

        System.out.print("VALORES = ");

        double media = soma / n;

        for (int i = 0; i <n ; i++) {
            System.out.printf("%.1f ", vetor[i] );
        }

        System.out.printf("\nSOMA = %.2f\n", soma);
        System.out.printf("MEDIA = %.2f\n", media);

        sc.close();

    }
}
