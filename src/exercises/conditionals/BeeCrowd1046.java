package exercises.conditionals;
import java.util.Scanner;

public class BeeCrowd1046 {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int total = horaFinal - horaInicial;

        if (horaFinal > horaInicial){
            System.out.println("O jogo durou " + total + " hora(s)");
        }
        else {
            total = 24 + total;
            System.out.println("O jogo durou " + total + " hora(s)");
        }



        sc.close();

    }
}
