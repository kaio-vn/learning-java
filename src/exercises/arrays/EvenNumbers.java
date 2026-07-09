package exercises.arrays;
import java.util.Scanner;

public class EvenNumbers {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Quantos números você vai digitar? ");

        int n = sc.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i <n ; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS PARES: ");

        int qtdPares = 0;

        for (int i = 0; i <n ; i++) {
            if (vetor[i] % 2 == 0){
                System.out.print(vetor[i] + " ");
                qtdPares++;
            }
        }

        System.out.print("\nQUANTIDADE DE PARES: " + qtdPares);

        sc.close();

    }
}
