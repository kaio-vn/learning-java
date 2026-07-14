package exercises.arrays;
import java.util.Scanner;

public class NumeroPar {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos numeros voce vai digitar? ");

        int n = sc.nextInt();
        int[] vetor = new int[n];
        int numerosPares = 0;


        for (int i = 0; i <n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES:");

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0){
                System.out.print( vetor[i] + " ");
                numerosPares++;
            }
        }

        System.out.println();
        System.out.print("QUANTIDADE DE PARES = " + numerosPares);

        sc.close();

    }
}
