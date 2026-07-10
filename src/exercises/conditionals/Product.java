package exercises.conditionals;
import java.util.Scanner;

public class Product {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Insert the product price, please: $");

        double price = sc.nextDouble();

        System.out.println("Which payment method?");
        System.out.println("1 - Cash (15% OFF) ");
        System.out.println("2 - Credit Card 1x (10% OFF) ");
        System.out.println("3 - Credit Card 2x ");
        System.out.println("4 - Credit Card 3x or more (+ 10% tax) ");

        int method = sc.nextInt();
        double total = 0;

        if (method == 1){
            total = price - (0.15 * price) ;
            System.out.printf("Total is: $%.2f%n ", total);
        }
        else if (method == 2){
            total = price - (0.10 * price);
            System.out.printf("Total is: $%.2f%n ", total);
        }
        else if (method == 3){
            total = price;
            System.out.printf("Total is: $%.2f%n ", total);
        }
        else if (method == 4){
            total = price + (0.10 * price);
            System.out.printf("Total is: $%.2f%n ", total);
        }

        sc.close();


    }
}
