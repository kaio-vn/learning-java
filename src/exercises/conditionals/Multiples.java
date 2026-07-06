package exercises.conditionals;
import java.util.Scanner;

public class Multiples {
    public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A % B == 0 || B % A == 0 ){
        System.out.println("São Múltiplos");
    }
    else {
        System.out.println("Não são múltiplos");
    }

    sc.close();



    }
}
