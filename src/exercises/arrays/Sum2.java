package exercises.arrays;
import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i <n ; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        System.out.print("VALORES =");

        for (int i = 0; i < n ; i++) {
            System.out.print(" " + vetor[i]);
        }

        System.out.println();

        double soma = 0;
        double media = 0;

        for (int i = 0; i < n ; i++) {
            soma = soma + vetor[i];
            media = soma / n;
        }

        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        sc.close();

    }
}
