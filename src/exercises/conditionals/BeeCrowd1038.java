package exercises.conditionals;
import java.util.Scanner;

public class BeeCrowd1038 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double preco = 0;

        if (codigo == 1){
            preco = 4 * quantidade;
        } else if (codigo == 2){
            preco = 4.50 * quantidade;
        } else if (codigo == 3){
            preco = 5 * quantidade;
        } else if (codigo == 4){
            preco = 2.50 * quantidade;
        } else if (codigo == 5){
            preco = 1.50 * quantidade;
        } else {
            System.out.println("INSIRA UM VALOR VÁLIDO : 1 - 5");
        }

        System.out.printf("TOTAL = %.2f%n", preco);


        sc.close();


    }
}
