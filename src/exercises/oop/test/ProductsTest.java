package exercises.oop.test;
import exercises.oop.domain.Products;
import exercises.conditionals.Product;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ProductsTest {
    static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        Products product = new Products();

        System.out.println("Enter product data: ");

        System.out.print("Name: ");
        product.name = sc.nextLine();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: $" + product.price + ", " + product.quantity + " units, Total: $" + product.totalValueInStock() );

        System.out.print("Enter the number of products to be added in stock: ");

        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.print("Updated data: " + product.name + " $" + product.price + " " + product.quantity + "Units, " +  "Total: $" + product.totalValueInStock());

        System.out.println();
        System.out.print("Enter the number of products to be removed from stock: ");

        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.print("Updated data: " + product.name + " $" + product.price + " " + product.quantity + "Units, " +  "Total: $" + product.totalValueInStock());

        sc.close();

    }
}
