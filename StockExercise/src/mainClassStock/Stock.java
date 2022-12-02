package mainClassStock;
import auxilaryClassStock.Product;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);


        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();
        Product product = new Product(name, price, quantity);



        System.out.println("Product data: " + product);

        System.out.println("Enter the number of products to be added in stock : ");
        quantity = sc.nextInt();
        product.addProductQuantity(quantity);
        System.out.println("Updated data: " + product);

        System.out.println("Enter the number of products to be removed from the stock : ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("Updated data: " + product);












        sc.close();

    }
}
