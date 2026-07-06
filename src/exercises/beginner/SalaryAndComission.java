package exercises.beginner;
import java.util.Scanner;

public class SalaryAndComission {
    public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    String nome = sc.nextLine();
    double salario = sc.nextDouble();
    double totalVendas = sc.nextDouble();
    double totalSalario = (totalVendas * 0.15) + salario;

        System.out.printf("TOTAL = %.2f%n", totalSalario);


    sc.close();

    }
}
