package exercises.conditionals;
import java.util.Scanner;


public class Conditionals01 {
    public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    int X = sc.nextInt();

    if (X % 2 == 0){
        System.out.println("PAR");
    }
    else {
        System.out.println("ÍMPAR");
    }

    sc.close();


    }
}
