
import Exercicios.Aula119.Client;
import Exercicios.Aula119.Enums.OrderStatus;
import Exercicios.Aula119.Order;
import Exercicios.Aula119.OrderItem;
import Exercicios.Aula119.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main( String[] args ) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String clientName = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDate = sdf1.parse(scanner.next());
        System.out.println("Enter order data: ");
        scanner.nextLine();
        System.out.print("Status: ");
        String statusOrder = scanner.nextLine();
        System.out.print("How many items to this order: ");
        int quantityProducts = scanner.nextInt();
        scanner.nextLine();
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date orderMoment = new Date();
        Order order = new Order(new Client(clientName, email, birthDate), orderMoment, OrderStatus.valueOf(statusOrder));

        for (int i=0; i< quantityProducts; i++){
            System.out.println("Enter #" + (i+1) + " item data: ");
            System.out.print("Product Name: ");
            String productName = scanner.nextLine();
            System.out.print("Product price: ");
            Double productPrice = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            order.addItem( new OrderItem(productPrice, quantity, new Product(productName, productPrice)));
        }
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);




        scanner.close();
    }
}
