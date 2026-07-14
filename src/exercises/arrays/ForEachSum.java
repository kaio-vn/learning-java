package exercises.arrays;
import java.util.Scanner;

public class ForEachSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int[] numeros = {12, 8, 20, 15, 5};
        int soma = 0;

        for (int numero : numeros){
            soma = soma + numero;
        }
        System.out.println(soma);

        sc.close();




    }
}
