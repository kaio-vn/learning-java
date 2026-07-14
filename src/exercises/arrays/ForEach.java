package exercises.arrays;
import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        String[] nomes = {"Kaio", "Maria", "João"};

        for (String nome : nomes) {
            System.out.println(nome);
        }

        sc.close();

    }
}
